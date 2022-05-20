package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

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
		FizzBuzz fizzbuzz =new FizzBuzz();
		List<String> abc = fizzbuzz.createFizzBuzzList(16);
		List<String> efg  = new ArrayList<>();
		efg.add("1");
		efg.add("2");
		efg.add("Fizz");
		efg.add("4");
		efg.add("Buzz");
		efg.add("Fizz");
		efg.add("7");
		efg.add("8");
		efg.add("Fizz");
		efg.add("Buzz");
		efg.add("11");
		efg.add("Fizz");
		efg.add("13");
		efg.add("14");
		efg.add("FizzBuzz");
		efg.add("16");
		
		assertIterableEquals(abc,efg);
	}
	@Test
	void test2() {
	FizzBuzz fizzbuzz =new FizzBuzz();
	List<String> abc = fizzbuzz.createFizzBuzzList(16);
	List<String> efg  = new ArrayList<>(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16"));
	
	assertIterableEquals(abc,efg);
	}
}


