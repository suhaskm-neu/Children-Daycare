package com.neu.csye6200.daycare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaycareApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaycareApplication.class, args);
        Student student = new Student("S01", "John", "abc@gmail.com", 5, "James", "Mary", "123 Main St", "1234567890");
        student.insertStudentIntoDatabase(student);
    }

}
