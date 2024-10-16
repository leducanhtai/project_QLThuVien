package test;

import view.LibraryManagementView;
import view.sign_in_up.SignIn;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new LibraryManagementView();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    ///////////
}
