package basicFunction;

import view.LibraryManagementView;

import javax.swing.*;
import java.awt.*;

public class BorrowedFunction extends BasicFunction {
    //private DictionaryView dictionaryView;
    public BorrowedFunction(LibraryManagementView libraryManagementView) {
        super(libraryManagementView);
    }

    public void selectBorrow() {
        this.libraryManagementView.clearPanel();
        this.libraryManagementView.setColorTool(libraryManagementView.change);
        this.libraryManagementView.change = "Borrow";
        this.libraryManagementView.jmenu_item_borrowBooks.setForeground(new Color(64, 0, 128));
        this.libraryManagementView.jpanel_borrowBooks.setBackground(new Color(154,205,50));

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
