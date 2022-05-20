package junit.tutorial.ex01.e03;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

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
		Counter counter = new Counter();
		int result = counter.increment();
		assertEquals(1, result,"１回廻すとき１を出すとき");
	}
	@Test
	void test2() {
	
		Counter conter = new Counter();
		for(int i=1;i<=1;i++) {
			conter.increment();
		}
		int result = conter.increment();
		assertEquals(2, result,"1回廻して２を出すとき");
	
	}
	@Test
	void test3() {
		Counter conter = new Counter();
		for(int i=1;i<=50;i++) {
			conter.increment();
		}
		
		assertEquals(51,conter.increment(),"50回廻して51をだす");
	}
	
	


}
