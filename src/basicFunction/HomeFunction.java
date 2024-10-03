package basicFunction;

import view.DictionaryView;

import javax.swing.*;
import java.awt.*;

public class HomeFunction extends BasicFunction {
    //private DictionaryView dictionaryView;
    public HomeFunction(DictionaryView dictionaryView) {
        super(dictionaryView);
    }
    public void selectHome() {
        // Xóa hết các phần tử trên contentPane
        this.dictionaryView.clearPanel();

        // Đặt lại màu cho các mục trong jpanel_tool
        this.dictionaryView.setColorTool(this.dictionaryView.change);

        // Cập nhật trạng thái là "Home"
        this.dictionaryView.change = "Home";
        this.dictionaryView.jmenu_item_home.setForeground(new Color(64, 0, 128));
        this.dictionaryView.jpanel_home.setBackground(new Color(154,205,50));

        // Thêm lại các thành phần ban đầu vào contentPane
        this.dictionaryView.jpanel_search_tool.add(this.dictionaryView.jlabel_2);
        this.dictionaryView.contentPane.add(this.dictionaryView.jpanel_search_befor, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(this.dictionaryView.jpanel_center);  // Tạo lại JScrollPane
        this.dictionaryView.contentPane.add(scrollPane, BorderLayout.CENTER);

        // Cập nhật lại giao diện
        this.dictionaryView.contentPane.revalidate();
        this.dictionaryView.contentPane.repaint();

    }
}
