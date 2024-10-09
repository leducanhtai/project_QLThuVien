package model;

import java.io.*;
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

public class Student {
    private String fullName;
    private String libraryId;
    private String username;
    private String password;

    public Student(String fullName, String libraryId, String username, String password) {
        this.fullName = fullName;
        this.libraryId = libraryId;
        this.username = username;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getLibraryId() {
        return libraryId;
    }
    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

public static List<Student> readStudentsFromFile(String fileName) {
    List<Student> students = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        String line;
        while ((line = br.readLine()) != null) {
            // Tách dữ liệu trong file đầu vào thành các phần
            String[] studentData = line.split(",");
            if (studentData.length == 4) {
                String fullName = studentData[0];
                String libraryId = studentData[1];
                String username = studentData[2];
                String password = studentData[3];
                // Thêm đối tượng mới vào danh sách
                Student student = new Student(fullName, libraryId, username, password);
                students.add(student);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return students;
}