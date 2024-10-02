package basicFunction;

import view.DictionaryView;

import java.awt.*;

public class HelpFunction {
    private DictionaryView dictionaryView;
    public HelpFunction(DictionaryView dictionaryView) {
        this.dictionaryView = dictionaryView;
    }
    public void selectHelp() {
        this.dictionaryView.clearPanel();
        this.dictionaryView.setColorTool(this.dictionaryView.change);
        this.dictionaryView.change = "Help";
        this.dictionaryView.jmenu_item_help.setForeground(new Color(64, 0, 128));
        this.dictionaryView.jpanel_help.setBackground(new Color(154,205,50));

        // Cập nhật lại giao diện
        this.dictionaryView.contentPane.revalidate();
        this.dictionaryView.contentPane.repaint();

    }
}
