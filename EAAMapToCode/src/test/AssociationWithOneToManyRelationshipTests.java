package test;

import static org.junit.Assert.*;

import org.junit.Test;

import P.A2AssociationOneToMany;
import P.B2AssociationOneToManyInput;

public class AssociationWithOneToManyRelationshipTests {

	@Test
	public void testBShouldGetCorrectSum() {
		B2AssociationOneToManyInput b3 = new B2Mock();
		
		assertEquals(10, b3.getbVar1());
		assertEquals(20, b3.getbVar2());
		
		assertEquals(30, b3.getSummationOfVar1andVar2());
	}
	
	public void testAShouldGetSumOfMultipleInstanceOfB() {
		A2AssociationOneToMany a3 = new A2AssociationOneToMany();
		
		for(int i = 0; i < 3; i++) {
			B2AssociationOneToManyInput b3 = new B2Mock();
			a3.listOfB3.add(b3);
		}
		
		assertEquals(30, a3.getSumNumberOfBElements());
	}
	
	public class B2Mock extends B2AssociationOneToManyInput {
		
		public int getbVar1() {
			return 10;
		}
		
		public int getbVar2() {
			return 20;
		}
	}

}
