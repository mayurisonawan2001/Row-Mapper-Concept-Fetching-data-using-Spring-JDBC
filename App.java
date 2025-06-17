package com.springjdbc;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springjdbc.dao.StudentDao;
import com.springjdbc.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        // ✅ Get one student by ID
        Student student = studentDao.getStudentById(101);
        System.out.println(student);

        // ✅ Get all students
        List<Student> students = studentDao.getAllStudents();
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
