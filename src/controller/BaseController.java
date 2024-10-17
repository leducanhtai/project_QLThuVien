package controller;

import view.LibraryManagementView;

public abstract class BaseController {
    protected LibraryManagementView libraryManagementView;

    public BaseController(LibraryManagementView libraryManagementView) {
        this.libraryManagementView = libraryManagementView;
    }

    // Bạn có thể thêm các phương thức chung mà các lớp con có thể sử dụng
    protected void exitApplication() {
        System.exit(0);
    }
}

