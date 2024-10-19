package view;

import javax.swing.*;
import java.awt.*;

public class OvalTextField extends JTextField {

    public OvalTextField(int columns) {
        super(columns);
        setOpaque(false);
        setFont(new Font("Tahoma", Font.BOLD, 16));
    }

    @Override
    protected void paintComponent(Graphics g) {

        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 60, 60);

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 60, 60);
    }

    @Override
    public Insets getInsets() {
        return new Insets(10, 10, 10, 10);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(150, 40);
    }
}

