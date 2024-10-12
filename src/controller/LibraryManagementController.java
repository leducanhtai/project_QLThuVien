package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import adminFunction.AdminFunction;
//import adminFunction.DisplayUserInfo;
//import adminFunction.Login;
import view.LibraryManagementView;
import view.sign_in_up.SignIn;

import javax.swing.table.DefaultTableModel;

public class LibraryManagementController implements ActionListener{
    private LibraryManagementView libraryManagementView;
    private AdminFunction adminFunction;

    private SignIn signIn;

    //private DictionaryFuntion dictionaryFuntion;

    public LibraryManagementController(LibraryManagementView libraryManagementView) {
        this.libraryManagementView = libraryManagementView;
    }

    public LibraryManagementController(SignIn signIn) {this.signIn = signIn;}

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String src = e.getActionCommand();
        if(src.equals("Exit")) {
            System.exit(0);

        }else if(src.equals("Borrow")) {
            this.libraryManagementView.selectBorrow();

            System.out.println("đã ấn borrow");
        }else if(src.equals("Return")) {
            this.libraryManagementView.selectReturn();

            System.out.println("đã ấn return");
        }else if(src.equals("Home")) {
            this.libraryManagementView.selectHome();

            System.out.println("đã ấn home");
        }else if(src.equals("Help")) {
            this.libraryManagementView.selectHelp();

            System.out.println("đã ấn help");
        }else if(src.equals("Admin")) {
           // this.login.adminTool();
           // if(this.login.check == false){
                if(this.libraryManagementView.changeModel.getDangNhap_admin() == false) this.libraryManagementView.selectAdmin();
                else this.libraryManagementView.adminTool();
            this.libraryManagementView.changeModel.setChange_admin("");
           // }else if(this.login.check == true) this.login.adminTool();
            System.out.println("đã ấn admin");
        }else if(src.equals("Đăng nhập")) {
           // boolean kt = this.libraryManagementView.checkDangNhap();
           //if(kt){

                //this.libraryManagementView.jLabel_checkDangNhap.setText(" ");
                this.libraryManagementView.changeModel.setChange_admin("");
                this.libraryManagementView.adminTool();
                //System.out.println(kt);
//            }else if(!kt){
//                System.out.println(kt);
//                this.login.jLabel_checkDangNhap.setText("tên đăng nhâp hoặc mật khẩu sai");
//            }
        }else if(src.equals("     SIGN IN")) {
            System.out.println(src);
            if (signIn.checkDangNhap()) {
                signIn.closeLoginWindow();
                System.out.println("YES");
            } else {
                System.out.println("Login failed. Incorrect username or password.");
            }
        }else if(src.equals("UserInfor")) {
            this.libraryManagementView.displayUserInfo();
            System.out.println(libraryManagementView.changeModel.getChange_admin());
        }else if(src.equals("Search User")) {
            this.libraryManagementView.searchUser();
            System.out.println("đã ấn Search User");
            this.libraryManagementView.changeModel.setChange_admin("");
        }


    }



}