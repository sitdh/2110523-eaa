package P;

import java.util.List;

public class A3AggregationCoffee extends B3AggregationCoffee {
	
	protected List<B3AggregationCoffeeIngredient> ingredions;
	
	protected float coffeePriceFactor = 0f;
	
	public A3AggregationCoffee(List<B3AggregationCoffeeIngredient> ingredions, float coffeePriceFactor) {
		this.ingredions = ingredions;
		this.coffeePriceFactor = coffeePriceFactor;
	}
	
	public int getPrice() {
		float cost = 0f;
		
		for(B3AggregationCoffeeIngredient ingredient : ingredions) {
			cost += ingredient.getPrice();
		}
		
		return (int)(cost * (1f + coffeePriceFactor));
	}
	
	public String getIngreedions() {
		String ingredionList = "";
		
		for(B3AggregationCoffeeIngredient ingredient : ingredions) {
			ingredionList += String.format("%s ", ingredient.getName());
		}
		
		return ingredionList;
	}

}
