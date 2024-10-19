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
    public JPanel jpanel_befor;
    public JPanel jpanel_center;

    public JPanel jpanel_befor_tool;
    public JPanel jpanel_sign_in;
    public JButton jbutton_signIn;
    public JButton jbutton_seting;

    private JTextField jtextField_search;
    private JButton jbutton_search;

    public JButton jbutton_home;
    private JButton jbutton_exit;
    public JButton jbutton_borrowBooks;
    public JButton jbutton_returnBooks;
    public JButton jbutton_Admin;
    public JButton jbutton_help;
    public JPanel jpanel_title;

//    public JPanel jpanel_home;
//    private JPanel jpanel_exit;
//    public JPanel jpanel_borrowBooks;
//    public JPanel jpanel_returnBooks;
//    public JPanel jpanel_Admin;
//    public JPanel jpanel_help;

    private JButton jbutton_start_game;
    //private JButton jbutton_home;

    public JLabel jlabel_1;
    public JLabel jlabel_2;
    private JLabel jlabel_3;

    public JLabel jlabel_8;
    public JLabel jlabel_9;
    public JLabel jlabel_10;
    public JLabel jlabel_11;

    public JLabel jlabel_12;

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


    public LibraryManagementController libraryManagementController = new LibraryManagementController(this);
    public JTextField jtextField_searchUser_byID;
    private JButton jbutton_filter;


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



        this.init();
        this.setVisible(true);

    }
    public void init() {
        this.setTitle("Dictinary");
        this.setSize(1300, 900);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.jbutton_home = new JButton("Home");
        this.jbutton_home.setFont(new Font("Tahoma", Font.BOLD, 14));
        //this.jmenu_item_home.setForeground(new Color(255, 255, 255));
        this.jbutton_home.setForeground(new Color(64, 0, 128));
        jbutton_home.setBackground(new Color(0,191,255));
        this.jbutton_home.setIcon(new ImageIcon("src\\view\\image\\home2.png"));
        this.jbutton_home.addActionListener(libraryManagementController);
//        this.jpanel_home = new JPanel(new BorderLayout());
//        this.jpanel_home.setBackground(new Color(0,191,255));
//        this.jpanel_home.add(this.jmenu_item_home, BorderLayout.CENTER);

        this.jbutton_Admin = new JButton("Admin");
        this.jbutton_Admin.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jbutton_Admin.setForeground(new Color(255, 255, 255));
        this.jbutton_Admin.setBackground(new Color(25,25,112));
        this.jbutton_Admin.setIcon(new ImageIcon("src\\view\\image\\admin2.png"));
        this.jbutton_Admin.addActionListener(libraryManagementController);
//        this.jpanel_Admin = new JPanel(new BorderLayout());
//        this.jpanel_Admin.setBackground(new Color(85, 117, 255));
//        this.jpanel_Admin.add(this.jmenu_item_Admin, BorderLayout.CENTER);

        this.jbutton_borrowBooks = new JButton("Borrow");
        this.jbutton_borrowBooks.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jbutton_borrowBooks.setForeground(new Color(255, 255, 255));
        this.jbutton_borrowBooks.setBackground(new Color(25,25,112));
        this.jbutton_borrowBooks.setIcon(new ImageIcon("src\\view\\image\\borrow2.png"));
        this.jbutton_borrowBooks.addActionListener(libraryManagementController);
//        this.jpanel_borrowBooks = new JPanel(new BorderLayout());
//        this.jpanel_borrowBooks.setBackground(new Color(85, 117, 255));
//        this.jpanel_borrowBooks.add(this.jmenu_item_borrowBooks, BorderLayout.CENTER);

        this.jbutton_returnBooks = new JButton("Return");
        this.jbutton_returnBooks.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jbutton_returnBooks.setForeground(new Color(255, 255, 255));
        this.jbutton_returnBooks.setBackground(new Color(25,25,112));
        this.jbutton_returnBooks.setIcon(new ImageIcon("src\\view\\image\\return2.png"));
        this.jbutton_returnBooks.addActionListener(libraryManagementController);
//        this.jpanel_returnBooks = new JPanel(new BorderLayout());
//        this.jpanel_returnBooks.setBackground(new Color(85, 117, 255));
//        this.jpanel_returnBooks.add(this.jmenu_item_returnBooks, BorderLayout.CENTER);

        this.jbutton_exit = new JButton("Exit");
        this.jbutton_exit.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jbutton_exit.setForeground(new Color(255, 255, 255));
        this.jbutton_exit.setBackground(new Color(25,25,112));
        this.jbutton_exit.setIcon(new ImageIcon("src\\view\\image\\exit2.png"));
        this.jbutton_exit.addActionListener(libraryManagementController);

        this.jbutton_help = new JButton("Help");
        this.jbutton_help.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jbutton_help.setForeground(new Color(255, 255, 255));
        this.jbutton_help.setBackground(new Color(25,25,112));
        this.jbutton_help.setIcon(new ImageIcon("src\\view\\image\\help2.png"));
        this.jbutton_help.addActionListener(libraryManagementController);
//        this.jpanel_help = new JPanel(new BorderLayout());
//        this.jpanel_help.setBackground(new Color(85, 117, 255));
//        this.jpanel_help.add(this.jmenu_item_help, BorderLayout.CENTER);

        this.jbutton_search = new RoundButton("",50);
        this.jbutton_search.setFont(new Font("Tahoma", Font.BOLD, 40));
        this.jbutton_search.setForeground(new Color(255, 255, 255));
        this.jbutton_search.setBackground(new Color(255,215,0));
        this.jbutton_search.setIcon(new ImageIcon("src\\view\\image\\search3.png"));
        this.jbutton_search.addActionListener(libraryManagementController);

        this.jbutton_filter = new RoundButton("",50);
        this.jbutton_filter.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jbutton_filter.setForeground(new Color(255, 255, 255));
        this.jbutton_filter.setBackground(new Color(75,0,130));
        this.jbutton_filter.setIcon(new ImageIcon("src\\view\\image\\filter.png"));
        this.jbutton_filter.addActionListener(libraryManagementController);


        JLabel jlabel_24 = new JLabel("Library");
        jlabel_24.setFont(new Font("Tahoma", Font.BOLD, 20));
        jlabel_24.setForeground(new Color(255, 255, 255));
        jlabel_24.setIcon(new ImageIcon("src\\view\\image\\library2.png"));


        // phần chứa các chức năng
        this.jpanel_tool = new JPanel(new GridLayout(12, 1));
        this.jpanel_tool.setBackground(new Color(25,25,112));
        this.jpanel_tool.add(jlabel_24);
        this.jpanel_tool.add(this.jbutton_home);
        this.jpanel_tool.add(this.jbutton_Admin);
        this.jpanel_tool.add(this.jbutton_borrowBooks);
        this.jpanel_tool.add(this.jbutton_returnBooks);
        this.jpanel_tool.add(this.jbutton_help);
        this.jpanel_tool.add(this.jbutton_exit);

        this.jtextField_search = new OvalTextField(50);
        this.jtextField_search.setFont(new Font("Tahoma", Font.BOLD, 40));

        // chỉ là phần tạo khoang trắng
        this.jlabel_1 = new JLabel(" ");
        this.jlabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));

        // chỉ là phần tạo khoang trắng
        this.jlabel_2 = new JLabel("kkkk ");
        this.jlabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));

        // chỉ là phần tạo khoang trắng
        this.jlabel_3 = new JLabel(" kkkkk");
        this.jlabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));

        // chỉ là phần tạo khoang trắng
        this.jlabel_8 = new JLabel("");
        this.jlabel_8.setFont(new Font("Tahoma", Font.BOLD, 10));

        // chỉ là phần tạo khoang trắng
        this.jlabel_9 = new JLabel("");
        this.jlabel_9.setFont(new Font("Tahoma", Font.BOLD, 10));

        // chỉ là phần tạo khoang trắng
        this.jlabel_10 = new JLabel("");
        this.jlabel_10.setFont(new Font("Tahoma", Font.BOLD, 10));

        // chỉ là phần tạo khoang trắng
        this.jlabel_11 = new JLabel("");
        this.jlabel_11.setFont(new Font("Tahoma", Font.BOLD, 10));

        this.jlabel_12 = new JLabel("");
        this.jlabel_12.setFont(new Font("Tahoma", Font.BOLD, 10));

        JLabel jlabel_20 = new JLabel("bbbbbbbb");
        jlabel_20.setFont(new Font("Tahoma", Font.BOLD, 10));


        // phần tìm kiếm chính
        this.jpanel_search = new JPanel(new BorderLayout(10, 10));
        this.jpanel_search.setBackground(new Color(75,0,130));
        this.jpanel_search.add(this.jtextField_search, BorderLayout.CENTER);
        this.jpanel_search.add(this.jbutton_search , BorderLayout.EAST);
        jpanel_search.add(jbutton_filter, BorderLayout.WEST);

        // nút đăng nhập\
        this.jbutton_signIn = new OvalButtonLeft("        Sign In");
        this.jbutton_signIn.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jbutton_signIn.setForeground(new Color(255, 255, 255));
        this.jbutton_signIn.setBackground(new Color(75,0,130));
       // this.jbutton_signIn.setIcon(new ImageIcon("src\\view\\image\\signIn.png"));
        this.jbutton_signIn.addActionListener(libraryManagementController);

        this.jbutton_seting = new OvalButtonRight("       ");
        this.jbutton_seting.setForeground(new Color(255, 255, 255));
        this.jbutton_seting.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jbutton_seting.setBackground(new Color(75,0,130));
        this.jbutton_seting.setIcon(new ImageIcon("src\\view\\image\\menu2.png"));
        this.jbutton_seting.addActionListener(libraryManagementController);

        JPanel panelButtonSeting = new JPanel(new BorderLayout());
        panelButtonSeting.setBackground(new Color(25,25,112)); // Đặt màu nền giống với JPanel chính

