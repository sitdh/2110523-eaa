package P;

import java.util.List;

public class A3AggregationCoffee extends B3AggregationCoffee {
	
	protected List<B3AggregationCoffeeIngredient> ingredions;
	
	protected float coffeePriceFactor = 0f;
	
	public void addCoffeeIngredion(List<B3AggregationCoffeeIngredient> ingredions) {
		this.ingredions = ingredions;
	}
	
	public void addCoffeePricesFactor(float coffeePriceFactor) {
		this.coffeePriceFactor = 1f + coffeePriceFactor;
	}
	
	public int getPrice() {
		float cost = 0f;
		
		for(B3AggregationCoffeeIngredient ingredient : ingredions) {
			cost += ingredient.getPrice();
		}
		
		return (int)(cost * coffeePriceFactor);
	}
	
	public String getIngreedions() {
		String ingredionList = "";
		
		for(B3AggregationCoffeeIngredient ingredient : ingredions) {
			ingredionList += String.format("%s ", ingredient.getName());
		}
		
		return ingredionList;
	}

}
