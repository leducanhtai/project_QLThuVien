package view;

import controller.DictionaryController;
import model.AdminModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class DictionaryView extends JFrame {
    private AdminModel adminModel;
    public JPanel contentPane;
    private JPanel jpanel_tool;
    private JPanel jpanel_search;
    private JPanel jpanel_search_tool;
    private JPanel jpanel_search_befor;
    private JPanel jpanel_center;

    private JTextField jtextField_search;
    private JMenuItem jmenu_item_search;

    private JMenuItem jmenu_item_home;
    private JMenuItem jmenu_item_exit;
    public JMenuItem jmenu_item_borrowBooks;
    private JMenuItem jmenu_item_returnBooks;
    private JMenuItem jmenu_item_Admin;
    private JMenuItem jmenu_item_help;

    private JPanel jpanel_home;
    private JPanel jpanel_exit;
    public JPanel jpanel_borrowBooks;
    private JPanel jpanel_returnBooks;
    private JPanel jpanel_Admin;
    private JPanel jpanel_help;

    // phần đăng nhập của admin
    private JTextField jtextField_tenDangNhap;
    private JTextField jtextField_matKhau;
    private JLabel jlabel_tenDangNhap;
    private JLabel jlabel_matKhau;
    public JLabel jLabel_checkDangNhap;
    private JMenuItem jmenu_item_DangNhap;
    private JPanel jpanel_DangNhap;
    private JPanel jpanel_click_DangNhap;
    private JPanel jpanel_noiDung_DangNhap;


    private JButton jbutton_start_game;
    private JButton jbutton_home;

    private JLabel jlabel_1;
    private JLabel jlabel_2;
    private JLabel jlabel_3;
    private JLabel jlabel_4;
    private JLabel jlabel_5;
    private JLabel jlabel_6;
    private JLabel jlabel_7;
    private JLabel jlabel_8;
    private JLabel jlabel_9;
    private JLabel jlabel_10;
    private JLabel jlabel_11;


    private List<JPanel> wordPanels = new ArrayList<>();

    public String change;

//    private JCheckBox jcheckbox_remember;
//    private JMenuItem jmenu_item_dowload;

    DictionaryController dictionaryController = new DictionaryController(this);
    public DictionaryFuntion dictionaryFuntion = new DictionaryFuntion(this);

    public DictionaryView() {
        this.adminModel = new AdminModel();
        this.init();
        this.setVisible(true);
        this.change = "";
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
        this.jmenu_item_home.addActionListener(dictionaryController);
        this.jpanel_home = new JPanel(new BorderLayout());
        this.jpanel_home.setBackground(new Color(154,205,50));
        this.jpanel_home.add(this.jmenu_item_home, BorderLayout.CENTER);

        this.jmenu_item_Admin = new JMenuItem("Admin");
        this.jmenu_item_Admin.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jmenu_item_Admin.setForeground(new Color(255, 255, 255));
        this.jmenu_item_Admin.setIcon(new ImageIcon("src\\view\\image\\Admin.png"));
        this.jmenu_item_Admin.addActionListener(dictionaryController);
        this.jpanel_Admin = new JPanel(new BorderLayout());
        this.jpanel_Admin.setBackground(new Color(0, 128, 64));
        this.jpanel_Admin.add(this.jmenu_item_Admin, BorderLayout.CENTER);

        this.jmenu_item_borrowBooks = new JMenuItem("Borrow");
        this.jmenu_item_borrowBooks.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jmenu_item_borrowBooks.setForeground(new Color(255, 255, 255));
        this.jmenu_item_borrowBooks.setIcon(new ImageIcon("src\\view\\image\\borrow.png"));
        this.jmenu_item_borrowBooks.addActionListener(dictionaryController);
        this.jpanel_borrowBooks = new JPanel(new BorderLayout());
        this.jpanel_borrowBooks.setBackground(new Color(0, 128, 64));
        this.jpanel_borrowBooks.add(this.jmenu_item_borrowBooks, BorderLayout.CENTER);

        this.jmenu_item_returnBooks = new JMenuItem("Return");
        this.jmenu_item_returnBooks.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jmenu_item_returnBooks.setForeground(new Color(255, 255, 255));
        this.jmenu_item_returnBooks.setIcon(new ImageIcon("src\\view\\image\\return.png"));
        this.jmenu_item_returnBooks.addActionListener(dictionaryController);
        this.jpanel_returnBooks = new JPanel(new BorderLayout());
        this.jpanel_returnBooks.setBackground(new Color(0, 128, 64));
        this.jpanel_returnBooks.add(this.jmenu_item_returnBooks, BorderLayout.CENTER);

        this.jmenu_item_exit = new JMenuItem("Exit");
        this.jmenu_item_exit.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jmenu_item_exit.setForeground(new Color(255, 255, 255));
        this.jmenu_item_exit.setIcon(new ImageIcon("src\\view\\image\\exit.png"));
        this.jmenu_item_exit.addActionListener(dictionaryController);

        this.jmenu_item_help = new JMenuItem("Help");
        this.jmenu_item_help.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jmenu_item_help.setForeground(new Color(255, 255, 255));
        this.jmenu_item_help.setIcon(new ImageIcon("src\\view\\image\\help.png"));
        this.jmenu_item_help.addActionListener(dictionaryController);
        this.jpanel_help = new JPanel(new BorderLayout());
        this.jpanel_help.setBackground(new Color(0, 128, 64));
        this.jpanel_help.add(this.jmenu_item_help, BorderLayout.CENTER);

        this.jmenu_item_search = new JMenuItem("Search");
        this.jmenu_item_search.setFont(new Font("Tahoma", Font.BOLD, 40));
        this.jmenu_item_search.setForeground(new Color(255, 255, 255));
        this.jmenu_item_search.setIcon(new ImageIcon("src\\view\\image\\search.png"));
        this.jmenu_item_search.addActionListener(dictionaryController);

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

        // chỉ là phần tạo khoang trắng cho thẩm mĩ
        this.jlabel_1 = new JLabel(" ");
        this.jlabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
        this.jlabel_1.setBackground(new Color(0, 128, 64));

        // chỉ là phần tạo khoang trắng cho thẩm mĩ
        this.jlabel_2 = new JLabel(" ");
        this.jlabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
        this.jlabel_2.setBackground(new Color(0, 128, 64));

        // chỉ là phần tạo khoang trắng cho thẩm mĩ
        this.jlabel_3 = new JLabel(" kkkkk");
        this.jlabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
        this.jlabel_3.setBackground(new Color(0, 128, 64));

        // chỉ là phần tạo khoang trắng cho thẩm mĩ
        this.jlabel_8 = new JLabel("");
        this.jlabel_8.setFont(new Font("Tahoma", Font.BOLD, 10));
        this.jlabel_8.setBackground(new Color(0, 128, 64));

        // chỉ là phần tạo khoang trắng cho thẩm mĩ
        this.jlabel_9 = new JLabel("");
        this.jlabel_9.setFont(new Font("Tahoma", Font.BOLD, 10));
        this.jlabel_9.setBackground(new Color(0, 128, 64));

        // chỉ là phần tạo khoang trắng cho thẩm mĩ
        this.jlabel_10 = new JLabel("");
        this.jlabel_10.setFont(new Font("Tahoma", Font.BOLD, 10));
        this.jlabel_10.setBackground(new Color(0, 128, 64));

        // chỉ là phần tạo khoang trắng cho thẩm mĩ
        this.jlabel_11 = new JLabel("");
        this.jlabel_11.setFont(new Font("Tahoma", Font.BOLD, 10));
        this.jlabel_11.setBackground(new Color(0, 128, 64));

        // phaanf tìm kiếm chính
        this.jpanel_search = new JPanel(new BorderLayout());
        this.jpanel_search.setBackground(new Color(208, 255, 208));
        this.jpanel_search.add(this.jtextField_search, BorderLayout.CENTER);
        this.jpanel_search.add(this.jmenu_item_search , BorderLayout.EAST);

        // phần tìm kiếm gôồm cá các chức năng khác
        this.jpanel_search_tool = new JPanel(new GridLayout(1, 2));
        this.jpanel_search_tool.setBackground(new Color(208, 255, 208));
        this.jpanel_search_tool.add(this.jpanel_search);
        this.jpanel_search_tool.add(this.jlabel_2);

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

//    public void selectBorrow() {
//        clearPanel();
//        setColorTool(change);
//        change = "Borrow";
//        jmenu_item_borrowBooks.setForeground(new Color(64, 0, 128));
//        this.jpanel_borrowBooks.setBackground(new Color(154,205,50));
//
//        // Tạo một JButton mới
//        JButton gameButton = new JButton("Start Game");
//        gameButton.setFont(new Font("Segoe UI", Font.BOLD, 30));
//        gameButton.setBackground(new Color(0, 128, 64));
//        gameButton.setForeground(Color.GREEN);
//
//        // Thêm JButton vào giữa panel
//        this.contentPane.add(gameButton, BorderLayout.CENTER);
//
//        // Cập nhật lại giao diện
//        this.contentPane.revalidate();
//        this.contentPane.repaint();
//
//    }

    public void selectHome() {
        // Xóa hết các phần tử trên contentPane
        clearPanel();

        // Đặt lại màu cho các mục trong jpanel_tool
        setColorTool(change);

        // Cập nhật trạng thái là "Home"
        change = "Home";
        jmenu_item_home.setForeground(new Color(64, 0, 128));
        this.jpanel_home.setBackground(new Color(154,205,50));

        // Thêm lại các thành phần ban đầu vào contentPane
        this.contentPane.add(this.jpanel_search_befor, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(this.jpanel_center);  // Tạo lại JScrollPane
        this.contentPane.add(scrollPane, BorderLayout.CENTER);

        // Cập nhật lại giao diện
        this.contentPane.revalidate();
        this.contentPane.repaint();

    }
    public void selectHelp() {
        clearPanel();
        setColorTool(change);
        change = "Help";
        jmenu_item_help.setForeground(new Color(64, 0, 128));
        this.jpanel_help.setBackground(new Color(154,205,50));

        // Cập nhật lại giao diện
        this.contentPane.revalidate();
        this.contentPane.repaint();

    }
    // phần đăng nhập cho admin
    public void dangNhap(){

        jtextField_tenDangNhap = new JTextField();
        jtextField_tenDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 20));

        jtextField_matKhau = new JTextField();
        jtextField_matKhau.setFont(new Font("Tahoma", Font.PLAIN, 20));

        jlabel_tenDangNhap = new JLabel("Tên đăng nhập");
        jlabel_tenDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 20));

        jlabel_matKhau = new JLabel("Mật khẩu");
        jlabel_matKhau.setFont(new Font("Tahoma", Font.PLAIN, 20));

        jLabel_checkDangNhap = new JLabel("");
        jLabel_checkDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 12));
        jLabel_checkDangNhap.setForeground(new Color(255,0,0));

        jmenu_item_DangNhap = new JMenuItem("Đăng nhập");
        jmenu_item_DangNhap.setFont(new Font("Tahoma", Font.BOLD, 40));
        jmenu_item_DangNhap.setForeground(new Color(255, 255, 255));
        jmenu_item_DangNhap.addActionListener(dictionaryController);

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


        jpanel_noiDung_DangNhap = new JPanel(new GridLayout(5, 2, 10, 10));
        jpanel_noiDung_DangNhap.setBackground(new Color(154,205,50));
        jpanel_noiDung_DangNhap.add(jlabel_1);
        jpanel_noiDung_DangNhap.add(jlabel_2);

        jpanel_noiDung_DangNhap.add(jtextField_tenDangNhap);
        jpanel_noiDung_DangNhap.add(jlabel_tenDangNhap);
        jpanel_noiDung_DangNhap.add(jtextField_matKhau);
        jpanel_noiDung_DangNhap.add(jlabel_matKhau);
        jpanel_noiDung_DangNhap.add(jLabel_checkDangNhap);
        jpanel_noiDung_DangNhap.add(jlabel_9);

