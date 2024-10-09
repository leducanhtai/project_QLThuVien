package basicFunction;

import view.LibraryManagementView;

import java.awt.*;

public class HelpFunction extends BasicFunction {
    //private DictionaryView dictionaryView;
    public HelpFunction(LibraryManagementView libraryManagementView) {
        super(libraryManagementView);
    }
    public void selectHelp() {
        this.libraryManagementView.clearPanel();
        this.libraryManagementView.setColorTool(this.libraryManagementView.change);
        this.libraryManagementView.change = "Help";
        this.libraryManagementView.jmenu_item_help.setForeground(new Color(64, 0, 128));
        this.libraryManagementView.jpanel_help.setBackground(new Color(154,205,50));

        // Cập nhật lại giao diện
        this.libraryManagementView.contentPane.revalidate();
        this.libraryManagementView.contentPane.repaint();

    }
}
