package adminFunction;

public class Change {
    private String change_admin;
    private boolean dangNhap_admin;
    public Change() {
        this.change_admin = "";
        this.dangNhap_admin = false;
    }
    public String getChange_admin() {
        return change_admin;
    }
    public void setChange_admin(String change_admin) {
        this.change_admin = change_admin;
    }
    public boolean getDangNhap_admin() {
        return dangNhap_admin;
    }
    public void setDangNhap_admin(boolean dangNhap_admin) {
        this.dangNhap_admin = dangNhap_admin;
    }
}