// Đặt nút jbutton_seting vào trong JPanel này
        panelButtonSeting.add(this.jbutton_seting, BorderLayout.CENTER);

        JLabel jlabel_21 = new JLabel("  ");
        jlabel_21.setFont(new Font("Tahoma", Font.BOLD, 10));
        JLabel jlabel_22 = new JLabel("  ");
        jlabel_22.setFont(new Font("Tahoma", Font.BOLD, 10));

        this.jpanel_sign_in = new JPanel(new BorderLayout(5,5));
        this.jpanel_sign_in.setBackground(new Color(25,25,112));

        this.jpanel_sign_in.add(this.jbutton_signIn, BorderLayout.CENTER);
        this.jpanel_sign_in.add(panelButtonSeting, BorderLayout.EAST);
        this.jpanel_sign_in.add(jlabel_21, BorderLayout.NORTH);
        this.jpanel_sign_in.add(jlabel_22, BorderLayout.SOUTH);

        this.jpanel_befor_tool = new JPanel(new BorderLayout(5,5));
        this.jpanel_befor_tool.setBackground(new Color(25,25,112));
        jpanel_befor_tool.add(this.jlabel_1, BorderLayout.CENTER);
        jpanel_befor_tool.add(this.jpanel_sign_in, BorderLayout.EAST);


        // phần tìm kiếm gồm cá các chức năng khác
        this.jpanel_search_tool = new JPanel(new GridLayout(1, 2));
        this.jpanel_search_tool.setBackground(new Color(75,0,130));
        this.jpanel_search_tool.add(this.jpanel_search);
        this.jpanel_search_tool.add(this.jlabel_12);

        JLabel jlabel_13 = new JLabel("Tên sách");

        jlabel_13.setFont(new Font("Tahoma", Font.BOLD, 20));
        jlabel_13.setBackground(new Color(85, 117, 255));

        this.jpanel_title = new JPanel(new BorderLayout(1,6));
        jpanel_title.setBackground(new Color(25,25,112));
        jpanel_title.add(jlabel_13);

        // phần tìm kiếm bao trùm
        this.jpanel_befor = new JPanel(new BorderLayout(10,10));
        this.jpanel_befor.setBackground(new Color(75,0,130));
        this.jpanel_befor.add(this.jpanel_search_tool, BorderLayout.CENTER);
        this.jpanel_befor.add(this.jpanel_befor_tool, BorderLayout.NORTH);
        this.jpanel_befor.add(this.jpanel_title, BorderLayout.SOUTH);



        //phần lưu các 100 từ ngữ bất kì
        this.jpanel_center = new JPanel(new GridLayout(100, 1, 10, 10 ));
        MinimalScrollPane.createMinimalScrollPane(this.jpanel_center);
        JScrollPane scrollPane = MinimalScrollPane.createMinimalScrollPane(this.jpanel_center);
        for (int i = 0; i < 100; i++) {
            JPanel panel_word = createPanelWord(i);
            wordPanels.add(panel_word);  // Add to the list
            jpanel_center.add(panel_word);  // Add to the panel
        }


        // phần giao diện chính
        this.contentPane = new JPanel(new BorderLayout(10,10));
        this.contentPane.setBackground(new Color(225,255,255));
        this.contentPane.add(this.jpanel_befor, BorderLayout.NORTH);
        this.contentPane.add(scrollPane, BorderLayout.CENTER);

        ImageIcon icon = new ImageIcon("src\\view\\image\\title.png");
        this.setIconImage(icon.getImage());
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(25,25,112));
        this.add(contentPane, BorderLayout.CENTER);
        this.add(jpanel_tool, BorderLayout.WEST);

    }
    public JPanel createPanelWord(int index) {
        JPanel jpanel_book = new JPanel(new BorderLayout(10, 10));
        jpanel_book.setBackground(new Color(255, 255, 255));

        JPanel panel_word = new JPanel();
        panel_word.setBackground(new Color(255, 255, 255));
        panel_word.setLayout(new GridLayout(1, 3, 10, 10));

        JMenuItem lblNewLabel = new JMenuItem("Labelkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk " + index);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setForeground(new Color(64, 0, 128));
        jpanel_book.add(lblNewLabel, BorderLayout.CENTER);

        JLabel lblNewLabel_1 = new JLabel("");
        panel_word.add(lblNewLabel_1);

        JButton jbutton_borow = new OvalButton("Mượn");
        jbutton_borow.setBackground(new Color(75,0,130));
        jbutton_borow.setFont(new Font("Segoe UI", Font.ITALIC, 10));
        jbutton_borow.setForeground(new Color(255, 255, 255));
        jbutton_borow.setIcon(new ImageIcon("src\\view\\image\\plus.png"));
        panel_word.add(jbutton_borow);

        JButton jbotton_return = new OvalButton("Trả");
        jbotton_return.setBackground(new Color(25,25,112));
        jbotton_return.setFont(new Font("Tahoma", Font.ITALIC, 10));
        jbotton_return.setForeground(new Color(255, 255, 255));
        jbotton_return.setIcon(new ImageIcon("src\\view\\image\\minus.png"));
        panel_word.add(jbotton_return);

        JButton jbutton_see = new OvalButton("Xem");
        jbutton_see.setBackground(new Color(25,25,112));
        jbutton_see.setFont(new Font("Segoe UI", Font.ITALIC, 10));
        jbutton_see.setForeground(new Color(255, 255, 255));
        jbutton_see.setIcon(new ImageIcon("src\\view\\image\\see.png"));
        panel_word.add(jbutton_see);

        jpanel_book.add(panel_word, BorderLayout.EAST);

        return jpanel_book;
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

    public void addHoverEffect(JButton menuItem) {
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
            this.jbutton_home.setForeground(new Color(255, 255, 255));
            this.jbutton_home.setBackground(new Color(25,25,112));
        }else if(this.change.equals("Borrow")) {
            this.jbutton_borrowBooks.setForeground(new Color(255, 255, 255));
            this.jbutton_borrowBooks.setBackground(new Color(25,25,112));
        }else if(this.change.equals("Return")) {
            this.jbutton_returnBooks.setForeground(new Color(255, 255, 255));
            this.jbutton_returnBooks.setBackground(new Color(25,25,112));
        }else if(this.change.equals("Help")) {
            this.jbutton_help.setForeground(new Color(255, 255, 255));
            this.jbutton_help.setBackground(new Color(25,25,112));
        }else if(this.change.equals("Admin")) {
            this.jbutton_Admin.setForeground(new Color(255, 255, 255));
            this.jbutton_Admin.setBackground(new Color(25,25,112));
        }else if(this.change.equals("UserInfor")) {
            this.jbutton_home.setForeground(new Color(255, 255, 255));
            this.jbutton_home.setBackground(new Color(25,25,112));
        }
    }

}
