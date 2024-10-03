package adminFunction;

import model.AdminModel;
import view.DictionaryView;

import javax.swing.*;
import java.awt.*;

public class Login extends AdminFunction {
    public Login(DictionaryView dictionaryview) {
        super(dictionaryview);
    }
    // phần đăng nhập cho admin
    public void dangNhap(){

        this.dictionaryView.jtextField_tenDangNhap = new JTextField();
        this.dictionaryView.jtextField_tenDangNhap.setFont(new Font("Tahoma", Font.BOLD, 30));

        this.dictionaryView.jtextField_matKhau = new JTextField();
        this.dictionaryView.jtextField_matKhau.setFont(new Font("Tahoma", Font.BOLD, 30));

        this.dictionaryView.jlabel_tenDangNhap = new JLabel("Tên đăng nhập");
        this.dictionaryView.jlabel_tenDangNhap.setFont(new Font("Tahoma", Font.BOLD, 30));

        this.dictionaryView.jlabel_matKhau = new JLabel("Mật khẩu");
        this.dictionaryView.jlabel_matKhau.setFont(new Font("Tahoma", Font.BOLD, 30));

        this.dictionaryView.jLabel_checkDangNhap = new JLabel("");
        this.dictionaryView.jLabel_checkDangNhap.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.dictionaryView.jLabel_checkDangNhap.setForeground(new Color(255,0,0));

        this.dictionaryView.jmenu_item_DangNhap = new JMenuItem("Đăng nhập");
        this.dictionaryView.jmenu_item_DangNhap.setFont(new Font("Tahoma", Font.BOLD, 40));
        this.dictionaryView.jmenu_item_DangNhap.setForeground(new Color(255, 255, 255));
        this.dictionaryView.jmenu_item_DangNhap.addActionListener(this.dictionaryView.dictionaryController);

        JPanel jpanel_khoangTrong_1 = new JPanel(new BorderLayout());
        jpanel_khoangTrong_1.setBackground(new Color(154,205,50));
        JLabel jlabel_14 = new JLabel("        ");
        jlabel_14.setFont(new Font("Tahoma", Font.BOLD, 80));
        //jlabel_14.setBackground(new Color(154,205,50));
        jpanel_khoangTrong_1.add(jlabel_14, BorderLayout.CENTER);

        JPanel jpanel_khoangTrong_2 = new JPanel(new BorderLayout());
        jpanel_khoangTrong_2.setBackground(new Color(154,205,50));
        JLabel jlabel_15 = new JLabel("        ");
        jlabel_15.setFont(new Font("Tahoma", Font.BOLD, 80));
        //jlabel_14.setBackground(new Color(0,205,50));
        jpanel_khoangTrong_2.add(jlabel_15, BorderLayout.CENTER);

        JPanel jpanel_khoangTrong_3 = new JPanel(new BorderLayout());
        jpanel_khoangTrong_3.setBackground(new Color(154,205,50));
        JLabel jlabel_16 = new JLabel("        ");
        jlabel_16.setFont(new Font("Tahoma", Font.BOLD, 80));
        //jlabel_14.setBackground(new Color(154,205,50));
        jpanel_khoangTrong_3.add(jlabel_16, BorderLayout.CENTER);

        JPanel jpanel_khoangTrong_4 = new JPanel(new BorderLayout());
        jpanel_khoangTrong_4.setBackground(new Color(154,205,50));
        JLabel jlabel_17 = new JLabel("        ");
        jlabel_17.setFont(new Font("Tahoma", Font.BOLD, 80));
        //jlabel_14.setBackground(new Color(154,205,50));
        jpanel_khoangTrong_4.add(jlabel_17, BorderLayout.CENTER);


        this.dictionaryView.jpanel_noiDung_DangNhap = new JPanel(new GridLayout(5, 2, 10, 10));
        this.dictionaryView.jpanel_noiDung_DangNhap.setBackground(new Color(154,205,50));
        this.dictionaryView.jpanel_noiDung_DangNhap.add(this.dictionaryView.jlabel_1);
        this.dictionaryView.jpanel_noiDung_DangNhap.add(this.dictionaryView.jlabel_2);

        this.dictionaryView.jpanel_noiDung_DangNhap.add(this.dictionaryView.jtextField_tenDangNhap);
        this.dictionaryView.jpanel_noiDung_DangNhap.add(this.dictionaryView.jlabel_tenDangNhap);
        this.dictionaryView.jpanel_noiDung_DangNhap.add(this.dictionaryView.jtextField_matKhau);
        this.dictionaryView.jpanel_noiDung_DangNhap.add(this.dictionaryView.jlabel_matKhau);
        this.dictionaryView.jpanel_noiDung_DangNhap.add(this.dictionaryView.jLabel_checkDangNhap);
        this.dictionaryView.jpanel_noiDung_DangNhap.add(this.dictionaryView.jlabel_9);

//        jpanel_noiDung_DangNhap.add(jlabel_11);
//        jpanel_noiDung_DangNhap.add(jlabel_10);


        this.dictionaryView.jpanel_click_DangNhap = new JPanel(new BorderLayout());
        this.dictionaryView.jpanel_click_DangNhap.setBackground(new Color(75,0,130));
        //jpanel_click_DangNhap.add(jLabel_checkDangNhap, BorderLayout.NORTH);
        this.dictionaryView.jpanel_click_DangNhap.add(this.dictionaryView.jmenu_item_DangNhap, BorderLayout.CENTER);
        this.dictionaryView.jpanel_click_DangNhap.add(jpanel_khoangTrong_1, BorderLayout.NORTH);
        this.dictionaryView.jpanel_click_DangNhap.add(jpanel_khoangTrong_3, BorderLayout.EAST);
        this.dictionaryView.jpanel_click_DangNhap.add(jpanel_khoangTrong_2, BorderLayout.WEST);
        this.dictionaryView.jpanel_click_DangNhap.add(jpanel_khoangTrong_4, BorderLayout.SOUTH);

        this.dictionaryView.jpanel_DangNhap = new JPanel(new BorderLayout());
        this.dictionaryView.jpanel_DangNhap.setBackground(new Color(154,205,50));
        this.dictionaryView.jpanel_DangNhap.add(this.dictionaryView.jpanel_noiDung_DangNhap, BorderLayout.CENTER);
        this.dictionaryView.jpanel_DangNhap.add(this.dictionaryView.jpanel_click_DangNhap, BorderLayout.SOUTH);

        this.dictionaryView.jlabel_4 = new JLabel("       ");
        this.dictionaryView.jlabel_4.setFont(new Font("Tahoma", Font.BOLD, 80));
        this.dictionaryView.jlabel_4.setBackground(new Color(0, 128, 64));

        this.dictionaryView.jlabel_5 = new JLabel("       ");
        this.dictionaryView.jlabel_5.setFont(new Font("Tahoma", Font.BOLD, 80));
        this.dictionaryView.jlabel_5.setBackground(new Color(0, 128, 64));

        this.dictionaryView.jlabel_6 = new JLabel("       ");
        this.dictionaryView.jlabel_6.setFont(new Font("Tahoma", Font.BOLD, 80));
        this.dictionaryView.jlabel_6.setBackground(new Color(0, 128, 64));

        this.dictionaryView.jlabel_7 = new JLabel("        ");
        this.dictionaryView.jlabel_7.setFont(new Font("Tahoma", Font.BOLD, 80));
        this.dictionaryView.jlabel_7.setBackground(new Color(0, 128, 64));

//        this.jlabel_13 = new JLabel("        ");
//        this.jlabel_13.setFont(new Font("Tahoma", Font.BOLD, 80));
//        this.jlabel_13.setBackground(new Color(0, 128, 64));
//
        this.dictionaryView.contentPane.add(dictionaryView.jlabel_7, BorderLayout.NORTH);
        this.dictionaryView.contentPane.add(dictionaryView.jlabel_6, BorderLayout.EAST);
        this.dictionaryView.contentPane.add(dictionaryView.jlabel_5, BorderLayout.WEST);
        this.dictionaryView.contentPane.add(dictionaryView.jlabel_4, BorderLayout.SOUTH);
        this.dictionaryView.contentPane.add(dictionaryView.jpanel_DangNhap, BorderLayout.CENTER);
    }

