package view;

import javax.swing.*;
import java.awt.*;

public class SearchUserView {
    private AdminView adminView;
    public SearchUserView(AdminView adminView) {
        this.adminView = adminView;
    }

    public void searchUser() {
        JPanel jpanel_searchUser = new JPanel(new BorderLayout());
        jpanel_searchUser.setBackground(new Color(208, 255, 208));
        JPanel jpanel_searchUserInfor = new JPanel(new GridLayout(1, 4, 10, 10));
        jpanel_searchUserInfor.setBackground(new Color(208, 255, 208));

        adminView.jtextField_searchUser_byID = new JTextField();
        adminView.jtextField_searchUser_byID.setFont(new Font("Tahoma", Font.BOLD, 30));
        jpanel_searchUserInfor.add(adminView.jtextField_searchUser_byID);

        JLabel jlabel_searchUser = new JLabel("NHập ID");
        jlabel_searchUser.setFont(new Font("Tahoma", Font.BOLD, 30));
        jpanel_searchUserInfor.add(jlabel_searchUser);

        JPanel jpanel_clickSearchUser = new JPanel(new BorderLayout());
        jpanel_clickSearchUser.setBackground(new Color(0,191,255));
        JMenuItem jmenu_item_search_user = new JMenuItem("Search User");
        jmenu_item_search_user.setFont(new Font("Tahoma", Font.BOLD, 30));
        jmenu_item_search_user.setIcon(new ImageIcon("src\\view\\image\\search_user.png"));
        adminView.view.addHoverEffect(jmenu_item_search_user);
        jmenu_item_search_user.addActionListener(adminView.view.libraryManagementController);
        jpanel_clickSearchUser.add(jmenu_item_search_user, BorderLayout.CENTER);
        jpanel_searchUserInfor.add(jpanel_clickSearchUser);

        JLabel jlabel_khtr = new JLabel("");
        jpanel_searchUserInfor.add(jlabel_khtr);

        // chỉ là phần tạo khoang trắng
        JLabel jlabel ;
        jlabel = new JLabel(" ");
        jlabel.setFont(new Font("Tahoma", Font.BOLD, 100));
        jlabel.setBackground(new Color(0, 128, 64));


        jpanel_searchUser.add(jpanel_searchUserInfor, BorderLayout.NORTH);
        jpanel_searchUser.add(jlabel, BorderLayout.CENTER);

        adminView.jpanel_admin_contenPane.add(jpanel_searchUser, BorderLayout.SOUTH);
    }

}
