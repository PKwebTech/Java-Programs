import static org.junit.Assert.*;

import org.junit.Test;

import com.programs.DivisionClass;

public class DivisionTest {
	
	DivisionClass ob1=new DivisionClass(10,2);
	DivisionClass ob2=new DivisionClass(10,0);

		@Test
		public void test() {
			assertEquals(5, ob1.divisionnum());
		}

		@Test (expected = ArithmeticException.class)
		public void test1() {
			assertEquals(5, ob2.divisionnum());
		}
	}
