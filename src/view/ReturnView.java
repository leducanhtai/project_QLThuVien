package view;
import java.awt.*;

public class ReturnView {
    private LibraryManagementView libraryManagementView;
    public ReturnView(LibraryManagementView libraryManagementView) {
        this.libraryManagementView = libraryManagementView;
    }
    public void selectReturn() {
        libraryManagementView.clearPanel();
        this.libraryManagementView.setColorTool(this.libraryManagementView.change);
        this.libraryManagementView.change = "Return";
        this.libraryManagementView.jbutton_returnBooks.setForeground(new Color(64, 0, 128));
        this.libraryManagementView.jbutton_returnBooks.setBackground(new Color(0,191,255));

        this.libraryManagementView.contentPane.revalidate();
        this.libraryManagementView.contentPane.repaint();

    }
}
