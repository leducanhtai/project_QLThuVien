package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Student {
    private int idStudent;
    private String nameStudent;
    private boolean gender;
    private LocalDate birthDate;
    private String phone;
    public static ArrayList<Student> students = new ArrayList<Student>();
    public String genderStr;

    public int getIdStudent() { return idStudent; }

    public void setIdStudent(int idStudent) { this.idStudent = idStudent; }

    public String getnameStudent() { return nameStudent; }

    public void setnameStudent(String nameStudent) { this.nameStudent = nameStudent; }

    public boolean isGender() { return gender; }

    public void setGender(boolean gender) { this.gender = gender; }

    public LocalDate getBirthDate() { return birthDate; }

    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public Student() {
    }

    public String getGenderStr() { return genderStr; }

    public void setGenderStr(String genderStr) { this.genderStr = genderStr; }

    public Student(int idStudent, String nameStudent, String genderStr, LocalDate birthDate, String phone) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.genderStr = genderStr;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public static void getStudents() {
        // Lay ma hoc sinh add vao danh sach
    }

    public static boolean checkStudentId(int idStudent) {
        // Kiem tra ma hoc sinh
    }

    public static boolean generateNewStudent() {
        // Tao ma hoc sinh tu tang
    }

    public boolean addStudent(String nameStudent, String genderStr, LocalDate birthDate, String phone) {
        // add them sinh vien
    }

    public boolean deleteStudent(int idStudent) {
        // Xoa sinh vien
    }

    public boolean updateStudent(int idStudent, String nameStudent, String genderStr, LocalDate birthDate, String phone) {
        // Cap nhat thong tin
    }

    public static ArrayList<Student> list_Student(int idStudent) {
        // Lay thong tin cua mot doc gia
    }


}
