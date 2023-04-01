package com.shyamit;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shyamit.entity.Employee;
import com.shyamit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);

		Employee e1 = new Employee(2, "Orlen", 5000.00, "Male", "Sales");
		Employee e2 = new Employee(3, "Charles", 15000.00, "Male", "Admin");
		Employee e3 = new Employee(4, "Smith", 25000.00, "Male", "Marketing");
		Employee e4 = new Employee(5, "Cathy", 35000.00, "Fe-Male", "Account");
		Employee e5 = new Employee(6, "Robert", 45000.00, "Male", "HR");
		Employee e6 = new Employee(7, "David", 55000.00, "Male", "Manager");
				
				repository.saveAll(Arrays.asList(e1, e2, e3, e4, e5, e6));
				System.out.println("record saved...");


	}

}
