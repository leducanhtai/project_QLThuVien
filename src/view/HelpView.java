package view;

import java.awt.*;

public class HelpView {
    private LibraryManagementView libraryManagementView;
    public HelpView(LibraryManagementView libraryManagementView) {
        this.libraryManagementView = libraryManagementView;
    }
    public void selectHelp() {
        libraryManagementView.clearPanel();
        this.libraryManagementView.setColorTool(this.libraryManagementView.change);
        this.libraryManagementView.change = "Help";
        this.libraryManagementView.jbutton_help.setForeground(new Color(64, 0, 128));
        this.libraryManagementView.jbutton_help.setBackground(new Color(0,191,255));

        // Cập nhật lại giao diện
        this.libraryManagementView.contentPane.revalidate();
        this.libraryManagementView.contentPane.repaint();

    }
}
