package view;

import model.Student;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ProfileUser {
    private AdminView adminView;
    private JPanel contentPane_profileUser;
    private JTable jtable_soSachMuon;
    public ProfileUser(AdminView admin) {
        this.adminView = admin;
    }
    public void profileuser(Student student) {

        contentPane_profileUser = new JPanel();
        contentPane_profileUser.setBackground(new Color(224,255,255));
        contentPane_profileUser.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane_profileUser.setLayout(null); // Setting layout

        JPanel jpanel_anh = new JPanel();
        jpanel_anh.setBackground(new Color(192, 192, 192));
        jpanel_anh.setBounds(42, 34, 248, 321);
        contentPane_profileUser.add(jpanel_anh);

        JLabel jlabel_profileUser_ten = new JLabel("Họ và tên: "+student.getFullName());
        jlabel_profileUser_ten.setFont(new Font("Tahoma", Font.BOLD, 30));
        jlabel_profileUser_ten.setBounds(327, 38, 485, 53);
        contentPane_profileUser.add(jlabel_profileUser_ten);

        JLabel jlabel_profileUser_id = new JLabel("Mã thư viện: "+student.getLibraryId());
        jlabel_profileUser_id.setFont(new Font("Tahoma", Font.BOLD, 30));
        jlabel_profileUser_id.setBounds(327, 101, 485, 53);
        contentPane_profileUser.add(jlabel_profileUser_id);

        JLabel jlabel_profileUser_sdt = new JLabel("Số điện thoại: "+student.getPhone());
        jlabel_profileUser_sdt.setFont(new Font("Tahoma", Font.BOLD, 30));
        jlabel_profileUser_sdt.setBounds(327, 177, 524, 53);
        contentPane_profileUser.add(jlabel_profileUser_sdt);

        JLabel jlabel_profileUser_email = new JLabel("email: "+student.getEmail());
        jlabel_profileUser_email.setFont(new Font("Tahoma", Font.BOLD, 30));
        jlabel_profileUser_email.setBounds(327, 252, 623, 53);
        contentPane_profileUser.add(jlabel_profileUser_email);

        JLabel jlabel_profileUser_soSachMuon = new JLabel("Danh sách đang mượn:");
        jlabel_profileUser_soSachMuon.setFont(new Font("Tahoma", Font.BOLD, 30));
        jlabel_profileUser_soSachMuon.setBounds(42, 386, 485, 53);
        contentPane_profileUser.add(jlabel_profileUser_soSachMuon);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(224,255,255));
        panel_1.setBounds(42, 449, 1176, 299);
        contentPane_profileUser.add(panel_1);
        panel_1.setLayout(new BorderLayout(0, 0));

        jtable_soSachMuon = new JTable();
        JScrollPane jscrollPane_soSachMuon = new JScrollPane(jtable_soSachMuon);
        panel_1.add(jscrollPane_soSachMuon, BorderLayout.CENTER);

        adminView.jpanel_admin_contenPane.add(contentPane_profileUser);
        adminView.jpanel_admin_contenPane.revalidate();
        adminView.jpanel_admin_contenPane.repaint();

    }
}
