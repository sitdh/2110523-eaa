package test;

import static org.junit.Assert.*;

import org.junit.Test;

import P.A2AssociationOneToMany;
import P.B3;

public class AssociationWithOneToManyRelationshipTests {

	@Test
	public void testBShouldGetCorrectSum() {
		B3 b3 = new B3Mock();
		
		assertEquals(10, b3.getbVar1());
		assertEquals(20, b3.getbVar2());
		
		assertEquals(30, b3.getSummationOfVar1andVar2());
	}
	
	public void testAShouldGetSumOfMultipleInstanceOfB() {
		A2AssociationOneToMany a3 = new A2AssociationOneToMany();
		
		for(int i = 0; i < 3; i++) {
			B3 b3 = new B3Mock();
			a3.listOfB3.add(b3);
		}
		
		assertEquals(30, a3.getSumNumberOfBElements());
	}
	
	public class B3Mock extends B3 {
		
		public int getbVar1() {
			return 10;
		}
		
		public int getbVar2() {
			return 20;
		}
	}

}
