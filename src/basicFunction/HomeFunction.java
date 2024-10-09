package basicFunction;

import view.LibraryManagementView;

import javax.swing.*;
import java.awt.*;

public class HomeFunction extends BasicFunction {
    //private DictionaryView dictionaryView;
    public HomeFunction(LibraryManagementView libraryManagementView) {
        super(libraryManagementView);
    }
    public void selectHome() {
        // Xóa hết các phần tử trên contentPane
        this.libraryManagementView.clearPanel();

        // Đặt lại màu cho các mục trong jpanel_tool
        this.libraryManagementView.setColorTool(this.libraryManagementView.change);

        // Cập nhật trạng thái là "Home"
        this.libraryManagementView.change = "Home";
        this.libraryManagementView.jmenu_item_home.setForeground(new Color(64, 0, 128));
        this.libraryManagementView.jpanel_home.setBackground(new Color(154,205,50));

        // Thêm lại các thành phần ban đầu vào contentPane
        this.libraryManagementView.jpanel_search_tool.add(this.libraryManagementView.jlabel_2);
        this.libraryManagementView.contentPane.add(this.libraryManagementView.jpanel_search_befor, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(this.libraryManagementView.jpanel_center);  // Tạo lại JScrollPane
        this.libraryManagementView.contentPane.add(scrollPane, BorderLayout.CENTER);

        // Cập nhật lại giao diện
        this.libraryManagementView.contentPane.revalidate();
        this.libraryManagementView.contentPane.repaint();

    }
}
