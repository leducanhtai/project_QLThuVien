package view;
// check git.llll
import adminFunction.Change;
import adminFunction.DisplayUserInfo;
import basicFunction.*;
import controller.LibraryManagementController;
import model.AdminManagementModel;
import model.AdminModel;
import model.Student;
import model.StudentManagementModel;
import view.sign_in_up.SignIn;

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


    private JPanel contentPane_profileUser;
    private JTable jtable_soSachMuon;

    public DisplayUserInfo displayUserInfo;
    //private StudentManagementModel studentManagementModel;




    private List<JPanel> wordPanels = new ArrayList<>();
    public Change changeModel;
    public String change;

    // các phần view
    private HomeView homeView;
    private ReturnView returnView;
    private BorrowView borrowView;
    private HelpView helpView;
    public AdminView adminView;
    public SignIn signIn;



    public LibraryManagementController libraryManagementController = new LibraryManagementController(this);
    public JTextField jtextField_searchUser_byID;

    public LibraryManagementView() {
        this.change = "";
        this.changeModel = new Change();
        this.adminManagementModel = new AdminManagementModel();
        //this.studentManagementModel = new StudentManagementModel();
        this.displayUserInfo = new DisplayUserInfo();

        this.homeView = new HomeView(this);
        this.returnView = new ReturnView(this);
        this.borrowView = new BorrowView(this);
        this.helpView = new HelpView(this);
        this.adminView = new AdminView(this);
        this.signIn = new SignIn(this);


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
        homeView.selectHome();
    }

    public void selectReturn() {
        returnView.selectReturn();
    }

    public void selectBorrow() {
        borrowView.selectBorrow();
    }

    public void selectHelp() {
        helpView.selectHelp();
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
        adminView.selectAdmin();
    }

    public void adminTool(){
        adminView.adminTool();
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
       adminView.displayUserInfo();
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
