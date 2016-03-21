package lab1;

public class Ginger extends BeverageWithIngredient {
	public Ginger(Beverage drink) {
		super(drink);
		drink.addDescription(" ginger");
	}

	public double cost() {
		return 0.6 + super.cost();
	}
}