package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Dictionary;

import adminFunction.AdminFunction;
import adminFunction.DisplayUserInfo;
import adminFunction.Login;
import view.DictionaryView;

public class DictionaryController implements ActionListener{
    private DictionaryView dictionaryView;
    private AdminFunction adminFunction;
    private Login login;
    private DisplayUserInfo displayUserInfo;
    private boolean check = false;
    //private DictionaryFuntion dictionaryFuntion;

    public DictionaryController(DictionaryView dictionaryView) {
        this.dictionaryView = dictionaryView;
    }
    public DictionaryController(Login login) {
        this.login = login;
    }
    public DictionaryController(DisplayUserInfo displayUserInfo) {
        this.displayUserInfo = displayUserInfo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String src = e.getActionCommand();
        if(src.equals("Exit")) {
            System.exit(0);
        }else if(src.equals("Borrow")) {
            this.dictionaryView.borrowedFunction.selectBorrow();
            System.out.println("đã ấn borrow");
        }else if(src.equals("Return")) {
            this.dictionaryView.bookReturnFunction.selectReturn();
            System.out.println("đã ấn return");
        }else if(src.equals("Home")) {
            this.dictionaryView.homeFunction.selectHome();
            System.out.println("đã ấn home");
        }else if(src.equals("Help")) {
            this.dictionaryView.helpFunction.selectHelp();
            System.out.println("đã ấn help");
        }else if(src.equals("Admin")) {
            if(this.check == false){
                this.dictionaryView.login.selectAdmin();
            }else if(this.check == true) this.login.adminTool();
            System.out.println("đã ấn admin");
        }else if(src.equals("Đăng nhập")) {
            boolean kt = this.login.checkDangNhap();
            if(kt){
                this.check = true;
                System.out.println(check);
                this.login.jLabel_checkDangNhap.setText(" ");
                this.login.adminTool();
                System.out.println(kt);
            }else if(!kt){
                System.out.println(kt);
                this.login.jLabel_checkDangNhap.setText("tên đăng nhâp hoặc mật khẩu sai");
            }
        }


    }

}