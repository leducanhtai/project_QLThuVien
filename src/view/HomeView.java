package view;

import javax.swing.*;
import java.awt.*;

public class HomeView {
    private LibraryManagementView libraryManagementView;

    public HomeView(LibraryManagementView libraryManagementView) {
        this.libraryManagementView = libraryManagementView;
    }

    public void selectHome() {
        // Xóa hết các phần tử trên contentPane
        this.libraryManagementView.contentPane.removeAll();

        // Đặt lại màu cho các mục trong jpanel_tool
        this.libraryManagementView.setColorTool(this.libraryManagementView.change);

        // Cập nhật trạng thái là "Home"
        this.libraryManagementView.change = "Home";
        this.libraryManagementView.jbutton_home.setForeground(new Color(64, 0, 128));
        this.libraryManagementView.jbutton_home.setBackground(new Color(0, 191, 255));

        // Thêm lại các thành phần ban đầu vào contentPane
        this.libraryManagementView.jpanel_befor.add(this.libraryManagementView.jpanel_search_tool, BorderLayout.CENTER);
        this.libraryManagementView.contentPane.add(this.libraryManagementView.jpanel_befor, BorderLayout.NORTH);

        // Tạo JScrollPane và thêm các từ vựng
        JScrollPane scrollPane = MinimalScrollPane.createMinimalScrollPane(this.libraryManagementView.jpanel_center);
        this.libraryManagementView.contentPane.add(scrollPane, BorderLayout.CENTER);

        // Tải lại nội dung giao diện
        this.libraryManagementView.contentPane.revalidate();
        this.libraryManagementView.contentPane.repaint();
    }
}
