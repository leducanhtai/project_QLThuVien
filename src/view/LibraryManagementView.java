package view;
// check git.llll
import adminFunction.Change;
//import adminFunction.DisplayUserInfo;
//import adminFunction.Login;
import adminFunction.DisplayUserInfo;
import basicFunction.*;
import controller.LibraryManagementController;
import model.AdminManagementModel;
import model.AdminModel;
import model.Student;
import model.StudentManagementModel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementView extends JFrame {

    public JPanel contentPane;
    private JPanel jpanel_tool;
    private JPanel jpanel_search;
    public JPanel jpanel_search_tool;
    public JPanel jpanel_search_befor;
    public JPanel jpanel_center;

    public JPanel jpanel_sign_in;
    public JPanel jpanel_sign_in_click;
    public JMenuItem jMenuItem_signIn;

    private JTextField jtextField_search;
    private JMenuItem jmenu_item_search;

    public JMenuItem jmenu_item_home;
    private JMenuItem jmenu_item_exit;
    public JMenuItem jmenu_item_borrowBooks;
    public JMenuItem jmenu_item_returnBooks;
    public JMenuItem jmenu_item_Admin;
    public JMenuItem jmenu_item_help;

    public JPanel jpanel_home;
    private JPanel jpanel_exit;
    public JPanel jpanel_borrowBooks;
    public JPanel jpanel_returnBooks;
    public JPanel jpanel_Admin;
    public JPanel jpanel_help;

    private JButton jbutton_start_game;
    private JButton jbutton_home;

    public JLabel jlabel_1;
    public JLabel jlabel_2;
    private JLabel jlabel_3;

    public JLabel jlabel_8;
    public JLabel jlabel_9;
    public JLabel jlabel_10;
    public JLabel jlabel_11;

    // phần đăng nhập cho admin
    private JTextField jtextField_tenDangNhap;
    private JTextField jtextField_matKhau;
    private JLabel jlabel_tenDangNhap;
    private JLabel jlabel_matKhau;
    public JLabel jLabel_checkDangNhap;
    private JMenuItem jmenu_item_DangNhap;
    private JPanel jpanel_DangNhap;
    private JPanel jpanel_click_DangNhap;
    private JPanel jpanel_noiDung_DangNhap;
    private AdminManagementModel adminManagementModel;
    private JLabel jlabel_4;
    private JLabel jlabel_5;
    private JLabel jlabel_6;
    private JLabel jlabel_7;

    private JMenuItem jmenuItem_displayUserInfor;
    private JPanel jpanel_adminTool_displayUserInfor;
    private JMenuItem jmenuItem_addUser;
    private JMenuItem jmenuItem_displayDocument;
    private JMenuItem jmenuItem_borrowDocument;
    public JPanel jpanel_admin_contenPane;
    private JPanel contentPane_profileUser;
    private JTable jtable_soSachMuon;

    public DisplayUserInfo displayUserInfo;
    //private StudentManagementModel studentManagementModel;
    private JTable studentTable;



    private List<JPanel> wordPanels = new ArrayList<>();
    public Change changeModel;
    public String change;

//    private JCheckBox jcheckbox_remember;
//    private JMenuItem jmenu_item_dowload;

    LibraryManagementController libraryManagementController = new LibraryManagementController(this);
    public JTextField jtextField_searchUser_byID;

    public LibraryManagementView() {
        this.change = "";
        this.changeModel = new Change();
        this.adminManagementModel = new AdminManagementModel();
        //this.studentManagementModel = new StudentManagementModel();
        this.displayUserInfo = new DisplayUserInfo();

        this.init();
        this.setVisible(true);

    }
    public void init() {
        this.setTitle("Dictinary");
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.jmenu_item_home = new JMenuItem("Home");
        this.jmenu_item_home.setFont(new Font("Tahoma", Font.BOLD, 14));
        //this.jmenu_item_home.setForeground(new Color(255, 255, 255));
        this.jmenu_item_home.setForeground(new Color(64, 0, 128));
        this.jmenu_item_home.setIcon(new ImageIcon("src\\view\\image\\home.png"));
        this.jmenu_item_home.addActionListener(libraryManagementController);
        this.jpanel_home = new JPanel(new BorderLayout());
        this.jpanel_home.setBackground(new Color(154,205,50));
        this.jpanel_home.add(this.jmenu_item_home, BorderLayout.CENTER);

        this.jmenu_item_Admin = new JMenuItem("Admin");
        this.jmenu_item_Admin.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jmenu_item_Admin.setForeground(new Color(255, 255, 255));
        this.jmenu_item_Admin.setIcon(new ImageIcon("src\\view\\image\\Admin.png"));
        this.jmenu_item_Admin.addActionListener(libraryManagementController);
        this.jpanel_Admin = new JPanel(new BorderLayout());
        this.jpanel_Admin.setBackground(new Color(0, 128, 64));
        this.jpanel_Admin.add(this.jmenu_item_Admin, BorderLayout.CENTER);

        this.jmenu_item_borrowBooks = new JMenuItem("Borrow");
        this.jmenu_item_borrowBooks.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jmenu_item_borrowBooks.setForeground(new Color(255, 255, 255));
        this.jmenu_item_borrowBooks.setIcon(new ImageIcon("src\\view\\image\\borrow.png"));
        this.jmenu_item_borrowBooks.addActionListener(libraryManagementController);
        this.jpanel_borrowBooks = new JPanel(new BorderLayout());
        this.jpanel_borrowBooks.setBackground(new Color(0, 128, 64));
        this.jpanel_borrowBooks.add(this.jmenu_item_borrowBooks, BorderLayout.CENTER);

        this.jmenu_item_returnBooks = new JMenuItem("Return");
        this.jmenu_item_returnBooks.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jmenu_item_returnBooks.setForeground(new Color(255, 255, 255));
        this.jmenu_item_returnBooks.setIcon(new ImageIcon("src\\view\\image\\return.png"));
        this.jmenu_item_returnBooks.addActionListener(libraryManagementController);
        this.jpanel_returnBooks = new JPanel(new BorderLayout());
        this.jpanel_returnBooks.setBackground(new Color(0, 128, 64));
        this.jpanel_returnBooks.add(this.jmenu_item_returnBooks, BorderLayout.CENTER);

        this.jmenu_item_exit = new JMenuItem("Exit");
        this.jmenu_item_exit.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jmenu_item_exit.setForeground(new Color(255, 255, 255));
        this.jmenu_item_exit.setIcon(new ImageIcon("src\\view\\image\\exit.png"));
        this.jmenu_item_exit.addActionListener(libraryManagementController);

        this.jmenu_item_help = new JMenuItem("Help");
        this.jmenu_item_help.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jmenu_item_help.setForeground(new Color(255, 255, 255));
        this.jmenu_item_help.setIcon(new ImageIcon("src\\view\\image\\help.png"));
        this.jmenu_item_help.addActionListener(libraryManagementController);
        this.jpanel_help = new JPanel(new BorderLayout());
        this.jpanel_help.setBackground(new Color(0, 128, 64));
        this.jpanel_help.add(this.jmenu_item_help, BorderLayout.CENTER);

        this.jmenu_item_search = new JMenuItem("Search");
        this.jmenu_item_search.setFont(new Font("Tahoma", Font.BOLD, 40));
        this.jmenu_item_search.setForeground(new Color(255, 255, 255));
        this.jmenu_item_search.setIcon(new ImageIcon("src\\view\\image\\search.png"));
        this.jmenu_item_search.addActionListener(libraryManagementController);

        // phần chứa các chức năng
        this.jpanel_tool = new JPanel(new GridLayout(12, 1));
        this.jpanel_tool.setBackground(new Color(0, 128, 64));
        this.jpanel_tool.add(this.jpanel_home);
        this.jpanel_tool.add(this.jpanel_Admin);
        this.jpanel_tool.add(this.jpanel_borrowBooks);
        this.jpanel_tool.add(this.jpanel_returnBooks);
        this.jpanel_tool.add(this.jpanel_help);
        this.jpanel_tool.add(this.jmenu_item_exit);

        this.jtextField_search = new JTextField();
        this.jtextField_search.setFont(new Font("Tahoma", Font.BOLD, 40));

        // chỉ là phần tạo khoang trắng
        this.jlabel_1 = new JLabel(" ");
        this.jlabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
        this.jlabel_1.setBackground(new Color(0, 128, 64));

        // chỉ là phần tạo khoang trắng
        this.jlabel_2 = new JLabel(" ");
        this.jlabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
        this.jlabel_2.setBackground(new Color(0, 128, 64));

        // chỉ là phần tạo khoang trắng
        this.jlabel_3 = new JLabel(" kkkkk");
        this.jlabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
        this.jlabel_3.setBackground(new Color(0, 128, 64));

        // chỉ là phần tạo khoang trắng
        this.jlabel_8 = new JLabel("");
        this.jlabel_8.setFont(new Font("Tahoma", Font.BOLD, 10));
        this.jlabel_8.setBackground(new Color(0, 128, 64));

        // chỉ là phần tạo khoang trắng
        this.jlabel_9 = new JLabel("");
        this.jlabel_9.setFont(new Font("Tahoma", Font.BOLD, 10));
        this.jlabel_9.setBackground(new Color(0, 128, 64));

        // chỉ là phần tạo khoang trắng
        this.jlabel_10 = new JLabel("");
        this.jlabel_10.setFont(new Font("Tahoma", Font.BOLD, 10));
        this.jlabel_10.setBackground(new Color(0, 128, 64));

        // chỉ là phần tạo khoang trắng
        this.jlabel_11 = new JLabel("");
        this.jlabel_11.setFont(new Font("Tahoma", Font.BOLD, 10));
        this.jlabel_11.setBackground(new Color(0, 128, 64));

        // phần tìm kiếm chính
        this.jpanel_search = new JPanel(new BorderLayout());
        this.jpanel_search.setBackground(new Color(208, 255, 208));
        this.jpanel_search.add(this.jtextField_search, BorderLayout.CENTER);
        this.jpanel_search.add(this.jmenu_item_search , BorderLayout.EAST);

        // nút đăng nhập\
        this.jMenuItem_signIn = new JMenuItem("Sign In");
        this.jMenuItem_signIn.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jMenuItem_signIn.setForeground(new Color(255, 255, 255));
        this.jMenuItem_signIn.setIcon(new ImageIcon("src\\view\\image\\signIn.png"));
        this.jMenuItem_signIn.addActionListener(libraryManagementController);

        this.jpanel_sign_in_click = new JPanel(new BorderLayout());
        this.jpanel_sign_in_click.setBackground(new Color(0,255,0));
        this.jpanel_sign_in_click.add(jMenuItem_signIn, BorderLayout.CENTER);

        this.jpanel_sign_in = new JPanel(new GridLayout(1, 2));
        this.jpanel_sign_in.setBackground(new Color(208, 255, 208));
        this.jpanel_sign_in.add(this.jlabel_2);
        this.jpanel_sign_in.add(this.jpanel_sign_in_click);

        // phần tìm kiếm gồm cá các chức năng khác
        this.jpanel_search_tool = new JPanel(new GridLayout(1, 2));
        this.jpanel_search_tool.setBackground(new Color(208, 255, 208));
        this.jpanel_search_tool.add(this.jpanel_search);
        this.jpanel_search_tool.add(this.jpanel_sign_in);

        // phần tìm kiếm bao trùm
        this.jpanel_search_befor = new JPanel(new BorderLayout());
        this.jpanel_search_befor.setBackground(new Color(0, 128, 64));
        this.jpanel_search_befor.add(this.jpanel_search_tool, BorderLayout.CENTER);
        this.jpanel_search_befor.add(this.jlabel_1, BorderLayout.NORTH);

        //phần lưu các 100 từ ngữ bất kì
        this.jpanel_center = new JPanel(new GridLayout(100, 1 ));
        JScrollPane scrollPane = new JScrollPane(this.jpanel_center);
        for (int i = 0; i < 100; i++) {
            JPanel panel_word = createPanelWord(i);
            wordPanels.add(panel_word);  // Add to the list
            jpanel_center.add(panel_word);  // Add to the panel
        }


        // phần giao diện chính
        this.contentPane = new JPanel(new BorderLayout());
        this.contentPane.setBackground(new Color(0, 128, 64));
        this.contentPane.add(this.jpanel_search_befor, BorderLayout.NORTH);
        this.contentPane.add(scrollPane, BorderLayout.CENTER);

        ImageIcon icon = new ImageIcon("src\\view\\image\\title.png");
        this.setIconImage(icon.getImage());
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(0, 128, 64));
        this.add(contentPane, BorderLayout.CENTER);
        this.add(jpanel_tool, BorderLayout.WEST);

    }
    public JPanel createPanelWord(int index) {
        JPanel panel_word = new JPanel();
        panel_word.setBackground(new Color(208, 255, 208));
        panel_word.setLayout(new GridLayout(1, 6));

        JLabel lblNewLabel = new JLabel("Label " + index);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
        lblNewLabel.setForeground(new Color(64, 0, 128));
        panel_word.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("");
        panel_word.add(lblNewLabel_1);

        JMenuItem jMenuItem_sound = new JMenuItem("");
        jMenuItem_sound.setFont(new Font("Segoe UI", Font.ITALIC, 20));
        jMenuItem_sound.setIcon(new ImageIcon("src\\view\\image\\volume.png"));
        panel_word.add(jMenuItem_sound);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Yêu thích");
        chckbxNewCheckBox.setFont(new Font("Tahoma", Font.ITALIC, 20));
        chckbxNewCheckBox.setBackground(new Color(208, 255, 208));

        // Thêm icon vào JCheckBox
        ImageIcon uncheckedIcon = new ImageIcon("src\\view\\image\\heart_1.png");
        ImageIcon checkedIcon = new ImageIcon("src\\view\\image\\heart_2.png");

        // Đặt icon khi checkbox chưa được chọn
        chckbxNewCheckBox.setIcon(uncheckedIcon);
        // Đặt icon khi checkbox được chọn
        chckbxNewCheckBox.setSelectedIcon(checkedIcon);
        panel_word.add(chckbxNewCheckBox);

        JMenuItem mntmNewMenuItem = new JMenuItem("Dowload");
        mntmNewMenuItem.setFont(new Font("Segoe UI", Font.ITALIC, 20));
        mntmNewMenuItem.setIcon(new ImageIcon("src\\view\\image\\dowload.png"));
        panel_word.add(mntmNewMenuItem);

        return panel_word;
    }
    public void selectHome() {
        // Xóa hết các phần tử trên contentPane
        this.clearPanel();

        // Đặt lại màu cho các mục trong jpanel_tool
        this.setColorTool(this.change);

        // Cập nhật trạng thái là "Home"
        this.change = "Home";
        this.jmenu_item_home.setForeground(new Color(64, 0, 128));
        this.jpanel_home.setBackground(new Color(154,205,50));

        // Thêm lại các thành phần ban đầu vào contentPane
        this.jpanel_sign_in.add(this.jlabel_2);
        this.jpanel_sign_in.add(this.jpanel_sign_in_click);
        this.jpanel_search_befor.add(this.jpanel_search_tool, BorderLayout.CENTER);
        this.jpanel_search_befor.add(this.jlabel_1, BorderLayout.NORTH);
        // this.libraryManagementView.jpanel_search_tool.add(this.libraryManagementView.jlabel_2);
        this.contentPane.add(this.jpanel_search_befor, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(this.jpanel_center);  // Tạo lại JScrollPane
        this.contentPane.add(scrollPane, BorderLayout.CENTER);

        // Cập nhật lại giao diện
        this.contentPane.revalidate();
        this.contentPane.repaint();

    }

    public void selectReturn() {
        clearPanel();
        this.setColorTool(this.change);
        this.change = "Return";
        this.jmenu_item_returnBooks.setForeground(new Color(64, 0, 128));
        this.jpanel_returnBooks.setBackground(new Color(154,205,50));

        // Cập nhật lại giao diện
        this.contentPane.revalidate();
        this.contentPane.repaint();

    }

    public void selectBorrow() {
        this.clearPanel();
        this.setColorTool(this.change);
        this.change = "Borrow";
        this.jmenu_item_borrowBooks.setForeground(new Color(64, 0, 128));
        this.jpanel_borrowBooks.setBackground(new Color(154,205,50));

        // Tạo một JButton mới
        JButton gameButton = new JButton("Start Game");
        gameButton.setFont(new Font("Segoe UI", Font.BOLD, 30));
        gameButton.setBackground(new Color(0, 128, 64));
        gameButton.setForeground(Color.GREEN);

        // Thêm JButton vào giữa panel
        this.contentPane.add(gameButton, BorderLayout.CENTER);

        // Cập nhật lại giao diện
        this.contentPane.revalidate();
        this.contentPane.repaint();

    }

    public void selectHelp() {
        clearPanel();
        this.setColorTool(this.change);
        this.change = "Help";
        this.jmenu_item_help.setForeground(new Color(64, 0, 128));
        this.jpanel_help.setBackground(new Color(154,205,50));

        // Cập nhật lại giao diện
        this.contentPane.revalidate();
        this.contentPane.repaint();

    }

    public void dangNhap(){


        this.jmenu_item_DangNhap = new JMenuItem("Đăng nhập");
        this.jmenu_item_DangNhap.setFont(new Font("Tahoma", Font.BOLD, 40));
        this.jmenu_item_DangNhap.setForeground(new Color(255, 255, 255));
        this.jmenu_item_DangNhap.addActionListener(this.libraryManagementController);


        this.jpanel_click_DangNhap = new JPanel(new BorderLayout());
        this.jpanel_click_DangNhap.setBackground(new Color(75,0,130));
        //jpanel_click_DangNhap.add(jLabel_checkDangNhap, BorderLayout.NORTH);
        this.jpanel_click_DangNhap.add(this.jmenu_item_DangNhap, BorderLayout.CENTER);

        this.jpanel_DangNhap = new JPanel(new BorderLayout());
        this.jpanel_DangNhap.setBackground(new Color(154,205,50));
        this.jpanel_DangNhap.add(this.jpanel_click_DangNhap, BorderLayout.NORTH);

        this.jlabel_4 = new JLabel("       ");
        this.jlabel_4.setFont(new Font("Tahoma", Font.BOLD, 80));

        this.jlabel_5 = new JLabel("       ");
        this.jlabel_5.setFont(new Font("Tahoma", Font.BOLD, 80));

        this.jlabel_6 = new JLabel("       ");
        this.jlabel_6.setFont(new Font("Tahoma", Font.BOLD, 80));

        this.jlabel_7 = new JLabel("        ");
        this.jlabel_7.setFont(new Font("Tahoma", Font.BOLD, 80));


        addHoverEffect(jmenu_item_DangNhap);

        this.contentPane.add(jlabel_7, BorderLayout.NORTH);
        this.contentPane.add(jlabel_6, BorderLayout.EAST);
        this.contentPane.add(jlabel_5, BorderLayout.WEST);
        this.contentPane.add(jlabel_4, BorderLayout.SOUTH);
        this.contentPane.add(jpanel_DangNhap, BorderLayout.CENTER);
    }

//    public boolean checkDangNhap() {
//        String tenAdmin = this.jtextField_tenDangNhap.getText();
//        String matKhau = this.jtextField_matKhau.getText();
//        this.adminManagementModel.setAdminList();
//        ArrayList<AdminModel> adminList = adminManagementModel.getAdminList();  // Use the getter method
//
//        for (AdminModel admin : adminList) {
//            if (tenAdmin.equals(admin.getTenDangNhap()) && matKhau.equals(admin.getMatKhau())) {
//                return true; // Login successful
//            }
//        }
//
//        return false; // Login failed
//    }
    public void selectAdmin() {
        clearPanel();
        this.setColorTool(this.change);
        this.change = "Admin";
        this.jmenu_item_Admin.setForeground(new Color(64, 0, 128));
        this.jpanel_Admin.setBackground(new Color(154,205,50));

        dangNhap();

        // Cập nhật lại giao diện
        this.contentPane.revalidate();
        this.contentPane.repaint();

    }

    public void adminTool(){
        clearPanel();

        this.setColorTool(this.change);
        this.change = "Admin";
        this.jmenu_item_Admin.setForeground(new Color(64, 0, 128));
        this.jpanel_Admin.setBackground(new Color(154,205,50));

        jpanel_adminTool_displayUserInfor = new JPanel(new FlowLayout());
        jpanel_adminTool_displayUserInfor.setBackground(new Color(250,128,114));
        jmenuItem_displayUserInfor = new JMenuItem("UserInfor");
        jmenuItem_displayUserInfor.setFont(new Font("Tahoma", Font.BOLD, 20));
        jmenuItem_displayUserInfor.setIcon(new ImageIcon("src\\view\\image\\user.png"));
        jmenuItem_displayUserInfor.addActionListener(libraryManagementController);
        jpanel_adminTool_displayUserInfor.add(jmenuItem_displayUserInfor);

        //Display Document  displayDocument
        JPanel jpanel_adminTool_displayDocument = new JPanel(new FlowLayout());
        jpanel_adminTool_displayDocument.setBackground(new Color(173,216,230));
        jmenuItem_displayDocument = new JMenuItem("Document");
        jmenuItem_displayDocument.setFont(new Font("Tahoma", Font.BOLD, 20));
        jmenuItem_displayDocument.setIcon(new ImageIcon("src\\view\\image\\document.png"));
        jmenuItem_displayDocument.addActionListener(libraryManagementController);
        jpanel_adminTool_displayDocument.add(jmenuItem_displayDocument);

        // Add User  addUser
        JPanel jpanel_adminTool_addUser = new JPanel(new FlowLayout());
        jpanel_adminTool_addUser.setBackground(new Color(144,238,144));
        jmenuItem_addUser = new JMenuItem("Edit User");
        jmenuItem_addUser.setFont(new Font("Tahoma", Font.BOLD, 20));
        jmenuItem_addUser.setIcon(new ImageIcon("src\\view\\image\\editUser.png"));
        jmenuItem_addUser.addActionListener(libraryManagementController);
        jpanel_adminTool_addUser.add(jmenuItem_addUser);

        //Borrow Document  borrowDocument
        JPanel jpanel_adminTool_borrowDocument = new JPanel(new FlowLayout());
        jpanel_adminTool_borrowDocument.setBackground(new Color(192,192,192));
        jmenuItem_borrowDocument = new JMenuItem("Edit Document");
        jmenuItem_borrowDocument.setFont(new Font("Tahoma", Font.BOLD, 20));
        jmenuItem_borrowDocument.setIcon(new ImageIcon("src\\view\\image\\editDocument.png"));
        jmenuItem_borrowDocument.addActionListener(libraryManagementController);
        jpanel_adminTool_borrowDocument.add(jmenuItem_borrowDocument);

        //Remove Document removeDocument
//        JPanel jpanel_adminTool_removeDocument = new JPanel(new FlowLayout());
//        jpanel_adminTool_removeDocument.setBackground(new Color(192,192,192));
//        JMenuItem jmenuItem_removeDocument = new JMenuItem("Add User");
//        jmenuItem_removeDocument.setFont(new Font("Tahoma", Font.BOLD, 20));
//        jpanel_adminTool_removeDocument.add(jmenuItem_removeDocument);

        addHoverEffect(jmenuItem_displayUserInfor);
        addHoverEffect(jmenuItem_addUser);
        addHoverEffect(jmenuItem_displayDocument);
        addHoverEffect(jmenuItem_borrowDocument);

        JPanel jpanel_adminTool = new JPanel(new GridLayout(1, 4, 10, 10));
        jpanel_adminTool.setBackground(new Color(208, 255, 208));

        jpanel_adminTool.add(jpanel_adminTool_displayUserInfor);
        jpanel_adminTool.add(jpanel_adminTool_displayDocument);
        jpanel_adminTool.add(jpanel_adminTool_addUser);
        jpanel_adminTool.add(jpanel_adminTool_borrowDocument);
        //  jpanel_adminTool.add(jpanel_adminTool_removeDocument);

        jpanel_admin_contenPane = new JPanel(new BorderLayout());
        jpanel_admin_contenPane.setBackground(new Color(208, 255, 208));

        this.contentPane.add(jpanel_adminTool, BorderLayout.NORTH);
        this.contentPane.add(jpanel_admin_contenPane, BorderLayout.CENTER);

        this.contentPane.revalidate();
        this.contentPane.repaint();


    }

    public void addHoverEffect(JMenuItem menuItem) {
        menuItem.addMouseListener(new MouseAdapter() {
            Color originalColor = menuItem.getForeground();

            @Override
            public void mouseEntered(MouseEvent e) {
                menuItem.setForeground(new Color(255,192,203)); // Màu mờ đi khi chuột vào
            }

            @Override
            public void mouseExited(MouseEvent e) {
                menuItem.setForeground(originalColor);
            }
        });
    }

    public void displayUserInfo() {
//        setColorTool(changeModel.getChange_admin());
//       this.jpanel_adminTool_displayUserInfor.setBackground(new Color(205,92,92));

        if(!this.changeModel.getChange_admin().equals("UserInfor")) {
            this.changeModel.setChange_admin("UserInfor");
            // Clear all components from the panel
            jpanel_admin_contenPane.removeAll();
            if(studentTable == null){
                  this.displayUserInfo.createUserInforTable();
                  this.studentTable = this.displayUserInfo.getStudentTable();

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
//        setColorTool(changeModel.getChange_admin());
//       this.jpanel_adminTool_displayUserInfor.setBackground(new Color(205,92,92));

        if(!this.changeModel.getChange_admin().equals("Edit User")) {
            this.changeModel.setChange_admin("Edit User");
            // Clear all components from the panel
            jpanel_admin_contenPane.removeAll();
            if(studentTable == null){
                this.displayUserInfo.createUserInforTable();
                this.studentTable = this.displayUserInfo.getStudentTable();

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


            JScrollPane scrollPane = new JScrollPane(studentTable);
            jpanel_admin_contenPane.setLayout(new BorderLayout());
            jpanel_admin_contenPane.add(jpanel_adminTool_editUser, BorderLayout.NORTH);
            jpanel_admin_contenPane.add(scrollPane, BorderLayout.CENTER);
            searchUser();

            jpanel_admin_contenPane.revalidate();
            jpanel_admin_contenPane.repaint();
        }

    }

    public void searchUser() {
        JPanel jpanel_searchUser = new JPanel(new BorderLayout());
        jpanel_searchUser.setBackground(new Color(208, 255, 208));
        JPanel jpanel_searchUserInfor = new JPanel(new GridLayout(1, 4, 10, 10));
        jpanel_searchUserInfor.setBackground(new Color(208, 255, 208));

        jtextField_searchUser_byID = new JTextField();
        jtextField_searchUser_byID.setFont(new Font("Tahoma", Font.BOLD, 30));
        jpanel_searchUserInfor.add(jtextField_searchUser_byID);

        JLabel jlabel_searchUser = new JLabel("NHập ID");
        jlabel_searchUser.setFont(new Font("Tahoma", Font.BOLD, 30));
        jpanel_searchUserInfor.add(jlabel_searchUser);

        JPanel jpanel_clickSearchUser = new JPanel(new BorderLayout());
        jpanel_clickSearchUser.setBackground(new Color(0,191,255));
        JMenuItem jmenu_item_search_user = new JMenuItem("Search User");
        jmenu_item_search_user.setFont(new Font("Tahoma", Font.BOLD, 30));
        jmenu_item_search_user.setIcon(new ImageIcon("src\\view\\image\\search_user.png"));
        addHoverEffect(jmenu_item_search_user);
        jmenu_item_search_user.addActionListener(libraryManagementController);
        jpanel_clickSearchUser.add(jmenu_item_search_user, BorderLayout.CENTER);
        jpanel_searchUserInfor.add(jpanel_clickSearchUser);

        JLabel jlabel_khtr = new JLabel("");
        jpanel_searchUserInfor.add(jlabel_khtr);

        // chỉ là phần tạo khoang trắng
        this.jlabel_3 = new JLabel(" ");
        this.jlabel_3.setFont(new Font("Tahoma", Font.BOLD, 100));
        this.jlabel_3.setBackground(new Color(0, 128, 64));


        jpanel_searchUser.add(jpanel_searchUserInfor, BorderLayout.NORTH);
        jpanel_searchUser.add(jlabel_3, BorderLayout.CENTER);

        jpanel_admin_contenPane.add(jpanel_searchUser, BorderLayout.SOUTH);
    }

    public void profileuser(Student student) {

            contentPane_profileUser = new JPanel();
            contentPane_profileUser.setBackground(new Color(208, 255, 208));
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
            panel_1.setBackground(new Color(169, 243, 196));
            panel_1.setBounds(42, 449, 1176, 299);
            contentPane_profileUser.add(panel_1);
            panel_1.setLayout(new BorderLayout(0, 0));

            jtable_soSachMuon = new JTable();
            JScrollPane jscrollPane_soSachMuon = new JScrollPane(jtable_soSachMuon);
            panel_1.add(jscrollPane_soSachMuon, BorderLayout.CENTER);

            jpanel_admin_contenPane.add(contentPane_profileUser);
            jpanel_admin_contenPane.revalidate();
            jpanel_admin_contenPane.repaint();

    }


    public void clickSearchUser() {

        Student student = this.displayUserInfo.kiemTraUserByID(jtextField_searchUser_byID.getText());
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


    public void clearPanel() {
        this.contentPane.removeAll();
        this.contentPane.revalidate();
        this.contentPane.repaint();
    }

    public void setColorTool(String change) {
        if(this.change.equals("Home")||this.change.equals("")) {
            this.jmenu_item_home.setForeground(new Color(255, 255, 255));
            this.jpanel_home.setBackground(new Color(0, 128, 64));
        }else if(this.change.equals("Borrow")) {
            this.jmenu_item_borrowBooks.setForeground(new Color(255, 255, 255));
            this.jpanel_borrowBooks.setBackground(new Color(0, 128, 64));
        }else if(this.change.equals("Return")) {
            this.jmenu_item_returnBooks.setForeground(new Color(255, 255, 255));
            this.jpanel_returnBooks.setBackground(new Color(0, 128, 64));
        }else if(this.change.equals("Help")) {
            this.jmenu_item_help.setForeground(new Color(255, 255, 255));
            this.jpanel_help.setBackground(new Color(0, 128, 64));
        }else if(this.change.equals("Admin")) {
            this.jmenu_item_Admin.setForeground(new Color(255, 255, 255));
            this.jpanel_Admin.setBackground(new Color(0, 128, 64));
        }else if(this.change.equals("UserInfor")) {
            this.jmenu_item_home.setForeground(new Color(255, 255, 255));
            this.jpanel_home.setBackground(new Color(0, 128, 64));
        }
    }

}
