package test;

import static org.junit.Assert.*;

import org.junit.Test;

import P.A3AggregationCoffeeMenu;
import P.B3AggregationCoffee;

public class A3AggregationCoffeeMenuTests {

//	@Test
//	public void testMenuShouldHaveCoffeeList() {
//		A3AggregationCoffeeMenu coffeeMenu = new A3AggregationCoffeeMenu();
//		assertEquals(0, coffeeMenu.coffeeList);
//	}
//	
//	@Test
//	public void testCoffeeShouldAddCoffeeIntoList() {
//		A3AggregationCoffeeMenu coffeeMenu = new A3AggregationCoffeeMenu();
//		coffeeMenu.coffeeList.add(new B3AggregationCoffeeMock());
//		
//		B3AggregationCoffee coffee = coffeeMenu.coffeeList.iteration();
//		
//		assertEquals("Coffee", coffee.getCoffeeLable());
//		assertEquals(150, coffee.getPrice());
//	}
	
	public class B3AggregationCoffeeMock extends B3AggregationCoffee {
		
		public String getCoffeeLabel() {
			return "Coffee";
		}
		
		public int getPrice() {
			return 150;
		}
	}

}
