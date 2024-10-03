package basicFunction;

import view.DictionaryView;

import javax.swing.*;
import java.awt.*;

public class BookReturnFunction extends BasicFunction {
   // private DictionaryView dictionaryView;
    public BookReturnFunction(DictionaryView dictionaryView) {
        super(dictionaryView);
    }
    public void selectReturn() {
        this.dictionaryView.clearPanel();
        this.dictionaryView.setColorTool(dictionaryView.change);
        this.dictionaryView.change = "Return";
        this.dictionaryView.jmenu_item_returnBooks.setForeground(new Color(64, 0, 128));
        this.dictionaryView.jpanel_returnBooks.setBackground(new Color(154,205,50));

        // Cập nhật lại giao diện
        this.dictionaryView.contentPane.revalidate();
        this.dictionaryView.contentPane.repaint();

    }
}
