package view;
// check git.llll
import adminFunction.Login;
import basicFunction.*;
import controller.DictionaryController;
import model.AdminModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DictionaryView extends JFrame {

    public JPanel contentPane;
    private JPanel jpanel_tool;
    private JPanel jpanel_search;
    public JPanel jpanel_search_tool;
    public JPanel jpanel_search_befor;
    public JPanel jpanel_center;

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


    private List<JPanel> wordPanels = new ArrayList<>();

    public String change;

//    private JCheckBox jcheckbox_remember;
//    private JMenuItem jmenu_item_dowload;

    public DictionaryController dictionaryController = new DictionaryController(this);
    public BorrowedFunction borrowedFunction = new BorrowedFunction(this);
    public BookReturnFunction bookReturnFunction = new BookReturnFunction(this);
    public HomeFunction homeFunction = new HomeFunction(this);
    public HelpFunction helpFunction = new HelpFunction(this);
    public Login login = new Login(this);

    public DictionaryView() {

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

        // phần tìm kiếm gồm cá các chức năng khác
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
