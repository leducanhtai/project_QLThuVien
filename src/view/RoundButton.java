package view;

import javax.swing.*;
import java.awt.*;

public class RoundButton extends JButton {
    private int diameter;

    // Constructor để khởi tạo RoundButton với văn bản và đường kính
    public RoundButton(String text, int diameter) {
        super(text);
        this.diameter = diameter;
        setPreferredSize(new Dimension(diameter, diameter));  // Đặt kích thước mặc định cho nút
        setContentAreaFilled(false);  // Loại bỏ nền mặc định của JButton
        setFocusPainted(false);  // Loại bỏ đường viền khi nút được focus
        setBorderPainted(false);  // Loại bỏ viền
        setFont(new Font("Tahoma", Font.BOLD, 14));  // Đặt font chữ cho nút
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Vẽ hình tròn nền
        g2d.setColor(getBackground());
        g2d.fillOval(0, 0, diameter, diameter);

        // Vẽ nội dung của nút (văn bản hoặc icon)
        super.paintComponent(g2d);
        g2d.dispose();
    }

    @Override
    public void paintBorder(Graphics g) {
        // Không vẽ viền cho nút
    }

    @Override
    public boolean contains(int x, int y) {
        // Kiểm tra nếu điểm (x, y) nằm trong hình tròn
        int radius = diameter / 2;
        return Math.pow(x - radius, 2) + Math.pow(y - radius, 2) <= Math.pow(radius, 2);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(diameter, diameter);  // Đặt kích thước cho nút
    }
}
