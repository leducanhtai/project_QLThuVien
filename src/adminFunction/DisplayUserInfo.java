package adminFunction;

import controller.LibraryManagementController;
import view.LibraryManagementView;

public class DisplayUserInfo extends AdminFunction {

    private Login login;
    LibraryManagementController libraryManagementController = new LibraryManagementController(this);
    public DisplayUserInfo(LibraryManagementView libraryManagementView) {
        super(libraryManagementView);
    }
    public void displayUserInfo() {


    }

}
