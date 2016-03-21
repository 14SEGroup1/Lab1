package lab1;

public class Espresso extends CoffeeBeverage {
	public Espresso() {
		super.setDescription("Espresso");
	}
	public String getDescription() {
		return super.getDiscription();
	}
	public double cost() {
		return super.cost() + 1.0;
	}
}
