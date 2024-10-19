package view;

import javax.swing.*;
import java.awt.*;

public class EditUser {
    private AdminView adminView;
    public EditUser(AdminView adminView) {
        this.adminView = adminView;
    }
    public void editUser() {

        if(!this.adminView.view.changeModel.getChange_admin().equals("Borrowing User")) {
            this.adminView.view.changeModel.setChange_admin("Borrowing User");
            // Clear all components from the panel
            adminView.jpanel_admin_contenPane.removeAll();
            if(adminView.studentTable == null){
                this.adminView.view.displayUserInfo.createUserInforTable();
                this.adminView.studentTable = this.adminView.view.displayUserInfo.getStudentTable();

            }


            JButton jbutton_addUser = new OvalButton("Add");
            jbutton_addUser.setFont(new Font("Tahoma", Font.BOLD, 10));
            jbutton_addUser.setIcon(new ImageIcon("src\\view\\image\\plus.png"));
            jbutton_addUser.setForeground(new Color(255, 255, 255));
            jbutton_addUser.setBackground(new Color(0,100,0));

            JButton jbutton_removeUser = new OvalButton("Delete");
            jbutton_removeUser.setFont(new Font("Tahoma", Font.BOLD, 10));
            jbutton_removeUser.setIcon(new ImageIcon("src\\view\\image\\minus.png"));
            jbutton_removeUser.setForeground(new Color(255, 255, 255));
            jbutton_removeUser.setBackground(new Color(128,0,0));

            JButton jbutton_updateUser = new OvalButton("Update");
            jbutton_updateUser.setFont(new Font("Tahoma", Font.BOLD, 10));
            jbutton_updateUser.setIcon(new ImageIcon("src\\view\\image\\plus.png"));
            jbutton_updateUser.setForeground(new Color(255, 255, 255));
            jbutton_updateUser.setBackground(new Color(184,134,11));

            JLabel jlabel_kt = new JLabel("        ");
            jlabel_kt.setFont(new Font("Tahoma", Font.BOLD, 10));

            JLabel jlabel_kt2 = new JLabel("        ");
            jlabel_kt2.setFont(new Font("Tahoma", Font.BOLD, 10));

            JLabel jlabel_kt3 = new JLabel("        ");
            jlabel_kt3.setFont(new Font("Tahoma", Font.BOLD, 10));

            JLabel jlabel_kt4 = new JLabel("        ");
            jlabel_kt4.setFont(new Font("Tahoma", Font.BOLD, 10));

            JLabel jlabel_kt5 = new JLabel("");
            jlabel_kt4.setFont(new Font("Tahoma", Font.BOLD, 1));

            JLabel jlabel_kt6 = new JLabel("");
            jlabel_kt4.setFont(new Font("Tahoma", Font.BOLD, 1));



            JPanel jpanel_adminTool_editUser = new JPanel(new GridLayout(1,7, 5, 5));
            jpanel_adminTool_editUser.setBackground(new Color(64, 0, 128));
            jpanel_adminTool_editUser.add(jlabel_kt);
            jpanel_adminTool_editUser.add(jlabel_kt2);
            //jpanel_adminTool_editUser.add(jlabel_kt3);
            jpanel_adminTool_editUser.add(jbutton_addUser);
            jpanel_adminTool_editUser.add(jbutton_removeUser);
            jpanel_adminTool_editUser.add(jbutton_updateUser);
            jpanel_adminTool_editUser.add(jlabel_kt4);

            JPanel jpanel_adminTool_editUser_full = new JPanel(new BorderLayout(10, 10));
            jpanel_adminTool_editUser_full.setBackground(new Color(64, 0, 128));
            jpanel_adminTool_editUser_full.add(jpanel_adminTool_editUser, BorderLayout.CENTER);
            jpanel_adminTool_editUser_full.add(jlabel_kt, BorderLayout.SOUTH);
            jpanel_adminTool_editUser_full.add(jlabel_kt6, BorderLayout.NORTH);


            JScrollPane scrollPane = new JScrollPane(adminView.studentTable);
            adminView.jpanel_admin_contenPane.setLayout(new BorderLayout());
            //adminView.jpanel_admin_contenPane.add(jpanel_adminTool_editUser, BorderLayout.NORTH);
            adminView.searchUserView.jpanel_edit_user.add(jpanel_adminTool_editUser_full, BorderLayout.CENTER);
            adminView.jpanel_admin_contenPane.add(scrollPane, BorderLayout.CENTER);
            adminView.searchUser();

            adminView.jpanel_admin_contenPane.revalidate();
            adminView.jpanel_admin_contenPane.repaint();
        }

    }
}
