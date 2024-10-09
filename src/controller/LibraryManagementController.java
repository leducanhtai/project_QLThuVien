package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import adminFunction.AdminFunction;
import adminFunction.DisplayUserInfo;
import adminFunction.Login;
import view.LibraryManagementView;

public class LibraryManagementController implements ActionListener{
    private LibraryManagementView libraryManagementView;
    private AdminFunction adminFunction;
    private Login login;
    private DisplayUserInfo displayUserInfo;

    //private DictionaryFuntion dictionaryFuntion;

    public LibraryManagementController(LibraryManagementView libraryManagementView) {
        this.libraryManagementView = libraryManagementView;
    }
    public LibraryManagementController(Login login) {
        this.login = login;
    }
    public LibraryManagementController(DisplayUserInfo displayUserInfo) {
        this.displayUserInfo = displayUserInfo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String src = e.getActionCommand();
        if(src.equals("Exit")) {
            System.exit(0);
        }else if(src.equals("Borrow")) {
            this.libraryManagementView.borrowedFunction.selectBorrow();
            System.out.println("đã ấn borrow");
        }else if(src.equals("Return")) {
            this.libraryManagementView.bookReturnFunction.selectReturn();
            System.out.println("đã ấn return");
        }else if(src.equals("Home")) {
            this.libraryManagementView.homeFunction.selectHome();
            System.out.println("đã ấn home");
        }else if(src.equals("Help")) {
            this.libraryManagementView.helpFunction.selectHelp();
            System.out.println("đã ấn help");
        }else if(src.equals("Admin")) {
           // this.login.adminTool();
           // if(this.login.check == false){
                this.libraryManagementView.login.selectAdmin();
           // }else if(this.login.check == true) this.login.adminTool();
            System.out.println("đã ấn admin");
        }else if(src.equals("Đăng nhập")) {
            boolean kt = this.login.checkDangNhap();
           // if(kt){
               // this.login.check = true;
               // System.out.println(login.check);
                this.login.jLabel_checkDangNhap.setText(" ");
                this.login.adminTool();
                System.out.println(kt);
//            }else if(!kt){
//                System.out.println(kt);
//                this.login.jLabel_checkDangNhap.setText("tên đăng nhâp hoặc mật khẩu sai");
//            }
        }


    }

}