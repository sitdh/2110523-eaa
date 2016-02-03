package com.sitdh.master.eaa.main;

public class ZController {
	
	public static void testCase1() {
		A1Motorbike a1 = new A1Motorbike();
		B1Helicopter b1 = new B1Helicopter();
		
		System.out.println(String.format("Motorbike wheel size:\t%f", a1.getWheelSize()));
		System.out.println(String.format("Motorbike length:\t%f", a1.getLength()));
		System.out.println(String.format("Motorbike blueprint:\t%s", a1.getBlueprint()));
		
		System.out.println("------------------------");
		
		System.out.println(String.format("Helicopter length:\t%f", b1.getPaddleLength()));
		System.out.println(String.format("Helicopter weight:\t%f", b1.getWeight()));
		System.out.println(String.format("Helicopter blueprint:\t%s", b1.getBlueprint()));
		
	}
	
	public static void testCase2() {
		
		A2PointOfSell pos = new A2PointOfSell();
		
		System.out.println(String.format("Cash available in machine: %f", pos.getCashDeposit()));
		System.out.println(String.format("Number of sell transaction available: %d", pos.getTransaction().length));

		System.out.println("------------------------");
		
		System.out.println(String.format("Staff name: %s", pos.getStaff().getName()));
		System.out.println(String.format("Staff working hour: %s", pos.getStaff().getWorkingHour()));
		System.out.println(String.format("Staff salary (bucks): %f", pos.getStaff().getSalary()));
	}
	
	public static void testCase3() {
		
		B3Coffee espresso = new B3Coffee();
		espresso.setName("Espresso");
		espresso.setSize("Tall");
		espresso.setPrice(3f);
		
		B3Coffee latte = new B3Coffee();
		latte.setName("Latte");
		latte.setSize("Grande");
		latte.setPrice(5.5f);
		
		A3CoffeeMenu coffeeMenu = new A3CoffeeMenu();
		coffeeMenu.addCoffee(espresso);
		coffeeMenu.addCoffee(latte);
		
		for(B3Coffee coffee : coffeeMenu.getCoffeeList()) {
			System.out.println(String.format("Name: %s", coffee.getName()));
			System.out.println(String.format("Size: %s", coffee.getSize()));
			System.out.println(String.format("Prise: $%f", coffee.getPrice()));
			
			System.out.println("------------------------");
		}
		
	}
	
	public static void testCase4() {
		throw new UnsupportedOperationException("Not implemented yet");
	}
	
	public static void testCase5() {
		throw new UnsupportedOperationException("Not implemented yet");
	}
	
	public static void testCase6() {
		throw new UnsupportedOperationException("Not implemented yet");
	}
	
	public static void testCase7() {
		throw new UnsupportedOperationException("Not implemented yet");
	}
	
	public static void testCase8() {
		throw new UnsupportedOperationException("Not implemented yet");
	}
	
	public static void testCase9() {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * #1
		 * 
		 * A and B has no relationship.
		 */
		ZController.testCase1();
		
		System.out.println("=============================");
		
		/**
		 * #2
		 * 
		 * "A" has unidirectional association with "B".
		 * 
		 * [ A ] (1) -------> (1) [ B ]
		 */
		ZController.testCase2();

		System.out.println("=============================");
		
		/**
		 * #3
		 * 
		 * "A" has bidirectional association with "B".
		 * 
		 * [ A ] (1) <-------> (*) [ B ]
		 */
		ZController.testCase3();
		
		System.out.println("=============================");
		
		/**
		 * #4
		 * 
		 * "A" has bidirectional association with "B".
		 * 
		 * [ A ] (1) <-------> (1) [ B ]
		 */
		ZController.testCase4();

		System.out.println("=============================");
		
		/**
		 * #5
		 * 
		 * "A" has unidirectional aggregation with "B".
		 * 
		 * [ A ] (1) <>------- (1) [ B ]
		 */
		ZController.testCase5();

		System.out.println("=============================");
		
		/**
		 * #6
		 * 
		 * A has unidirectional composition with "B".
		 * 
		 * [ A ] (1) <>------- (1) [ B ]
		 */
		ZController.testCase6();

		System.out.println("=============================");
		
		/**
		 * #7
		 * 
		 * A has unidirectional composition with "B".
		 * 
		 * [ A ] - - - - > [ B ] ------> [ C ]
		 */
		ZController.testCase7();

		System.out.println("=============================");
		
		/**
		 * #8
		 * 
		 * A has unidirectional aggregation with interface class "I" that was implemented by B.
		 * 
		 * [ A ] --------> [ I ] <+------- [ B ]
		 */
		ZController.testCase8();

		System.out.println("=============================");
		
		/**
		 * #9
		 * 
		 * "A" is superclass which inherited by "X", and there are contained in package "P".
		 * "Y" is a class contained in package "Q" that invoked "X" 
		 * 
		 * [ - P - ]
		 * [ A ] <+------ [ X ]
		 *                  ^ 
		 *                  |
		 * [ - Q - ]        |
		 *                [ Y ] 
		 */
		ZController.testCase9();
	}

}
