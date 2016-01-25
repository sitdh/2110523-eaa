package P;

import java.util.List;

public class ABController {
	
	public ABController() {
	
	}
	
	public void testFirstCase() {
		
		// First case for One-to-One
		
		B2AssociationOneToOneInput bb = new B2AssociationOneToOneInput();
		bb.setbVar1(20);
		bb.setbVar2(10);
		
		A2AssociationOneToOne a2AssociationOneToOne = new A2AssociationOneToOne();
		a2AssociationOneToOne.linkB2 = bb;
		
		assert bb.getSummationOfVar1andVar2() == a2AssociationOneToOne.getSumationOfB2();
		System.out.println(String.format("Total of value: %d", a2AssociationOneToOne.getSumationOfB2()));

		System.out.println("-----------------");
		
		// First case for One-to-Many
		A2AssociationOneToMany a2AssociationOneToMany = new A2AssociationOneToMany();
		
		for(int i = 0; i < 2; i++) {
			B2AssociationOneToManyInput bb1 = new B2AssociationOneToManyInput();
			bb1.setbVar1(10 * (i + 1));
			bb1.setbVar2(20);
			a2AssociationOneToMany.listOfB3.add(bb1);
		}
		
		int summationOfVar1 = 0;
		
		for(B2AssociationOneToManyInput b : a2AssociationOneToMany.listOfB3) {
			System.out.println(String.format("Variable 1 has number %d", b.getbVar1()));
			summationOfVar1 += b.getbVar1();
		}
		
		System.out.println(String.format("Total of summation: %d", summationOfVar1));
	}
	
	public void testSecondCase() {
		
		// Second case: Aggregation
		// Coffee menu should have coffee
		
		A3AggregationCoffeeMenu coffeeMenu = new A3AggregationCoffeeMenu();
		
		B3AggregationCoffee espresso = new B3AggregationCoffee();
		espresso.setCoffeeLabel("Espresso");
		espresso.setPrice(50);
		
		B3AggregationCoffee latte = new B3AggregationCoffee();
		latte.setCoffeeLabel("Latte");
		latte.setPrice(80);
		
		coffeeMenu.addCoffee(espresso);
		coffeeMenu.addCoffee(latte);
		
		assert(2 == coffeeMenu.getNumberOfCofeeInMenu());
		List<B3AggregationCoffee> coffees = coffeeMenu.getCoffee();
		for(B3AggregationCoffee coffee : coffees) {
			System.out.println(
					String.format(
							"Menu: %s $%d", 
							coffee.getCoffeeLable(), 
							coffee.getPrice()
							)
					);
		}
		
		System.out.println("-----------------");
		
		// Second case: Composition
		
		
		
		
		
		
	}
	
	public void testThirdCase() {
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		ABController abController = new ABController();
		
		abController.testFirstCase();
		System.out.println("=================");
		abController.testSecondCase();
		System.out.println("=================");
		abController.testThirdCase();

	}

}
