package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentManagementModel {
    private ArrayList<Student> students;

    public StudentManagementModel() {
        this.students = new ArrayList<>();
    }

    public ArrayList<Student> setStudents(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the input data into parts
                String[] studentData = line.split(" ");
                if (studentData.length == 7) {  // Expecting 7 fields
                    String fullName = studentData[0];
                    String libraryId = studentData[1];
                    String username = studentData[2];
                    String password = studentData[3];
                    String email = studentData[4];
                    String phone = studentData[5];
                    Integer age = Integer.valueOf(studentData[6]);

                    // Create a new Student object
                    Student student = new Student(fullName, libraryId, username, password, email, phone, age);
                    students.add(student);
                } else {
                    System.out.println("Skipping invalid data row: " + line);  // Optionally handle invalid data
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }

}