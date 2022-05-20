package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class ConsumptionTaxTest {

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

	@ParameterizedTest
	@ValueSource(ints = {5,100})
	void test(int n) {
		ConsumptionTax consumptionTax = new ConsumptionTax(5);
	int answer = consumptionTax.apply(100);
	assertEquals(105,answer,"税率5%,入力値100の場合");
	
	}


@ParameterizedTest
@CsvSource({"5,3000","10,50","5,50","3,50" })
void test2(int n) {
	ConsumptionTax consumptionTax = new ConsumptionTax(5);
int answer = consumptionTax.apply(100);
assertEquals(105,answer,"まとめてテスト");

}
}