package lab1;
/**
 * Created by handsome on 16/3/12.
 */
public class Decaf extends CoffeeBeverage{
	public Decaf() { 
		super.setDescription("Decaf"); 
	}
	public String getDescription() {
		return description;
	}
	public double cost() {
		return super.cost() + 0.5;
	}
}

