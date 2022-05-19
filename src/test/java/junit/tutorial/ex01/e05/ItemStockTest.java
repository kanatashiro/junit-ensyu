package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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
		ItemStock itemStock =new ItemStock();
		Item item =new Item("book",250);
		
		int result = itemStock.getNum(item);
		assertEquals(0, result,"初期状態");
		
	}
	
	@Test
	void test2() {
		ItemStock itemStock =new ItemStock();
		Item item =new Item("book",250);
		itemStock.add(item);
		int result = itemStock.getNum(item);
		assertEquals(1, result,"１個カートに追加");
		
	}
	@Test
	void test3() {
		ItemStock itemStock =new ItemStock();
		Item item =new Item("book",250);
		itemStock.add(item);
		int result = itemStock.getNum(item);
		assertEquals(1, result,"１個カートに追加");
		
	}
	

	@Test
	void test4() {
	ItemStock itemStock =new ItemStock();
	Item item =new Item("book",250);
	itemStock.add(item);
	itemStock.add(item);
	int result = itemStock.getNum(item);
	assertEquals(2, result,"2個カートに追加");
	
}
	@Test
	void test5() {
	ItemStock itemStock =new ItemStock();
	Item item =new Item("book",250);
	itemStock.add(item);
	Item item2 =new Item("CD",300);
	itemStock.add(item2);
	int result = itemStock.getNum(item);
	assertEquals(1, result,"１個カートに追加、違う商品を追加");
	
}
}