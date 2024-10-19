package view;

import javax.swing.*;
import java.awt.*;

public class OvalButtonRight extends JButton {

    public OvalButtonRight(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setFont(new Font("Tahoma", Font.BOLD, 16));
        setHorizontalAlignment(SwingConstants.RIGHT); // Căn chỉnh văn bản về phía phải nếu muốn
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Vẽ hình chữ nhật với bo tròn chỉ hai góc bên phải
        g2d.setColor(getBackground());
        int width = getWidth();
        int height = getHeight();
        int arc = 60; // Độ bo tròn của góc

        // Vẽ phần bo tròn ở góc phải trên và góc phải dưới
        g2d.fillArc(width - arc, 0, arc, height, 270, 180); // Vẽ bo tròn hai góc bên phải

        // Vẽ phần còn lại của nút (hình chữ nhật bên trái, không bo tròn)
        g2d.fillRect(0, 0, width - arc / 2, height); // Hình chữ nhật cho phần trái

        // Vẽ phần còn lại của nút (văn bản)
        super.paintComponent(g);
    }

    @Override
    public void paintBorder(Graphics g) {
        // Không vẽ viền cho nút
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(150, 40); // Kích thước đề xuất cho nút
    }
}
