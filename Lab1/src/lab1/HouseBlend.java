package lab1;

public class HouseBlend extends CoffeeBeverage {
	protected Beverage drink;
	public HouseBlend() {
		super.setDescription("HouseBlend");
	}
	
	public String getDescription() {
		return description;
	}

	public double cost() {
		return super.cost() + 0.8;
	}
}
