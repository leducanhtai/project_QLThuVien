package adminFunction;

import controller.LibraryManagementController;
import model.Student;
import model.StudentManagementModel;
import view.LibraryManagementView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DisplayUserInfo extends AdminFunction {

    private JMenuItem jmenuItem_displayUserInfor;
    private StudentManagementModel studentManagementModel;
    private JTable studentTable;
    private Login login;

    public DisplayUserInfo(LibraryManagementView libraryManagementView) {
        super(libraryManagementView);
        login = new Login(libraryManagementView);
    }

    public void displayUserInfo() {
        ArrayList<Student> students = this.studentManagementModel.setStudents("src\\model\\data\\student.txt");

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
        JScrollPane scrollPane = new JScrollPane(studentTable);

        login.jpanel_admin_contenPane.removeAll();
        login.jpanel_admin_contenPane.setLayout(new BorderLayout());

        // Add the scrollPane (containing the JTable) to the center of jpanel_admin_contenPane
        login.jpanel_admin_contenPane.add(scrollPane, BorderLayout.CENTER);

        // Refresh the panel to show the new content
        login.jpanel_admin_contenPane.revalidate();
        login.jpanel_admin_contenPane.repaint();

    }

}
