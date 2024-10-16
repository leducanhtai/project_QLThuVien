package view;

import model.Student;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class AdminView {
    public LibraryManagementView view;
    private JPanel panel_main;
    private JMenuItem jmenuItem_displayUserInfor;
    private JPanel jpanel_adminTool_displayUserInfor;
    private JMenuItem jmenuItem_addUser;
    private JMenuItem jmenuItem_displayDocument;
    private JMenuItem jmenuItem_borrowDocument;
    public JPanel jpanel_admin_contenPane;
    public JTable studentTable;
    public JTextField jtextField_searchUser_byID;

    //các chức năng trong admin
    public EditUser editUser;
    public SearchUserView searchUserView;
    public ProfileUser profileUser;

    public AdminView(LibraryManagementView view) {
        this.view = view;
        this.panel_main = new JPanel();

        this.editUser = new EditUser(this);
        this.searchUserView = new SearchUserView(this);
        this.profileUser = new ProfileUser(this);
    }
    public void selectAdmin() {
        view.clearPanel();
        this.view.setColorTool(this.view.change);
        this.view.change = "Admin";
        this.view.jmenu_item_Admin.setForeground(new Color(64, 0, 128));
        this.view.jpanel_Admin.setBackground(new Color(154,205,50));

        dangNhap();

        // Cập nhật lại giao diện
        this.view.contentPane.revalidate();
        this.view.contentPane.repaint();

    }
    public void dangNhap(){
        panel_main.setBackground(new Color(213, 255, 213));
        panel_main.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 255, 0));
        panel.setBounds(339, 247, 278, 89);
        panel_main.add(panel);
        panel.setLayout(new BorderLayout(0, 0));

        JMenuItem mntmNewMenuItem = new JMenuItem("Đăng nhập");
        mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 30));
        mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Documents\\GitHub\\project_QLThuVien\\src\\view\\image\\login.png"));
        mntmNewMenuItem.setBackground(new Color(0, 255, 0));
        mntmNewMenuItem.addActionListener(view.libraryManagementController);
        panel.add(mntmNewMenuItem);

        JLabel lblNewLabel = new JLabel("Hãy đăng nhập với tài khoản của admin để sử dụng chức năng này");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(157, 357, 715, 65);
        panel_main.add(lblNewLabel);


        view.addHoverEffect(mntmNewMenuItem);
        this.view.contentPane.add(panel_main, BorderLayout.CENTER);
    }

    public void adminTool(){
        view.clearPanel();

        this.view.setColorTool(this.view.change);
        this.view.change = "Admin";
        this.view.jmenu_item_Admin.setForeground(new Color(64, 0, 128));
        this.view.jpanel_Admin.setBackground(new Color(154,205,50));

        jpanel_adminTool_displayUserInfor = new JPanel(new FlowLayout());
        jpanel_adminTool_displayUserInfor.setBackground(new Color(250,128,114));
        jmenuItem_displayUserInfor = new JMenuItem("UserInfor");
        jmenuItem_displayUserInfor.setFont(new Font("Tahoma", Font.BOLD, 20));
        jmenuItem_displayUserInfor.setIcon(new ImageIcon("src\\view\\image\\user.png"));
        jmenuItem_displayUserInfor.addActionListener(view.libraryManagementController);
        jpanel_adminTool_displayUserInfor.add(jmenuItem_displayUserInfor);

        //Display Document  displayDocument
        JPanel jpanel_adminTool_displayDocument = new JPanel(new FlowLayout());
        jpanel_adminTool_displayDocument.setBackground(new Color(173,216,230));
        jmenuItem_displayDocument = new JMenuItem("Document");
        jmenuItem_displayDocument.setFont(new Font("Tahoma", Font.BOLD, 20));
        jmenuItem_displayDocument.setIcon(new ImageIcon("src\\view\\image\\document.png"));
        jmenuItem_displayDocument.addActionListener(view.libraryManagementController);
        jpanel_adminTool_displayDocument.add(jmenuItem_displayDocument);

        // Add User  addUser
        JPanel jpanel_adminTool_addUser = new JPanel(new FlowLayout());
        jpanel_adminTool_addUser.setBackground(new Color(144,238,144));
        jmenuItem_addUser = new JMenuItem("Edit User");
        jmenuItem_addUser.setFont(new Font("Tahoma", Font.BOLD, 20));
        jmenuItem_addUser.setIcon(new ImageIcon("src\\view\\image\\editUser.png"));
        jmenuItem_addUser.addActionListener(view.libraryManagementController);
        jpanel_adminTool_addUser.add(jmenuItem_addUser);

        //Borrow Document  borrowDocument
        JPanel jpanel_adminTool_borrowDocument = new JPanel(new FlowLayout());
        jpanel_adminTool_borrowDocument.setBackground(new Color(192,192,192));
        jmenuItem_borrowDocument = new JMenuItem("Edit Document");
        jmenuItem_borrowDocument.setFont(new Font("Tahoma", Font.BOLD, 20));
        jmenuItem_borrowDocument.setIcon(new ImageIcon("src\\view\\image\\editDocument.png"));
        jmenuItem_borrowDocument.addActionListener(view.libraryManagementController);
        jpanel_adminTool_borrowDocument.add(jmenuItem_borrowDocument);

        //Remove Document removeDocument
//        JPanel jpanel_adminTool_removeDocument = new JPanel(new FlowLayout());
//        jpanel_adminTool_removeDocument.setBackground(new Color(192,192,192));
//        JMenuItem jmenuItem_removeDocument = new JMenuItem("Add User");
//        jmenuItem_removeDocument.setFont(new Font("Tahoma", Font.BOLD, 20));
//        jpanel_adminTool_removeDocument.add(jmenuItem_removeDocument);

        view.addHoverEffect(jmenuItem_displayUserInfor);
        view.addHoverEffect(jmenuItem_addUser);
        view.addHoverEffect(jmenuItem_displayDocument);
        view.addHoverEffect(jmenuItem_borrowDocument);

        JPanel jpanel_adminTool = new JPanel(new GridLayout(1, 4, 10, 10));
        jpanel_adminTool.setBackground(new Color(208, 255, 208));

        jpanel_adminTool.add(jpanel_adminTool_displayUserInfor);
        jpanel_adminTool.add(jpanel_adminTool_displayDocument);
        jpanel_adminTool.add(jpanel_adminTool_addUser);
        jpanel_adminTool.add(jpanel_adminTool_borrowDocument);
        //  jpanel_adminTool.add(jpanel_adminTool_removeDocument);

        jpanel_admin_contenPane = new JPanel(new BorderLayout());
        jpanel_admin_contenPane.setBackground(new Color(208, 255, 208));

        this.view.contentPane.add(jpanel_adminTool, BorderLayout.NORTH);
        this.view.contentPane.add(jpanel_admin_contenPane, BorderLayout.CENTER);

        this.view.contentPane.revalidate();
        this.view.contentPane.repaint();
    }

    public void displayUserInfo() {
//        setColorTool(changeModel.getChange_admin());
//       this.jpanel_adminTool_displayUserInfor.setBackground(new Color(205,92,92));

        if(!this.view.changeModel.getChange_admin().equals("UserInfor")) {
            this.view.changeModel.setChange_admin("UserInfor");
            // Clear all components from the panel
            jpanel_admin_contenPane.removeAll();
            if(studentTable == null){
                this.view.displayUserInfo.createUserInforTable();
                this.studentTable = this.view.displayUserInfo.getStudentTable();

            }

            JScrollPane scrollPane = new JScrollPane(studentTable);
            jpanel_admin_contenPane.setLayout(new BorderLayout());
            jpanel_admin_contenPane.add(scrollPane, BorderLayout.CENTER);
            searchUser();

            jpanel_admin_contenPane.revalidate();
            jpanel_admin_contenPane.repaint();
        }

    }
    public void editUser() {
        editUser.editUser();
    }

    public void searchUser() {
        searchUserView.searchUser();
    }

    public void profileuser(Student student) {
        profileUser.profileuser(student);
    }


    public void clickSearchUser() {

        Student student = this.view.displayUserInfo.kiemTraUserByID(jtextField_searchUser_byID.getText());
        if(student != null) {
            jpanel_admin_contenPane.removeAll();
            profileuser(student);
            jpanel_admin_contenPane.revalidate();
            jpanel_admin_contenPane.repaint();
        }else{
            JOptionPane.showMessageDialog(
                    null,
                    "User with ID not found"
            );
        }
    }

}