    public boolean checkDangNhap(){
        String tenAdmin = this.dictionaryView.jtextField_tenDangNhap.getText();
        String matKhau = this.dictionaryView.jtextField_matKhau.getText();
        this.dictionaryView.adminModel.adminModelList = this.dictionaryView.adminModel.setAdminModelList();
        for(int i = 0; i<dictionaryView.adminModel.adminModelList.size(); i++){
            AdminModel admin = dictionaryView.adminModel.adminModelList.get(i);

            // Kiểm tra xem tenAdmin và matKhau có khớp không
            if (tenAdmin.equals(admin.getTenDangNhap()) && matKhau.equals(admin.getMatKhau())) {
                return true; // Đăng nhập thành công
            }
        }
        return false;
    }
    public void selectAdmin() {
        this.dictionaryView.clearPanel();
        this.dictionaryView.setColorTool(this.dictionaryView.change);
        this.dictionaryView.change = "Admin";
        this.dictionaryView.jmenu_item_Admin.setForeground(new Color(64, 0, 128));
        this.dictionaryView.jpanel_Admin.setBackground(new Color(154,205,50));

        dangNhap();

        // Cập nhật lại giao diện
        this.dictionaryView.contentPane.revalidate();
        this.dictionaryView.contentPane.repaint();

    }

}
