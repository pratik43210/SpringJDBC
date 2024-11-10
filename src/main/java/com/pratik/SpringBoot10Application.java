package com.pratik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pratik.model.Student;
import com.pratik.sevice.StudentService;

@SpringBootApplication
public class SpringBoot10Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBoot10Application.class, args);
		
		Student s=context.getBean(Student.class);
		s.setRoll(104);
		s.setName("Sonia");
		s.setMarks(78);
		
		StudentService service=context.getBean(StudentService.class);
		
		service.addStudent(s);
		
		System.out.println(service.getStudents());
	}

}
