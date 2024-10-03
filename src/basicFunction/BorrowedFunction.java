package basicFunction;

import view.DictionaryView;

import javax.swing.*;
import java.awt.*;

public class BorrowedFunction extends BasicFunction {
    //private DictionaryView dictionaryView;
    public BorrowedFunction(DictionaryView dictionaryView) {
        super(dictionaryView);
    }

    public void selectBorrow() {
        this.dictionaryView.clearPanel();
        this.dictionaryView.setColorTool(dictionaryView.change);
        this.dictionaryView.change = "Borrow";
        this.dictionaryView.jmenu_item_borrowBooks.setForeground(new Color(64, 0, 128));
        this.dictionaryView.jpanel_borrowBooks.setBackground(new Color(154,205,50));

        // Tạo một JButton mới
        JButton gameButton = new JButton("Start Game");
        gameButton.setFont(new Font("Segoe UI", Font.BOLD, 30));
        gameButton.setBackground(new Color(0, 128, 64));
        gameButton.setForeground(Color.GREEN);

        // Thêm JButton vào giữa panel
        this.dictionaryView.contentPane.add(gameButton, BorderLayout.CENTER);

        // Cập nhật lại giao diện
        this.dictionaryView.contentPane.revalidate();
        this.dictionaryView.contentPane.repaint();

    }
}
