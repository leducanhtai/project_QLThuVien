package view.sign_in_up;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class singup extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;
    private JPasswordField passwordField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    singup frame = new singup();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public singup() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1263, 880);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(1, 2, 0, 0));

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(208, 255, 232));
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 30));
        textField.setBounds(41, 227, 543, 79);
        panel_1.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setEchoChar('●');
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 30));
        passwordField.setBounds(41, 316, 543, 79);
        panel_1.add(passwordField);
        passwordField.setColumns(10);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(0, 255, 64));
        panel_2.setBounds(162, 631, 288, 73);
        panel_1.add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));

        JLabel lblNewLabel = new JLabel("Create Account");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
        lblNewLabel.setBounds(78, 34, 481, 100);
        panel_1.add(lblNewLabel);


        JPanel panel = new JPanel();
        contentPane.add(panel);


        passwordField_1 = new JPasswordField();
        passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        passwordField_1.setEchoChar('●');
        passwordField_1.setColumns(10);
        passwordField_1.setBounds(41, 405, 543, 79);
        panel_1.add(passwordField_1);

        JMenuItem mntmNewMenuItem = new JMenuItem("     SIGN IN");
        mntmNewMenuItem.setBounds(163, 642, 288, 73);
        panel_2.add(mntmNewMenuItem, BorderLayout.CENTER);
        mntmNewMenuItem.setBackground(new Color(0, 255, 64));
        mntmNewMenuItem.setForeground(new Color(165, 209, 209));
        mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 30));
        mntmNewMenuItem.setBackground(new Color(213, 213, 213));

        passwordField_2 = new JPasswordField();
        passwordField_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
        passwordField_2.setEchoChar('●');
        passwordField_2.setColumns(10);
        passwordField_2.setBounds(41, 494, 543, 79);
        panel_1.add(passwordField_2);
    }
}
