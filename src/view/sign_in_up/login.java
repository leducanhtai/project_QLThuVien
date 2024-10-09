package view.sign_in_up;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JPasswordField passwordField;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
//                try {
//                    login frame = new login();
//                    frame.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    login frame = new login();
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
    public login() {
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


        textField = new JTextField();
        textField.setBounds(41, 276, 543, 79);
        panel_1.add(textField);
        textField.setColumns(10);



        passwordField = new JPasswordField();
        passwordField.setEchoChar('●');
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 30));
        passwordField.setBounds(41, 380, 543, 79);
        panel_1.add(passwordField);
        passwordField.setColumns(10);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(0, 255, 64));
        panel_2.setBounds(163, 531, 288, 73);
        panel_1.add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));

        JMenuItem mntmNewMenuItem = new JMenuItem("     SIGN IN");
        mntmNewMenuItem.setBackground(new Color(0, 255, 64));
        mntmNewMenuItem.setForeground(new Color(165, 209, 209));
        mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 30));
        panel_2.add(mntmNewMenuItem, BorderLayout.CENTER);

        JLabel lblNewLabel = new JLabel("Sign In");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
        lblNewLabel.setBounds(193, 115, 301, 100);
        panel_1.add(lblNewLabel);

        JPanel panel_2_1 = new JPanel();
        panel_2_1.setBackground(new Color(213, 213, 213));
        panel_2_1.setBounds(163, 637, 288, 73);
        panel_1.add(panel_2_1);
        panel_2_1.setLayout(new BorderLayout(0, 0));

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("     SIGN UP");
        mntmNewMenuItem.setBackground(new Color(213, 213, 213));
        mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 30));
        panel_2_1.add(mntmNewMenuItem_1, BorderLayout.CENTER);

        JLabel lblNewLabel_1 = new JLabel("Tên đăng nhập hoặc mật khẩu sai");
        lblNewLabel_1.setForeground(new Color(255, 0, 0));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1.setBounds(51, 469, 543, 29);
        panel_1.add(lblNewLabel_1);
    }
}
