package junit.tutorial.ex02.e06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FrameworksTest {

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
	@CsvSource({"GlassFish,Oracle"
		,"GlassFish,DB2"
		,"GlassFish,PostgreSQL"
		,"GlassFish,MySQL"
		,"JBoss,Oracle"
		,"JBoss,DB2"
		,"JBoss,PostgreSQL"
		,"JBoss,MySQL","Tomcat,Oracle","Tomcat,DB2","Tomcat,PostgreSQL","Tomcat,MySQL"})
	void test(ApplicationServer app,Database db) {
		boolean pea = Frameworks.isSupport(app,db);		
	if(pea == true) {
		assertEquals(true, pea);
	}else {
		assertEquals(false, pea);
	}
	}

}
