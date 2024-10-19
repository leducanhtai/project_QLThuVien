package view;

import model.Student;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class AdminView {
    public LibraryManagementView view;
    private JPanel panel_main;
    private JButton jbutton_displayUserInfor;
    private JPanel jpanel_adminTool_displayUserInfor;
    private JButton jbutton_borrowing;
    private JButton jbutton_displayDocument;
    private JButton jbutton_borrowing_user;
    public JPanel jpanel_admin_contenPane;
    public JPanel studentPanel;
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
        this.view.jbutton_Admin.setForeground(new Color(64, 0, 128));
        this.view.jbutton_Admin.setBackground(new Color(0,191,255));

        dangNhap();

        // Cập nhật lại giao diện
        this.view.contentPane.revalidate();
        this.view.contentPane.repaint();

    }
    public void dangNhap(){
        panel_main.setBackground(new Color(224,255,255));
        panel_main.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 255, 0));


        panel.setLayout(new BorderLayout(0, 0));

        JButton mntmNewMenuItem = new OvalButton("Đăng nhập");
        mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 30));
        mntmNewMenuItem.setBackground(new Color(0, 255, 0));
        mntmNewMenuItem.setBounds(339, 247, 278, 89);
        mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\LENOVO\\Documents\\GitHub\\project_QLThuVien\\src\\view\\image\\login.png"));
        mntmNewMenuItem.setBackground(new Color(0, 255, 0));
        view.addHoverEffect(mntmNewMenuItem);
        mntmNewMenuItem.addActionListener(view.libraryManagementController);
        panel_main.add(mntmNewMenuItem);
        //panel.add(mntmNewMenuItem);

        JLabel lblNewLabel = new JLabel("Hãy đăng nhập với tài khoản của admin để sử dụng chức năng này");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(157, 357, 715, 65);
        panel_main.add(lblNewLabel);


       //view.addHoverEffect(mntmNewMenuItem);
        this.view.contentPane.add(panel_main, BorderLayout.CENTER);
    }

    public void adminTool(){
        view.clearPanel();

        this.view.setColorTool(this.view.change);
        this.view.change = "Admin";
        this.view.jbutton_Admin.setForeground(new Color(64, 0, 128));
        this.view.jbutton_Admin.setBackground(new Color(0,191,255));

        jbutton_displayUserInfor = new JButton("UserInfor");
        jbutton_displayUserInfor.setFont(new Font("Tahoma", Font.BOLD, 14));
        jbutton_displayUserInfor.setForeground(new Color(255, 255, 255));
        jbutton_displayUserInfor.setBackground(new Color(64, 0, 128));
        jbutton_displayUserInfor.setIcon(new ImageIcon("src\\view\\image\\user2.png"));
        jbutton_displayUserInfor.addActionListener(view.libraryManagementController);


        //Display Document  displayDocument
        jbutton_displayDocument = new JButton("Document");
        jbutton_displayDocument.setFont(new Font("Tahoma", Font.BOLD, 14));
        jbutton_displayDocument.setForeground(new Color(255, 255, 255));
        jbutton_displayDocument.setBackground(new Color(64, 0, 128));
        jbutton_displayDocument.setIcon(new ImageIcon("src\\view\\image\\document2.png"));
        jbutton_displayDocument.addActionListener(view.libraryManagementController);


        // Danh sách sách đang được mượn
        jbutton_borrowing = new JButton("Borrowing");
        jbutton_borrowing.setFont(new Font("Tahoma", Font.BOLD, 14));
        jbutton_borrowing.setForeground(new Color(255, 255, 255));
        jbutton_borrowing.setBackground(new Color(64, 0, 128));
        jbutton_borrowing.setIcon(new ImageIcon("src\\view\\image\\borrowing.png"));
        jbutton_borrowing.addActionListener(view.libraryManagementController);


        // Danh sách người mượn
        jbutton_borrowing_user = new JButton("Borrowing User");
        jbutton_borrowing_user.setFont(new Font("Tahoma", Font.BOLD, 14));
        jbutton_borrowing_user.setForeground(new Color(255, 255, 255));
        jbutton_borrowing_user.setBackground(new Color(64, 0, 128));
        jbutton_borrowing_user.setIcon(new ImageIcon("src\\view\\image\\borrowinguser.png"));
        jbutton_borrowing_user.addActionListener(view.libraryManagementController);


        //Remove Document removeDocument
//        JPanel jpanel_adminTool_removeDocument = new JPanel(new FlowLayout());
//        jpanel_adminTool_removeDocument.setBackground(new Color(192,192,192));
//        JMenuItem jmenuItem_removeDocument = new JMenuItem("Add User");
//        jmenuItem_removeDocument.setFont(new Font("Tahoma", Font.BOLD, 20));
//        jpanel_adminTool_removeDocument.add(jmenuItem_removeDocument);

//        view.addHoverEffect(jmenuItem_displayUserInfor);
//        view.addHoverEffect(jmenuItem_addUser);
//        view.addHoverEffect(jmenuItem_displayDocument);
//        view.addHoverEffect(jmenuItem_borrowDocument);

        JPanel jpanel_adminTool = new JPanel(new GridLayout(1, 4, 10, 10));
        jpanel_adminTool.setBackground(new Color(25,25,112));

        jpanel_adminTool.add(jbutton_displayUserInfor);
        jpanel_adminTool.add(jbutton_displayDocument);
        jpanel_adminTool.add(jbutton_borrowing);
        jpanel_adminTool.add(jbutton_borrowing_user);
        //  jpanel_adminTool.add(jpanel_adminTool_removeDocument);

        jpanel_admin_contenPane = new JPanel(new BorderLayout());
        jpanel_admin_contenPane.setBackground(new Color(224,255,255));

        this.view.contentPane.add(jpanel_adminTool, BorderLayout.NORTH);
        this.view.contentPane.add(jpanel_admin_contenPane, BorderLayout.CENTER);

        this.view.contentPane.revalidate();
        this.view.contentPane.repaint();
    }

    public void displayUserInfo() {
//        setColorTool(changeModel.getChange_admin());
//       this.jpanel_adminTool_displayUserInfor.setBackground(new Color(205,92,92));
        searchUserView.jpanel_edit_user.removeAll();

        if(!this.view.changeModel.getChange_admin().equals("UserInfor")) {
            this.view.changeModel.setChange_admin("UserInfor");
            // Clear all components from the panel
            jpanel_admin_contenPane.removeAll();
            if(studentPanel == null){
                this.view.displayUserInforView.createUserInforTable();
                this.studentPanel = this.view.displayUserInforView.getStudentPanel();

            }

            //JScrollPane scrollPane = new JScrollPane(studentPanel);
            MinimalScrollPane.createMinimalScrollPane(studentPanel);
            JScrollPane scrollPane = MinimalScrollPane.createMinimalScrollPane(studentPanel);
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

        Student student = this.view.displayUserInforView.kiemTraUserByID(jtextField_searchUser_byID.getText());
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
