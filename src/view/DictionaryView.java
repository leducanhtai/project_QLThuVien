package view;

import controller.DictionaryController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class DictionaryView extends JFrame {
    private JPanel contentPane;
    private JPanel jpanel_tool;
    private JPanel jpanel_search;
    private JPanel jpanel_search_tool;
    private JPanel jpanel_search_befor;
    private JPanel jpanel_center;

    private JTextField jtextField_search;
    private JMenuItem jmenu_item_search;

    private JMenuItem jmenu_item_home;
    private JMenuItem jmenu_item_exit;
    private JMenuItem jmenu_item_game;
    private JMenuItem jmenu_item_translate;
    private JMenuItem jmenu_item_help;


    private JButton jbutton_start_game;
    private JButton jbutton_home;

    private JLabel jlabel_1;
    private JLabel jlabel_2;
    private JLabel jlabel_3;

    private List<JPanel> wordPanels = new ArrayList<>();

    private String change;

//    private JCheckBox jcheckbox_remember;
//    private JMenuItem jmenu_item_dowload;

    DictionaryController dictionaryController = new DictionaryController(this);
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

        this.jmenu_item_translate = new JMenuItem("Translate");
        this.jmenu_item_translate.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jmenu_item_translate.setForeground(new Color(255, 255, 255));
        this.jmenu_item_translate.setIcon(new ImageIcon("src\\view\\image\\translate.png"));
        this.jmenu_item_translate.addActionListener(dictionaryController);

        this.jmenu_item_game = new JMenuItem("Game");
        this.jmenu_item_game.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jmenu_item_game.setForeground(new Color(255, 255, 255));
        this.jmenu_item_game.setIcon(new ImageIcon("src\\view\\image\\game.png"));
        this.jmenu_item_game.addActionListener(dictionaryController);

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

        this.jmenu_item_search = new JMenuItem("Search");
        this.jmenu_item_search.setFont(new Font("Tahoma", Font.BOLD, 40));
        this.jmenu_item_search.setForeground(new Color(255, 255, 255));
        this.jmenu_item_search.setIcon(new ImageIcon("src\\view\\image\\search.png"));
        this.jmenu_item_search.addActionListener(dictionaryController);

        // phần chứa các chức năng
        this.jpanel_tool = new JPanel(new GridLayout(10, 1));
        this.jpanel_tool.setBackground(new Color(0, 128, 64));
        this.jpanel_tool.add(this.jmenu_item_home);
        this.jpanel_tool.add(this.jmenu_item_translate);
        this.jpanel_tool.add(this.jmenu_item_game);
        this.jpanel_tool.add(this.jmenu_item_exit);
        this.jpanel_tool.add(this.jmenu_item_help);

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

        JCheckBox chckbxNewCheckBox = new JCheckBox("Remembered");
        chckbxNewCheckBox.setFont(new Font("Tahoma", Font.ITALIC, 20));
        chckbxNewCheckBox.setBackground(new Color(208, 255, 208));

        // Thêm icon vào JCheckBox
        ImageIcon uncheckedIcon = new ImageIcon("src\\view\\image\\bright_2.png");
        ImageIcon checkedIcon = new ImageIcon("src\\view\\image\\bright.png");

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

    public void runGame() {
        clearPanel();
        setColorTool(change);
        change = "Game";
        jmenu_item_game.setForeground(new Color(64, 0, 128));

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
    public void startGame() {

    }
    public void selectHome() {
        // Xóa hết các phần tử trên contentPane
        clearPanel();

        // Đặt lại màu cho các mục trong jpanel_tool
        setColorTool(change);

        // Cập nhật trạng thái là "Home"
        change = "Home";
        jmenu_item_home.setForeground(new Color(64, 0, 128));

        // Thêm lại các thành phần ban đầu vào contentPane
        this.contentPane.add(this.jpanel_search_befor, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(this.jpanel_center);  // Tạo lại JScrollPane
        this.contentPane.add(scrollPane, BorderLayout.CENTER);

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
        }else if(this.change.equals("Game")) {
            this.jmenu_item_game.setForeground(new Color(255, 255, 255));
        }
    }
}
