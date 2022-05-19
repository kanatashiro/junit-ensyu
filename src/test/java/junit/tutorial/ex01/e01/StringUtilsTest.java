package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

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
	@DisplayName("aaaの入力表示")
	void  toSnakeCase(){
		String result =StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", result,"aaa入力時");
			}
	
	@Test
	@DisplayName("HelloWorldの入力表示")
	void  toSnakeCase2(){
		String result =StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", result,"HelloWorld入力時");
			}
		
		
	@Test
	@DisplayName("practiceJunitの入力表示")
	void  toSnakeCase3(){
		String result =StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", result,"practiceJunit入力時");
			}

	}


