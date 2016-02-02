package P;

import java.util.ArrayList;
import java.util.List;

public class ABController {
	
	public ABController() {
	
	}
	
	public void testSecondCase() {
		
		// First case for One-to-One
		// 2
		B2AssociationOneToOneInput bb = new B2AssociationOneToOneInput();
		bb.setbVar1(20);
		bb.setbVar2(10);
		
		A2AssociationOneToOne a2AssociationOneToOne = new A2AssociationOneToOne();
		a2AssociationOneToOne.linkB2 = bb;
		
		assert bb.getSummationOfVar1andVar2() == a2AssociationOneToOne.getSumationOfB2();
		System.out.println(String.format("Total of value: %d", a2AssociationOneToOne.getSumationOfB2()));

		System.out.println("-----------------");
		
		// First case for One-to-Many
		// 3
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
	
	public void testThirdCase() {
		
		// Second case: Aggregation
		// Coffee menu should have coffee
		// 4
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
		// Coffee should include with ingredients
		final float HOT_ESPRESSO_PRICE_FACTOR = 0.2f;
		
		B3AggregationCoffeeIngredient espressoShot = new B3AggregationCoffeeIngredient();
		espressoShot.setName("Espresso");
		espressoShot.setVolume(1);
		espressoShot.setPrice(40);
		
		B3AggregationCoffeeIngredient milk = new B3AggregationCoffeeIngredient();
		milk.setName("Milk");
		milk.setVolume(3);
		milk.setPrice(15);
		
		List<B3AggregationCoffeeIngredient> hotLatteIngredients = new ArrayList<B3AggregationCoffeeIngredient>();
		hotLatteIngredients.add(espressoShot);
		hotLatteIngredients.add(milk);
		
		A3AggregationCoffee hotLatte = new A3AggregationCoffee();
		hotLatte.addCoffeeIngredion(hotLatteIngredients);
		hotLatte.addCoffeePricesFactor(0.2f);
		hotLatte.setCoffeeLabel("Hot Latte");
		
		float costSum = espressoShot.getPrice() + milk.getPrice();
		assert((int)(costSum * HOT_ESPRESSO_PRICE_FACTOR) == hotLatte.getPrice());
		
		System.out.println(
				String.format(
							"Coffee: %s - $%d with ingredient(s) %s",
							hotLatte.getCoffeeLable(),
							hotLatte.getPrice(),
							hotLatte.getIngreedions()
						)
				);
	}
	
	public void testFourthCase() {
		
		A4Bozo bozo = new A4Bozo();
		bozo.setBozoClothes(new B4BozoZooClothes());
		
		assert("APQ-5743" == bozo.getBozoClothBrand());
		assert("Big hat, Red shirt, Green trousers and Big red shoe" == bozo.getBozoClothDetails());
		System.out.println(
					String.format(
							"Brand: %s\nDetail: %s", 
							bozo.getBozoClothBrand(), bozo.getBozoClothDetails()
						)
				);
		
	}
	
	public void testFifthCase() {
		
	}

	public static void main(String[] args) {
		
		ABController abController = new ABController();
		
		abController.testSecondCase();
		System.out.println("=================");
		abController.testThirdCase();
		System.out.println("=================");
		abController.testFourthCase();
		System.out.println("=================");
		abController.testFifthCase();
	}

}