//        jpanel_noiDung_DangNhap.add(jlabel_11);
//        jpanel_noiDung_DangNhap.add(jlabel_10);


        jpanel_click_DangNhap = new JPanel(new BorderLayout());
        jpanel_click_DangNhap.setBackground(new Color(75,0,130));
        //jpanel_click_DangNhap.add(jLabel_checkDangNhap, BorderLayout.NORTH);
        jpanel_click_DangNhap.add(jmenu_item_DangNhap, BorderLayout.CENTER);
        jpanel_click_DangNhap.add(jpanel_khoangTrong_1, BorderLayout.NORTH);
        jpanel_click_DangNhap.add(jpanel_khoangTrong_3, BorderLayout.EAST);
        jpanel_click_DangNhap.add(jpanel_khoangTrong_2, BorderLayout.WEST);
        jpanel_click_DangNhap.add(jpanel_khoangTrong_4, BorderLayout.SOUTH);

        jpanel_DangNhap = new JPanel(new BorderLayout());
        jpanel_DangNhap.setBackground(new Color(154,205,50));
        jpanel_DangNhap.add(jpanel_noiDung_DangNhap, BorderLayout.CENTER);
        jpanel_DangNhap.add(jpanel_click_DangNhap, BorderLayout.SOUTH);

        this.jlabel_4 = new JLabel("       ");
        this.jlabel_4.setFont(new Font("Tahoma", Font.BOLD, 80));
        this.jlabel_4.setBackground(new Color(0, 128, 64));

        this.jlabel_5 = new JLabel("       ");
        this.jlabel_5.setFont(new Font("Tahoma", Font.BOLD, 80));
        this.jlabel_5.setBackground(new Color(0, 128, 64));

        this.jlabel_6 = new JLabel("       ");
        this.jlabel_6.setFont(new Font("Tahoma", Font.BOLD, 80));
        this.jlabel_6.setBackground(new Color(0, 128, 64));

        this.jlabel_7 = new JLabel("        ");
        this.jlabel_7.setFont(new Font("Tahoma", Font.BOLD, 80));
        this.jlabel_7.setBackground(new Color(0, 128, 64));

