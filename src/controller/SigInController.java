package controller;

import view.LibraryManagementView;

public class SigInController extends BaseController{

    public SigInController(LibraryManagementView libraryManagementView) {
        super(libraryManagementView);
    }
     public void dangNhap(){
         if (libraryManagementView.signIn.checkDangNhap()) {
        libraryManagementView.signIn.closeLoginWindow();
                System.out.println("YES");
            } else {
                    System.out.println("Login failed. Incorrect username or password.");
            }
     }
}

