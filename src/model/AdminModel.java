package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdminModel {
    private String tenDangNhap;
    private String matKhau;
    public ArrayList<AdminModel> adminModelList;

    public AdminModel() {
        this.adminModelList = new ArrayList<AdminModel>();
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

    public ArrayList<AdminModel> setAdminModelList() {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\model\\data\\admin.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Assuming each line contains the username and password separated by space
                String[] details = line.split(" ");
                if (details.length == 2) {
                    AdminModel admin = new AdminModel();
                    admin.setTenDangNhap(details[0]);
                    admin.setMatKhau(details[1]);
                    this.adminModelList.add(admin);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return adminModelList;
    }
}

