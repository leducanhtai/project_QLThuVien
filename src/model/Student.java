package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String fullName;
    private String libraryId;
    private String username;
    private String password;
    private String email;
    private String phone;
    private int numberOfBookBorrowed;

    public Student(String fullName,  String username, String password, String email, String phone) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.libraryId = "";
        this.numberOfBookBorrowed = 0;
    }

    public Student(String fullName, String libraryId, String username, String password,
                   String email, String phone, int soSachMuon) {
        this.fullName = fullName;
        this.libraryId = libraryId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.numberOfBookBorrowed = soSachMuon;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSoSachMuon() {
        return numberOfBookBorrowed;
    }

    public void setSoSachMuon(int soSachMuon) {
        this.numberOfBookBorrowed = soSachMuon;
    }

}
