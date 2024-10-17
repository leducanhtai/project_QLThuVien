package view.sign_in_up;

import controller.LibraryManagementController;
import model.AdminManagementModel;
import model.AdminModel;
import model.Student;
import model.StudentManagementModel;
import view.LibraryManagementView;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SignIn extends JFrame {

    private static final long serialVersionUID = 1L;
    private final JLabel lblNewLabel_1;
    private JPanel contentPane;
    private JTextField jtextField_user_name;
    private JPasswordField passwordField;
    private StudentManagementModel studentManagementModel;
    //private LibraryManagementView libraryManagementView;
    public boolean check;
    public boolean getCheck() {
        return check;
    }
    public void setCheck(boolean check) {
        this.check = check;
    }

    //LibraryManagementController libraryManagementController = new LibraryManagementController(this);
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    SignIn frame = new SignIn(new LibraryManagementView());
                    frame.setVisible(true);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        });
    }



    /**
     * Create the frame.
     */
    public SignIn(LibraryManagementView libraryManagementView) {
        this.studentManagementModel = new StudentManagementModel();
        this.check = false;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1263, 880);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(1, 2, 0, 0));


        // Thay thế JPanel thông thường bằng BackgroundPanel
        JPanel panel = new BackgroundPanel("src\\view\\image\\backGround.jpg");
        contentPane.add(panel);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(208, 255, 232));
        contentPane.add(panel_1);
        panel_1.setLayout(null);


        jtextField_user_name = new JTextField();
        jtextField_user_name.setBounds(41, 276, 543, 79);
        panel_1.add(jtextField_user_name);
        jtextField_user_name.setColumns(10);


        passwordField = new JPasswordField();
        passwordField.setEchoChar('●');
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 30));
        passwordField.setBounds(41, 380, 543, 79);
        panel_1.add(passwordField);
        passwordField.setColumns(10);

        JPanel jpanel_signIn = new JPanel();
        jpanel_signIn.setBackground(new Color(0, 255, 64));
        jpanel_signIn.setBounds(163, 531, 288, 73);
        panel_1.add(jpanel_signIn);
        jpanel_signIn.setLayout(new BorderLayout(0, 0));

        JMenuItem jmenuItem_signIn = new JMenuItem("     SIGN IN");
        jmenuItem_signIn.setBackground(new Color(0, 255, 64));
        jmenuItem_signIn.setForeground(new Color(165, 209, 209));
        jmenuItem_signIn.setFont(new Font("Segoe UI", Font.BOLD, 30));
        jmenuItem_signIn.addActionListener(libraryManagementView.libraryManagementController);
        jmenuItem_signIn.addActionListener(e -> signInAction());
        jpanel_signIn.add(jmenuItem_signIn, BorderLayout.CENTER);

        JLabel lblNewLabel = new JLabel("Sign In");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
        lblNewLabel.setBounds(193, 115, 301, 100);
        panel_1.add(lblNewLabel);

        JPanel panel_2_1 = new JPanel();
        panel_2_1.setBackground(new Color(213, 213, 213));
        panel_2_1.setBounds(163, 637, 288, 73);
        panel_1.add(panel_2_1);
        panel_2_1.setLayout(new BorderLayout(0, 0));

        JMenuItem jenuItem_signup = new JMenuItem("     SIGN UP");
        jenuItem_signup.setBackground(new Color(213, 213, 213));
        jenuItem_signup.setFont(new Font("Segoe UI", Font.BOLD, 30));
        panel_2_1.add(jenuItem_signup, BorderLayout.CENTER);

        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setForeground(new Color(255, 0, 0));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1.setBounds(51, 469, 543, 29);
        panel_1.add(lblNewLabel_1);
    }

    public boolean checkDangNhap() {
        String enteredUsername = this.jtextField_user_name.getText();
        String enteredPassword = new String(this.passwordField.getPassword());

        this.studentManagementModel.setStudents("src\\model\\data\\student.txt");
        ArrayList<Student> studentList = studentManagementModel.getStudents();

        // Debugging output
        System.out.println("Entered username: " + enteredUsername);
        System.out.println("Entered password: " + enteredPassword);

        for (Student student : studentList) {
            System.out.println("Checking against username: " + student.getUsername() + " and password: " + student.getPassword());
            if (enteredUsername.equals(student.getUsername()) && enteredPassword.equals(student.getPassword())) {
                return true;  // Login successful
            }
        }

        return false;  // Login failed
    }

    public void closeLoginWindow() {
        this.dispose();
    }
    public void signInAction() {
        if (checkDangNhap()) {
            setCheck(true);
            closeLoginWindow();
        } else {
            this.lblNewLabel_1.setText("Tên đăng nhập hoặc mật khẩu sai");

        }
    }


}
