package basicFunction;

import view.LibraryManagementView;

import java.awt.*;

public class BookReturnFunction extends BasicFunction {
   // private DictionaryView dictionaryView;
    public BookReturnFunction(LibraryManagementView libraryManagementView) {
        super(libraryManagementView);
    }
    public void selectReturn() {
        this.libraryManagementView.clearPanel();
        this.libraryManagementView.setColorTool(libraryManagementView.change);
        this.libraryManagementView.change = "Return";
        this.libraryManagementView.jmenu_item_returnBooks.setForeground(new Color(64, 0, 128));
        this.libraryManagementView.jpanel_returnBooks.setBackground(new Color(154,205,50));

        // Cập nhật lại giao diện
        this.libraryManagementView.contentPane.revalidate();
        this.libraryManagementView.contentPane.repaint();

    }

}
