package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

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
	@DisplayName("引数に１０を入力したとき")
	void test() {
		boolean result = NumberUtils.isEven(10);
		assertEquals(true,result,"偶数の場合");
	
	}
	@Test
	@DisplayName("引数に7を入力したとき")
	void test2() {
		boolean result = NumberUtils.isEven(7);
		assertEquals(false,result,"奇数の場合");

}
}
