package com.sitdh.master.eaa.main;

public class ZController {
	
	public static void testCase1() {
		System.out.println("~~~~~~~~~~~~~~~~ Case 1 ~~~~~~~~~~~~~~~~");
		
		A1Motorbike a1 = new A1Motorbike();
		B1Helicopter b1 = new B1Helicopter();
		
		System.out.println(String.format("Motorbike wheel size:\t%,.2f", a1.getWheelSize()));
		System.out.println(String.format("Motorbike length:\t%,.2f", a1.getLength()));
		System.out.println(String.format("Motorbike blueprint:\t%s", a1.getBlueprint()));
		
		System.out.println("------------------------");
		
		System.out.println(String.format("Helicopter length:\t%,.2f", b1.getPaddleLength()));
		System.out.println(String.format("Helicopter weight:\t%,.2f", b1.getWeight()));
		System.out.println(String.format("Helicopter blueprint:\t%s", b1.getBlueprint()));
		
	}
	
	public static void testCase2() {
		System.out.println("~~~~~~~~~~~~~~~~ Case 2 ~~~~~~~~~~~~~~~~");
		
		A2PointOfSell pos = new A2PointOfSell();
		
		System.out.println(String.format("Cash available in machine: $%,.2f", pos.getCashDeposit()));
		System.out.println(String.format("Number of sell transaction available: %d", pos.getTransaction().length));

		System.out.println("------------------------");
		
		System.out.println(String.format("Staff name: %s", pos.getStaff().getName()));
		System.out.println(String.format("Staff working hour: %s", pos.getStaff().getWorkingHour()));
		System.out.println(String.format("Staff salary (bucks): $%,.2f", pos.getStaff().getSalary()));
	}
	
	public static void testCase3() {
		System.out.println("~~~~~~~~~~~~~~~~ Case 3 ~~~~~~~~~~~~~~~~");
		
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
		
		B3Coffee coffee = null;
		while(!coffeeMenu.getCoffeeList().isEmpty()) {
			coffee = coffeeMenu.getCoffeeList().firstElement();
			
			System.out.println(String.format("Name: %s", coffee.getName()));
			System.out.println(String.format("Size: %s", coffee.getSize()));
			System.out.println(String.format("Price: $%,.2f", coffee.getPrice()));
			
			coffeeMenu.getCoffeeList().remove(coffee);
			
			System.out.println("------------------------");
		}
		
	}
	
	public static void testCase4() {
		System.out.println("~~~~~~~~~~~~~~~~ Case 4 ~~~~~~~~~~~~~~~~");
		
		A4Dish largeDish = new A4Dish();
		B4Food salad = new B4Food();
		
		largeDish.setFood(salad);
		salad.setPlaceInDish(largeDish);
		
		System.out.println(String.format("Dish size:\t%s", largeDish.getDishSize()));
		System.out.println(String.format("Color:\t\t%s", largeDish.getColor()));
		System.out.println(String.format("Food in dish:\t%s", largeDish.food.getName()));
		
		System.out.println("------------------------");
		
		System.out.println(String.format("Food name:\t%s", salad.getName()));
		System.out.println(String.format("Food price:\t$%,.2f", salad.getPrice()));
		System.out.println(String.format("Food description:%s", salad.getDescription()));
		System.out.println(String.format("Place in dish:\t%s", salad.placeInDish.getDishSize()));
	}
	
