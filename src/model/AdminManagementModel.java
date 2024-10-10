package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AdminManagementModel {
    private ArrayList<AdminModel> adminList;
    public AdminManagementModel() {
        this.adminList = new ArrayList<>();
    }
    public ArrayList<AdminModel> setAdminList() {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\model\\data\\admin.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Assuming each line contains the username and password separated by space
                String[] details = line.split(" ");
                if (details.length == 2) {
                    AdminModel admin = new AdminModel();
                    admin.setTenDangNhap(details[0]);
                    admin.setMatKhau(details[1]);
                    this.adminList.add(admin);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return adminList;
    }
    public ArrayList<AdminModel> getAdminList() {
        return adminList;  // Added getter method for adminList
    }
}
