package P;

import java.util.ArrayList;
import java.util.List;

public class A3AggregationCoffeeMenu {
	
	private List<B3AggregationCoffee> coffeeList;
	
	public A3AggregationCoffeeMenu() {
		coffeeList = new ArrayList<B3AggregationCoffee>();
	}
	
	public void addCoffee(B3AggregationCoffee coffee) {
		coffeeList.add(coffee);
	}
	
	public int getNumberOfCofeeInMenu() {
		return coffeeList.size();
	}
	
	public List<B3AggregationCoffee> getCoffee() {
		return coffeeList;
	}

}
