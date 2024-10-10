package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdminModel {
    private String tenDangNhap;
    private String matKhau;


    public AdminModel() {

    }
    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }
    public String getTenDangNhap() {
        return tenDangNhap;
    }
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    public String getMatKhau() {
        return matKhau;
    }


}

