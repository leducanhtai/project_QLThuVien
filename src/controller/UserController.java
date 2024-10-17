package controller;

import view.LibraryManagementView;

public class UserController extends BaseController {
    public UserController(LibraryManagementView libraryManagementView) {
        super(libraryManagementView);
    }

    public void displayUserInfo() {
        this.libraryManagementView.displayUserInfo();
        System.out.println(libraryManagementView.changeModel.getChange_admin());
    }

    public void editUser() {
        this.libraryManagementView.adminView.editUser();
        System.out.println(libraryManagementView.changeModel.getChange_admin());
    }

    public void clickSearch() {
        this.libraryManagementView.adminView.clickSearchUser();
        this.libraryManagementView.changeModel.setChange_admin("");
    }
}


