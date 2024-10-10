package adminFunction;

import controller.LibraryManagementController;
import model.AdminManagementModel;
import model.AdminModel;
import model.Student;
import model.StudentManagementModel;
import view.LibraryManagementView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Login extends AdminFunction {

    LibraryManagementController libraryManagementController = new LibraryManagementController(this);
    private JMenuItem jmenuItem_displayUserInfor;
    private JMenuItem jmenuItem_addUser;
    private JMenuItem jmenuItem_displayDocument;
    private JMenuItem jmenuItem_borrowDocument;
    public JPanel jpanel_admin_contenPane;


    private StudentManagementModel studentManagementModel;
    private JTable studentTable;


    public Login(LibraryManagementView dictionaryview) {
        super(dictionaryview);
        this.adminManagementModel = new AdminManagementModel();
        this.studentManagementModel = new StudentManagementModel();
    }

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



    public void dangNhap(){

        this.jtextField_tenDangNhap = new JTextField();
        this.jtextField_tenDangNhap.setFont(new Font("Tahoma", Font.BOLD, 30));

        this.jtextField_matKhau = new JTextField();
        this.jtextField_matKhau.setFont(new Font("Tahoma", Font.BOLD, 30));

        this.jlabel_tenDangNhap = new JLabel("Tên đăng nhập");
        this.jlabel_tenDangNhap.setFont(new Font("Tahoma", Font.BOLD, 30));

        this.jlabel_matKhau = new JLabel("Mật khẩu");
        this.jlabel_matKhau.setFont(new Font("Tahoma", Font.BOLD, 30));

        this.jLabel_checkDangNhap = new JLabel("");
        this.jLabel_checkDangNhap.setFont(new Font("Tahoma", Font.BOLD, 14));
        this.jLabel_checkDangNhap.setForeground(new Color(255,0,0));

        this.jmenu_item_DangNhap = new JMenuItem("Đăng nhập");
        this.jmenu_item_DangNhap.setFont(new Font("Tahoma", Font.BOLD, 40));
        this.jmenu_item_DangNhap.setForeground(new Color(255, 255, 255));
        this.jmenu_item_DangNhap.addActionListener(this.libraryManagementController);

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


        this.jpanel_noiDung_DangNhap = new JPanel(new GridLayout(5, 2, 10, 10));
        this.jpanel_noiDung_DangNhap.setBackground(new Color(154,205,50));
        this.jpanel_noiDung_DangNhap.add(this.libraryManagementView.jlabel_1);
        this.jpanel_noiDung_DangNhap.add(this.libraryManagementView.jlabel_2);

        this.jpanel_noiDung_DangNhap.add(this.jtextField_tenDangNhap);
        this.jpanel_noiDung_DangNhap.add(this.jlabel_tenDangNhap);
        this.jpanel_noiDung_DangNhap.add(this.jtextField_matKhau);
        this.jpanel_noiDung_DangNhap.add(this.jlabel_matKhau);
        this.jpanel_noiDung_DangNhap.add(this.jLabel_checkDangNhap);
        this.jpanel_noiDung_DangNhap.add(this.libraryManagementView.jlabel_9);

//        jpanel_noiDung_DangNhap.add(jlabel_11);
//        jpanel_noiDung_DangNhap.add(jlabel_10);


        this.jpanel_click_DangNhap = new JPanel(new BorderLayout());
        this.jpanel_click_DangNhap.setBackground(new Color(75,0,130));
        //jpanel_click_DangNhap.add(jLabel_checkDangNhap, BorderLayout.NORTH);
        this.jpanel_click_DangNhap.add(this.jmenu_item_DangNhap, BorderLayout.CENTER);
        this.jpanel_click_DangNhap.add(jpanel_khoangTrong_1, BorderLayout.NORTH);
        this.jpanel_click_DangNhap.add(jpanel_khoangTrong_3, BorderLayout.EAST);
        this.jpanel_click_DangNhap.add(jpanel_khoangTrong_2, BorderLayout.WEST);
        this.jpanel_click_DangNhap.add(jpanel_khoangTrong_4, BorderLayout.SOUTH);

        this.jpanel_DangNhap = new JPanel(new BorderLayout());
        this.jpanel_DangNhap.setBackground(new Color(154,205,50));
        this.jpanel_DangNhap.add(this.jpanel_noiDung_DangNhap, BorderLayout.CENTER);
        this.jpanel_DangNhap.add(this.jpanel_click_DangNhap, BorderLayout.SOUTH);

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

        addHoverEffect(jmenu_item_DangNhap);

        this.libraryManagementView.contentPane.add(jlabel_7, BorderLayout.NORTH);
        this.libraryManagementView.contentPane.add(jlabel_6, BorderLayout.EAST);
        this.libraryManagementView.contentPane.add(jlabel_5, BorderLayout.WEST);
        this.libraryManagementView.contentPane.add(jlabel_4, BorderLayout.SOUTH);
        this.libraryManagementView.contentPane.add(jpanel_DangNhap, BorderLayout.CENTER);
    }

    public boolean checkDangNhap() {
        // Get input username and password
        String tenAdmin = this.jtextField_tenDangNhap.getText();
        String matKhau = this.jtextField_matKhau.getText();

        // Fetch admin list
        this.adminManagementModel.setAdminList(); // Load the admin list from file

        // Check if username and password match any admin in the list
        ArrayList<AdminModel> adminList = adminManagementModel.getAdminList();  // Use the getter method

        for (AdminModel admin : adminList) {
            if (tenAdmin.equals(admin.getTenDangNhap()) && matKhau.equals(admin.getMatKhau())) {
                return true; // Login successful
            }
        }

        return false; // Login failed
    }
    public void selectAdmin() {
        this.libraryManagementView.clearPanel();
        this.libraryManagementView.setColorTool(this.libraryManagementView.change);
        this.libraryManagementView.change = "Admin";
        this.libraryManagementView.jmenu_item_Admin.setForeground(new Color(64, 0, 128));
        this.libraryManagementView.jpanel_Admin.setBackground(new Color(154,205,50));

        dangNhap();

        // Cập nhật lại giao diện
        this.libraryManagementView.contentPane.revalidate();
        this.libraryManagementView.contentPane.repaint();

    }

    public void adminTool(){
        this.libraryManagementView.clearPanel();
        JPanel jpanel_adminTool_displayUserInfor = new JPanel(new FlowLayout());
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

        this.libraryManagementView.contentPane.add(jpanel_adminTool, BorderLayout.NORTH);
        this.libraryManagementView.contentPane.add(jpanel_admin_contenPane, BorderLayout.CENTER);
        this.libraryManagementView.contentPane.revalidate();
        this.libraryManagementView.contentPane.repaint();


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
                menuItem.setForeground(originalColor); // Khôi phục màu ban đầu khi chuột ra
            }
        });
    }

    public void displayUserInfo() {
        // Clear all components from the panel
        jpanel_admin_contenPane.removeAll();

        // Load student data from the file
        this.studentManagementModel.setStudents("src\\model\\data\\student.txt");
        ArrayList<Student> students = this.studentManagementModel.getStudents();

        // Define column names and populate table data
        String[] columnNames = {"Full Name", "Library ID", "Username", "Password", "Email", "Phone", "Age"};
        Object[][] data = new Object[students.size()][columnNames.length];

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            data[i][0] = student.getFullName();
            data[i][1] = student.getLibraryId();
            data[i][2] = student.getUsername();
            data[i][3] = student.getPassword();
            data[i][4] = student.getEmail();
            data[i][5] = student.getPhone();
            data[i][6] = student.getSoSachMuon();
        }

        // Create JTable with the student data
        studentTable = new JTable(data, columnNames);
        studentTable.setFillsViewportHeight(true);

        // Set custom font for table
        Font tableFont = new Font("Arial", Font.PLAIN, 16);  // Set font and size (e.g., 16pt)
        studentTable.setFont(tableFont);

        // Set row height to fit the new font size
        studentTable.setRowHeight(25);  // Adjust row height as needed

        // Wrap the table in a scroll pane
        JScrollPane scrollPane = new JScrollPane(studentTable);

        // Add the scroll pane to the panel
        jpanel_admin_contenPane.setLayout(new BorderLayout());
        jpanel_admin_contenPane.add(scrollPane, BorderLayout.CENTER);

        // Refresh the panel to display the updated content

        jpanel_admin_contenPane.revalidate();
        jpanel_admin_contenPane.repaint();
    }


}
