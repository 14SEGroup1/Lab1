package lab1;

public class Milk extends BeverageWithIngredient {
	public Milk(Beverage drink) {
		super(drink);
	}

	public double cost() {
		return 0.3 + super.cost();
	}
}
