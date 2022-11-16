import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	public void test1() {
		String s="hi";
		assertEquals("hi",s);
	}
	@Before
	public void beforetest() {
		System.out.println("before each test case");
	}
	@After
	public void aftertest() {
		System.out.println("After each test case");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before all testcase");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After all testcases");
	}

}