//        this.jlabel_13 = new JLabel("        ");
//        this.jlabel_13.setFont(new Font("Tahoma", Font.BOLD, 80));
//        this.jlabel_13.setBackground(new Color(0, 128, 64));
//
        this.contentPane.add(jlabel_7, BorderLayout.NORTH);
        this.contentPane.add(jlabel_6, BorderLayout.EAST);
        this.contentPane.add(jlabel_5, BorderLayout.WEST);
        this.contentPane.add(jlabel_4, BorderLayout.SOUTH);
        this.contentPane.add(jpanel_DangNhap, BorderLayout.CENTER);
    }

    public boolean checkDangNhap(){
        String tenAdmin = this.jtextField_tenDangNhap.getText();
        String matKhau = this.jtextField_matKhau.getText();
        this.adminModel.adminModelList = this.adminModel.setAdminModelList();
        for(int i = 0; i<adminModel.adminModelList.size(); i++){
            AdminModel admin = adminModel.adminModelList.get(i);

            // Kiểm tra xem tenAdmin và matKhau có khớp không
            if (tenAdmin.equals(admin.getTenDangNhap()) && matKhau.equals(admin.getMatKhau())) {
                return true; // Đăng nhập thành công
            }
        }
        return false;
    }
    public void selectAdmin() {
        clearPanel();
        setColorTool(change);
        change = "Admin";
        jmenu_item_Admin.setForeground(new Color(64, 0, 128));
        this.jpanel_Admin.setBackground(new Color(154,205,50));

        dangNhap();

        // Cập nhật lại giao diện
        this.contentPane.revalidate();
        this.contentPane.repaint();

    }
    public void selectReturn() {
        clearPanel();
        setColorTool(change);
        change = "Return";
        jmenu_item_returnBooks.setForeground(new Color(64, 0, 128));
        this.jpanel_returnBooks.setBackground(new Color(154,205,50));

        // Cập nhật lại giao diện
        this.contentPane.revalidate();
        this.contentPane.repaint();

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
        }
    }

}
