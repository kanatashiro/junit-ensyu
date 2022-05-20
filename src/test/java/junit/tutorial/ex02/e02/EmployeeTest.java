package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		try {
		InputStream input = new FileInputStream("\\env\\springworkspace\\junit-ensyu\\src\\main\\java\\junit\\tutorial\\ex02\\e02\\Employee.txt");

				List<Employee> empList = Employee.load(input);
		  Employee employee = empList.get(0);
		  System.out.println(employee.getFirstName());
		  System.out.println(employee.getLastName());
		  System.out.println(employee.getEmail());
		  assertEquals("Ichiro",employee.getFirstName());
		  assertEquals("Tanaka",employee.getLastName());
		  assertEquals("ichiro@example.com",employee.getEmail());
		  
		  
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}

}
}
