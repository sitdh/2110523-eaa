package P;

import java.util.List;

public class A3AgregationCoffee extends B3AggregationCoffee {
	
	protected List<B3AggregationCoffeeIngredion> ingredions;
	
	protected float coffeePriceFactor = 0f;
	
	public A3AgregationCoffee(List<B3AggregationCoffeeIngredion> ingredions, float coffeePriceFactor) {
		this.ingredions = ingredions;
		this.coffeePriceFactor = coffeePriceFactor;
	}
	
	public float coffeePrice() {
		float cost = 0f;
		
		for(B3AggregationCoffeeIngredion ingredion : ingredions) {
			cost += ingredion.getPrice();
		}
		
		return cost * coffeePriceFactor;
	}

}
