package view;

import javax.swing.*;
import java.awt.*;

public class BorrowView {
    private LibraryManagementView libraryManagementView;
    public BorrowView(LibraryManagementView libraryManagementView) {
        this.libraryManagementView = libraryManagementView;
    }
    public void selectBorrow() {
        this.libraryManagementView.clearPanel();
        this.libraryManagementView.setColorTool(this.libraryManagementView.change);
        this.libraryManagementView.change = "Borrow";
        this.libraryManagementView.jbutton_borrowBooks.setForeground(new Color(64, 0, 128));
        this.libraryManagementView.jbutton_borrowBooks.setBackground(new Color(0,191,255));

        // Tạo một JButton mới
        JButton gameButton = new JButton("Start Game");
        gameButton.setFont(new Font("Segoe UI", Font.BOLD, 30));
        gameButton.setBackground(new Color(0, 128, 64));
        gameButton.setForeground(Color.GREEN);

        // Thêm JButton vào giữa panel
        this.libraryManagementView.contentPane.add(gameButton, BorderLayout.CENTER);

        // Cập nhật lại giao diện
        this.libraryManagementView.contentPane.revalidate();
        this.libraryManagementView.contentPane.repaint();

    }

}
