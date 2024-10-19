package view;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class MinimalScrollPane {

    public static JScrollPane createMinimalScrollPane(JComponent component) {
        JScrollPane scrollPane = new JScrollPane(component);

        // Remove the borders for a clean look
        scrollPane.setBorder(BorderFactory.createEmptyBorder());

        // Customize the vertical scrollbar
        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        verticalScrollBar.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(200, 200, 200);  // Light gray thumb color
                this.trackColor = new Color(240, 240, 240);  // Very light gray track color
            }

            @Override
            protected JButton createDecreaseButton(int orientation) {
                return createInvisibleButton();
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                return createInvisibleButton();
            }

            private JButton createInvisibleButton() {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(0, 0));
                button.setMinimumSize(new Dimension(0, 0));
                button.setMaximumSize(new Dimension(0, 0));
                return button;
            }
        });

        verticalScrollBar.setPreferredSize(new Dimension(8, Integer.MAX_VALUE));  // Thin scrollbar

        return scrollPane;
    }
}
