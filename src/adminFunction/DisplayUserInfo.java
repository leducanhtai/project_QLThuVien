//package adminFunction;
//
//import controller.LibraryManagementController;
//import model.Student;
//import model.StudentManagementModel;
//import view.LibraryManagementView;
//import view.MinimalScrollPane;
//import view.OvalButton;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class DisplayUserInfo {
//    private JTable studentTable;
//    private StudentManagementModel studentManagementModel;
//    private List<JPanel> wordPanels ;
//    private JPanel studentPanel;
//
//
//    public DisplayUserInfo() {
//        this.studentTable = new JTable();
//        this.studentManagementModel = new StudentManagementModel();
//        this.wordPanels = new ArrayList<>();
//    }
//
//    public void createUserInforTable() {
//
//        // Always recreate the table to ensure it displays the correct data
//        this.studentManagementModel.setStudents("src\\model\\data\\student.txt");
//        ArrayList<Student> studentList = this.studentManagementModel.getStudents();
//
//        studentPanel = new JPanel(new GridLayout(100, 1, 10, 10));
//        MinimalScrollPane.createMinimalScrollPane(studentPanel);
//        JScrollPane scrollPane = MinimalScrollPane.createMinimalScrollPane(studentPanel);
//
//        // Tạo các panel động dựa trên danh sách sinh viên
//        for (int i = 0; i < studentList.size(); i++) {
//            JPanel panel_word = createPanelWord(i, studentList.get(i));  // Truyền student vào createPanelWord
//            wordPanels.add(panel_word);  // Thêm panel vào danh sách
//            studentPanel.add(panel_word);  // Thêm panel vào giao diện
//        }
//    }
//
//    public JPanel createPanelWord(int index, Student student) {
//        JPanel jpanel_book = new JPanel(new BorderLayout(10, 10));
//        jpanel_book.setBackground(new Color(255, 255, 255));
//
//        JPanel panel_word = new JPanel();
//        panel_word.setBackground(new Color(255, 255, 255));
//        panel_word.setLayout(new GridLayout(1, 3, 10, 10));
//
//        // Sử dụng tên sinh viên thay vì chuỗi cố định
//        JMenuItem lblNewLabel = new JMenuItem(student.getFullName() );
//        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
//        lblNewLabel.setBackground(new Color(255, 255, 255));
//        lblNewLabel.setForeground(new Color(64, 0, 128));
//        jpanel_book.add(lblNewLabel, BorderLayout.CENTER);
//
//        JLabel lblNewLabel_1 = new JLabel("");
//        panel_word.add(lblNewLabel_1);
//
//        // Các nút Mượn, Trả, Xem giữ nguyên
//        JButton jbutton_borow = new OvalButton("Mượn");
//        jbutton_borow.setBackground(new Color(75,0,130));
//        jbutton_borow.setFont(new Font("Segoe UI", Font.ITALIC, 10));
//        jbutton_borow.setForeground(new Color(255, 255, 255));
//        jbutton_borow.setIcon(new ImageIcon("src\\view\\image\\plus.png"));
//        panel_word.add(jbutton_borow);
//
//        JButton jbotton_return = new OvalButton("Trả");
//        jbotton_return.setBackground(new Color(25,25,112));
//        jbotton_return.setFont(new Font("Tahoma", Font.ITALIC, 10));
//        jbotton_return.setForeground(new Color(255, 255, 255));
//        jbotton_return.setIcon(new ImageIcon("src\\view\\image\\minus.png"));
//        panel_word.add(jbotton_return);
//
//        JButton jbutton_see = new OvalButton("Xem");
//        jbutton_see.setBackground(new Color(25,25,112));
//        jbutton_see.setFont(new Font("Segoe UI", Font.ITALIC, 10));
//        jbutton_see.setForeground(new Color(255, 255, 255));
//        jbutton_see.setIcon(new ImageIcon("src\\view\\image\\see.png"));
//        panel_word.add(jbutton_see);
//
//        jpanel_book.add(panel_word, BorderLayout.EAST);
//
//        return jpanel_book;
//    }
//    public Student kiemTraUserByID(String libraryID) {
//        this.studentManagementModel.setStudents("src\\model\\data\\student.txt");
//        ArrayList<Student> students = this.studentManagementModel.getStudents();
//
//        for (Student student : students) {
//            if (student.getLibraryId().equals(libraryID)) {
//
//                return student;
//            }
//        }
//        return null;
//    }
//
//
//    public JPanel getStudentPanel() {
//        return studentPanel;
//    }
//    public void setStudentTable(JTable studentTable) {
//        this.studentTable = studentTable;
//    }
//
//}