	public static void testCase5() {
		System.out.println("~~~~~~~~~~~~~~~~ Case 5 ~~~~~~~~~~~~~~~~");
		
		A5Department department = new A5Department();
		department.setName("Computer Engineering");
		department.setDepartmentDescription("The computer engineering faculty members enjoy a close relationship with the applied mathematics and statistics, computer science, electrical engineering, and computational biology faculty members. Faculty members carry out joint research projects, supervise students, and teach courses outside their own departments. ");
		
		B5Professor schlag = new B5Professor();
		schlag.setName("Martine");
		schlag.setLastname("Schlag");
		schlag.setRoom("Engineering 2, Room 219");
		schlag.setOfficehour("Winter 16: W 12:30-1:30pm, F 11-12pm, Spring 16: to be determined");
		
		B5Professor obraczka = new B5Professor();
		obraczka.setName("Katia");
		obraczka.setLastname("Obraczka");
		obraczka.setRoom("Engineering 2, Room 323");
		obraczka.setOfficehour("Wednesdays 9-10:30am");
		
		department.addProfessor(schlag);
		department.addProfessor(obraczka);
		
		System.out.println(String.format("Department name:\t\t%s", department.getName()));
		System.out.println(String.format("Department description:\t%s", department.getDepartmentDescription()));
		
		System.out.println("------------------------");
		
		for(B5Professor professor : department.getProfessors()) {
			System.out.println(String.format("Name:\t\t%s %s", professor.getName(), professor.getLastname()));
			System.out.println(String.format("Room:\t\t%s", professor.getRoom()));
			System.out.println(String.format("Office hour:\t%s", professor.getOfficehour()));
		}
		
	}
	
	public static void testCase6() {
		System.out.println("~~~~~~~~~~~~~~~~ Case 6 ~~~~~~~~~~~~~~~~");
		
		B6CoordinatePoint focusA = new B6CoordinatePoint(3, 5);
		B6CoordinatePoint focusB = new B6CoordinatePoint(20, 5);
		
		A6Ellipse ellipse = new A6Ellipse(16, focusA, focusB);
		System.out.println(String.format("Focus A: (%d, %d)", ellipse.getFocusPointA().getX(), ellipse.getFocusPointA().getY()));
		System.out.println(String.format("Focus B: (%d, %d)", ellipse.getFocusPointB().getX(), ellipse.getFocusPointB().getY()));
		System.out.println(String.format("Major axis lenth: %,.2f", ellipse.getMajorAxis()));
		System.out.println(String.format("Minor axis lenth: %,.2f", ellipse.getMinorAxis()));
		
		System.out.println("Draw: " + ellipse.rendorEllipse());
		
	}
	
	public static void testCase7() {
		System.out.println("~~~~~~~~~~~~~~~~ Case 7 ~~~~~~~~~~~~~~~~");
		
		A7Customer customer = new A7Customer();
		B7Waiter waiter = new B7Waiter();
		
		customer.callForWaiter(waiter);
		customer.makeAnOrder("Coconut Milk Soup with Chicken");
	}
	
	public static void testCase8() {
		System.out.println("~~~~~~~~~~~~~~~~ Case 8 ~~~~~~~~~~~~~~~~");
		
		A8Driver taxiDriver = new A8Driver();
		I8Car taxi = new B8TaxiCar();
		
		taxiDriver.getinTheCar(taxi);
		taxiDriver.drive();
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
		
		System.out.println();
		
		/**
		 * #2
		 * 
		 * "A" has unidirectional association with "B".
		 * 
		 * [ A ] (1) -------> (1) [ B ]
		 */
		ZController.testCase2();

		System.out.println();
		
		/**
		 * #3
		 * 
		 * "A" has bidirectional association with "B".
		 * 
		 * [ A ] (1) <-------> (*) [ B ]
		 */
		ZController.testCase3();
		
		System.out.println();
		
		/**
		 * #4
		 * 
		 * "A" has bidirectional association with "B".
		 * 
		 * [ A ] (1) <-------> (1) [ B ]
		 */
		ZController.testCase4();

		System.out.println();
		
		/**
		 * #5
		 * 
		 * "A" has unidirectional aggregation with "B".
		 * 
		 * [ A ] (1) <>------- (1) [ B ]
		 */
		ZController.testCase5();

		System.out.println();
		
		/**
		 * #6
		 * 
		 * A has unidirectional composition with "B".
		 * 
		 * [ A ] (1) <>------- (1) [ B ]
		 */
		ZController.testCase6();

		System.out.println();
		
		/**
		 * #7
		 * 
		 * A has unidirectional composition with "B".
		 * 
		 * [ A ] - - - - > [ B ] ------> [ C ]
		 */
		ZController.testCase7();

		System.out.println();
		
		/**
		 * #8
		 * 
		 * A has unidirectional aggregation with interface class "I" that was implemented by B.
		 * 
		 * [ A ] --------> [ I ] <+------- [ B ]
		 */
		ZController.testCase8();

		System.out.println();
		
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
