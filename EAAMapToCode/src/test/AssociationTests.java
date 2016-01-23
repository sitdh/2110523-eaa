package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import P.A2;
import P.B2;

public class AssociationTests {

	@Test
	public void test() {
		
		A2 a2 = new A2();
		a2.linkB2 = new B2Mock();
		
		assertEquals(20, a2.getSumationOfB2());
	}
	
	public class B2Mock extends B2 {
		public int getbVar1() {
			return 10;
		}
		
		public int getbVar2() {
			return 10;
		}
	}

}
