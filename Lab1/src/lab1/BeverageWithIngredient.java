package lab1;

public class BeverageWithIngredient extends Beverage {
	private Beverage drink;
	public BeverageWithIngredient(Beverage drink) {
		super();
		this.drink = drink;
		super.setDescription(drink.getDescription());
	}
	public double cost() {
		return drink.cost();
	}
	
}
