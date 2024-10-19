package view;

import javax.swing.*;
import java.awt.*;

public class SearchUserView {
    private AdminView adminView;
    private RoundButton jbutton_search_user;
    private RoundButton jbutton_filter_user;
    public JPanel jpanel_search_tool;
    public JPanel jpanel_edit_user;

    public SearchUserView(AdminView adminView) {
        this.adminView = adminView;
        jpanel_edit_user = new JPanel(new BorderLayout(10, 10));
    }

    public void searchUser() {

        jbutton_search_user = new RoundButton("",50);
        jbutton_search_user.setFont(new Font("Tahoma", Font.BOLD, 40));
        jbutton_search_user.setForeground(new Color(255, 255, 255));
        jbutton_search_user.setBackground(new Color(255,215,0));
        jbutton_search_user.setIcon(new ImageIcon("src\\view\\image\\search3.png"));
        jbutton_search_user.addActionListener(adminView.view.libraryManagementController);

        jbutton_filter_user = new RoundButton("",50);
        jbutton_filter_user.setFont(new Font("Tahoma", Font.BOLD, 14));
        jbutton_filter_user.setForeground(new Color(255, 255, 255));
        jbutton_filter_user.setBackground(new Color(75,0,130));
        jbutton_filter_user.setIcon(new ImageIcon("src\\view\\image\\filter.png"));
        jbutton_filter_user.addActionListener(adminView.view.libraryManagementController);

        adminView.jtextField_searchUser_byID = new OvalTextField(50);
        adminView.jtextField_searchUser_byID.setFont(new Font("Tahoma", Font.BOLD, 30));

//
//        JPanel jpanel_searchUser = new JPanel(new BorderLayout(10, 10));
//        jpanel_searchUser.setBackground(new Color(224,255,255));
//        JPanel jpanel_searchUserInfor = new JPanel(new GridLayout(1, 4, 10, 10));

        JPanel jpanel_search_user = new JPanel(new BorderLayout(10, 10));
        jpanel_search_user = new JPanel(new BorderLayout(10, 10));
        jpanel_search_user.setBackground(new Color(75,0,130));
        jpanel_search_user.add(adminView.jtextField_searchUser_byID, BorderLayout.CENTER);
        jpanel_search_user.add(this.jbutton_search_user , BorderLayout.EAST);
        jpanel_search_user.add(jbutton_filter_user, BorderLayout.WEST);



        JLabel jlabel_searchUser = new JLabel("");
        jlabel_searchUser.setFont(new Font("Tahoma", Font.BOLD, 30));
        jpanel_search_user.add(jlabel_searchUser, BorderLayout.NORTH);

        JLabel jlabel_searchUser2 = new JLabel("");
        jlabel_searchUser2.setFont(new Font("Tahoma", Font.BOLD, 30));
        jpanel_search_user.add(jlabel_searchUser2, BorderLayout.SOUTH);


//        JLabel jlabel_khtr = new JLabel("");
//        jpanel_searchUserInfor.add(jlabel_khtr);
//
//        // chỉ là phần tạo khoang trắng
//        JLabel jlabel ;
        JLabel jlabel = new JLabel(" ");
        jlabel.setFont(new Font("Tahoma", Font.BOLD, 10));



        jpanel_edit_user.setBackground(new Color(75,0,130));

        jpanel_search_tool= new JPanel(new GridLayout(1,2));
        jpanel_search_tool.setBackground(new Color(75,0,130));
        jpanel_search_tool.add(jpanel_search_user);
        jpanel_search_tool.add(jpanel_edit_user);



        adminView.jpanel_admin_contenPane.add(jpanel_search_tool, BorderLayout.NORTH);
    }

}
