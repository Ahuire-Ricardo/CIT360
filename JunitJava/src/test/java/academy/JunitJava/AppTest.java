package academy.JunitJava;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Optional;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Unit test for simple App.
 */

@RunWith(value = Parameterized.class)
public class AppTest {
	
	@Parameters
	public static Iterable<Object[]> getData() {
		return Arrays.asList(new Object[] [] {
			{3,1,4}, {2,3,5}, {3,3,6}
		});
	}
	
	static App calc;
	private int a, b, exp;
	
	public AppTest(int a, int b, int exp) {
		this.a = a;
		this.b = b;
		this.exp = exp;
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
		calc = new App();
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
		calc = new App();
	}
	
	@Before
	public void before() {
		System.out.println("before()");
		calc = new App();
	}
	
	@After
	public void after() {
		System.out.println("after()");
		calc.clear();
	}
	
	@Test
    public void myTestArray(){
	   System.out.println("TestArray()");
       String[] expectedOutput = {"apple", "mango", "grape"};
       String[] methodOutput = {"apple", "mango", "grape"};
       assertArrayEquals(expectedOutput, methodOutput);
    }
	
	@Test
	public void testSum() {
		System.out.println("sum()");
		int res = calc.sum(a, b);
		//int expected = 5;
		assertEquals(exp,res);
	}
	
	@Test
	public void testAnsSum() {
		System.out.println("ansSum()");
		calc.sum(a, b);
		int res = calc.ans();
		//int expected = 5;
		assertEquals(exp,res);
	}
    
	@Test
	public void testSubtraction() {
		System.out.println("subtraction()");
		int tot = calc.subtraction(3, 2);
		int expected = 1;
		assertEquals(expected,tot);
	}
	
	@Test
	public void testAnsSubtraction() {
		System.out.println("ansSubtraction()");
		calc.subtraction(3, 2);
		int res = calc.ans();
		int expected = 1;
		assertEquals(expected,res);
	}
	
	@Test
	public void testDiv() {
		System.out.println("Div()");
		calc.div(a, b);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivZero() {
		System.out.println("testDivZero()");
		calc.div(a, 0);
		assertNotNull(calc.div(a, 0));
	}
	
	@Test
    public void evenNumberTest(){
		System.out.println("evenNumber()");
		assertFalse(calc.isEvenNumber(3));
    }
	
	@Test
	public void compareNumber() {
		System.out.println("compareNumber()");
		assertTrue(4<5);
	}
	
	@Test
	public void whenAssertingSameObject_thenSuccessfull() {
		System.out.println("whenAssertingSameObject_thenSuccessfull()!");
	    String language = "Java";
	    Optional<String> optional = Optional.of(language);
	    assertSame(language, optional.get());
	}
	
   
}
