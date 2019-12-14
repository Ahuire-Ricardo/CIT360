package Test;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.finalwarehouseproject.controller.ControlInventory;


public class TestUnit {
	
	static ControlInventory calc;
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
		calc = new ControlInventory();
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
		calc = new ControlInventory();
	}
	
	@Before
	public void before() {
		System.out.println("before()");
		calc = new ControlInventory();
	}
	
	@After
	public void after() {
		System.out.println("after()");
		calc.getServletContext();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void whenAssertingSameObject_thenSuccessfull() {
		System.out.println("whenAssertingSameObject_thenSuccessfull()");
	    String language = "Java";
	    Optional<String> optional = Optional.of(language);
	    assertSame(language, optional.get());
	}
	
	
}
