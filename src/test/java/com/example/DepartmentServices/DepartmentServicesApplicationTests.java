package com.example.DepartmentServices;

import com.example.DepartmentServices.models.Department;
import com.example.DepartmentServices.models.Employee;
import com.example.DepartmentServices.repositories.DepartmentRepository;
import com.example.DepartmentServices.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentServicesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddEmployee() {
		Department department = new Department("Finance");
		departmentRepository.save(department);
		Employee employee = new Employee("Kris", "Ana", department);
		employeeRepository.save(employee);
	}

}
