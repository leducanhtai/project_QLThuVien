package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import adminFunction.AdminFunction;
//import adminFunction.DisplayUserInfo;
//import adminFunction.Login;
import model.Student;
import view.LibraryManagementView;
import view.sign_in_up.SignIn;

import javax.swing.table.DefaultTableModel;

public class LibraryManagementController implements ActionListener{
    private LibraryManagementView libraryManagementView;
    private AdminFunction adminFunction;

    private UserController userController;
    private SigInController  sigInController;
    private AdminController adminController;

    public LibraryManagementController(LibraryManagementView libraryManagementView) {
        this.libraryManagementView = libraryManagementView;
        this.userController = new UserController(libraryManagementView);
        this.sigInController = new SigInController(libraryManagementView);
        this.adminController = new AdminController(libraryManagementView);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String src = e.getActionCommand();
        if(src.equals("Exit")) {
            System.exit(0);

        }else if(src.equals("Borrow")) {
            this.libraryManagementView.selectBorrow();

        }else if(src.equals("Return")) {
            this.libraryManagementView.selectReturn();
        }else if(src.equals("Home")) {
            this.libraryManagementView.selectHome();
        }else if(src.equals("Help")) {
            this.libraryManagementView.selectHelp();
        }else if(src.equals("Admin")) {
            this.adminController.selectAdmin();
        }else if(src.equals("Đăng nhập")) {
            this.adminController.adminDangNhap();
        }else if(src.equals("     SIGN IN")) {
            sigInController.dangNhap();
        }else if(src.equals("UserInfor")) {
            userController.displayUserInfo();
        }else if(src.equals("Edit User")) {
            userController.editUser();
        }else if(src.equals("Search User")) {
            userController.clickSearch();
        }


    }



}