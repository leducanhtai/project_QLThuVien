package model;

public class Users extends Date {
    private int id;
    private String username;
    private String password;
    private String fullName;
    private String sex;
    private String email;
    private String phone;

    public Users(int id, String username, String password, String fullName, int day, int month, int year, String sex, String email, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        super.setDay(day);
        super.setMonth(month);
        super.setYear(year);
        this.sex = sex;
        this.email = email;
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    // Them nguoi dung
    public void addUsers() {

    }

    // Sua nguoi dung
    public void fixUsers() {

    }

    // Xoa nguoi dung
    public void deleteUsers() {

    }
    // Hien thi len man hinh
}
