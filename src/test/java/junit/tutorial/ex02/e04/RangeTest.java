package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

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
    @ValueSource(doubles = {-0.1,0.0,10.5,10.6})
   void test(double value) {   
    Range range =new Range(0.0, 10.5);
    boolean suuji  = range.contains(value);
    if(suuji == true) {
 	   assertEquals(true,suuji,"範囲以内");
    }else{
 	   assertEquals(false,suuji,"範囲以外");
    }
   }
    
   @ParameterizedTest
   @ValueSource(doubles = {-5.2,-5.1,5.1,5.2})
  void test2(double value) {   
   Range range =new Range(-5.2, 5.2);
   boolean suuji  = range.contains(value);
   if(suuji == true) {
	   assertEquals(true,suuji,"範囲以内");
   }else{
	   assertEquals(false,suuji,"範囲以外");
   }
   }
}

    
   
	
    
    
    	  
  
    	
   		    
		
		
		
		
	


