package adminFunction;

import controller.LibraryManagementController;
import model.Student;
import model.StudentManagementModel;
import view.LibraryManagementView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DisplayUserInfo {
    private JTable studentTable;
    private StudentManagementModel studentManagementModel;

    public DisplayUserInfo() {
        this.studentTable = new JTable();
        this.studentManagementModel = new StudentManagementModel();
    }

    public void createUserInforTable() {

            // Always recreate the table to ensure it displays the correct data
            this.studentManagementModel.setStudents("src\\model\\data\\student.txt");
            ArrayList<Student> students = this.studentManagementModel.getStudents();

            // Define column names and populate table data
            String[] columnNames = {"Full Name", "Library ID", "Username", "Password", "Email", "Phone", "Age"};
            Object[][] data = new Object[students.size()][columnNames.length];

            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                data[i][0] = student.getFullName();
                data[i][1] = student.getLibraryId();
                data[i][2] = student.getUsername();
                data[i][3] = student.getPassword();
                data[i][4] = student.getEmail();
                data[i][5] = student.getPhone();
                data[i][6] = student.getSoSachMuon();
            }

            studentTable = new JTable(data, columnNames);
            studentTable.setFillsViewportHeight(true);

            Font tableFont = new Font("Arial", Font.PLAIN, 16);  // Set font and size (e.g., 16pt)
            studentTable.setFont(tableFont);
            studentTable.setRowHeight(50);

    }
    public Student kiemTraUserByID(String libraryID) {
        this.studentManagementModel.setStudents("src\\model\\data\\student.txt");
        ArrayList<Student> students = this.studentManagementModel.getStudents();

        for (Student student : students) {
            if (student.getLibraryId().equals(libraryID)) {

                return student;
            }
        }
        return null;
    }


    public JTable getStudentTable() {
        return studentTable;
    }
    public void setStudentTable(JTable studentTable) {
        this.studentTable = studentTable;
    }

}
