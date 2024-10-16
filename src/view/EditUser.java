package view;

import javax.swing.*;
import java.awt.*;

public class EditUser {
    private AdminView adminView;
    public EditUser(AdminView adminView) {
        this.adminView = adminView;
    }
    public void editUser() {

        if(!this.adminView.view.changeModel.getChange_admin().equals("Edit User")) {
            this.adminView.view.changeModel.setChange_admin("Edit User");
            // Clear all components from the panel
            adminView.jpanel_admin_contenPane.removeAll();
            if(adminView.studentTable == null){
                this.adminView.view.displayUserInfo.createUserInforTable();
                this.adminView.studentTable = this.adminView.view.displayUserInfo.getStudentTable();

            }

            JPanel jpanel_adminTool_addUser = new JPanel(new FlowLayout());
            jpanel_adminTool_addUser.setBackground(new Color(124,252,0));
            JMenuItem jmenuItem_addUser = new JMenuItem("Add");
            jmenuItem_addUser.setFont(new Font("Tahoma", Font.BOLD, 20));
            jpanel_adminTool_addUser.add(jmenuItem_addUser);

            JPanel jpanel_adminTool_removeUser = new JPanel(new FlowLayout());
            jpanel_adminTool_removeUser.setBackground(new Color(255,99,71));
            JMenuItem jmenuItem_removeUser = new JMenuItem("Delete");
            jmenuItem_removeUser.setFont(new Font("Tahoma", Font.BOLD, 20));
            jpanel_adminTool_removeUser.add(jmenuItem_removeUser);

            JPanel jpanel_adminTool_updateUser = new JPanel(new FlowLayout());
            jpanel_adminTool_updateUser.setBackground(new Color(222,184,135));
            JMenuItem jmenuItem_updateUser = new JMenuItem("Update");
            jmenuItem_updateUser.setFont(new Font("Tahoma", Font.BOLD, 20));
            jpanel_adminTool_updateUser.add(jmenuItem_updateUser);

            JLabel jlabel_kt = new JLabel("        ");
            jlabel_kt.setFont(new Font("Tahoma", Font.BOLD, 14));

            JLabel jlabel_kt2 = new JLabel("        ");
            jlabel_kt2.setFont(new Font("Tahoma", Font.BOLD, 14));

            JLabel jlabel_kt3 = new JLabel("        ");
            jlabel_kt3.setFont(new Font("Tahoma", Font.BOLD, 14));

            JLabel jlabel_kt4 = new JLabel("        ");
            jlabel_kt4.setFont(new Font("Tahoma", Font.BOLD, 14));



            JPanel jpanel_adminTool_editUser = new JPanel(new GridLayout(1,7, 5, 5));
            jpanel_adminTool_editUser.setBackground(new Color(208, 255, 208));
            jpanel_adminTool_editUser.add(jpanel_adminTool_addUser);
            jpanel_adminTool_editUser.add(jpanel_adminTool_removeUser);
            jpanel_adminTool_editUser.add(jpanel_adminTool_updateUser);
            jpanel_adminTool_editUser.add(jlabel_kt);
            jpanel_adminTool_editUser.add(jlabel_kt2);
            jpanel_adminTool_editUser.add(jlabel_kt3);
            jpanel_adminTool_editUser.add(jlabel_kt4);


            JScrollPane scrollPane = new JScrollPane(adminView.studentTable);
            adminView.jpanel_admin_contenPane.setLayout(new BorderLayout());
            adminView.jpanel_admin_contenPane.add(jpanel_adminTool_editUser, BorderLayout.NORTH);
            adminView.jpanel_admin_contenPane.add(scrollPane, BorderLayout.CENTER);
            adminView.searchUser();

            adminView.jpanel_admin_contenPane.revalidate();
            adminView.jpanel_admin_contenPane.repaint();
        }

    }
}
