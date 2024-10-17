package controller;

import view.LibraryManagementView;

public class AdminController extends BaseController {

    public AdminController(LibraryManagementView libraryManagementView) {
        super(libraryManagementView);
    }
    public void selectAdmin(){
        // this.login.adminTool();
        // if(this.login.check == false){
                if(this.libraryManagementView.changeModel.getDangNhap_admin() == false)
                this.libraryManagementView.selectAdmin();
                else this.libraryManagementView.adminTool();
                this.libraryManagementView.changeModel.setChange_admin("");
        // }else if(this.login.check == true) this.login.adminTool();
    }

    public void adminDangNhap(){
         //boolean kt = this.libraryManagementView.checkDangNhap();
        //if(kt){

        //this.libraryManagementView.jLabel_checkDangNhap.setText(" ");
        this.libraryManagementView.changeModel.setChange_admin("");
                this.libraryManagementView.adminTool();
                this.libraryManagementView.changeModel.setDangNhap_admin(true);
        //System.out.println(kt);
        //            }else if(!kt){
        //                System.out.println(kt);
        //                this.login.jLabel_checkDangNhap.setText("tên đăng nhâp hoặc mật khẩu sai");
        //            }
    }
}

