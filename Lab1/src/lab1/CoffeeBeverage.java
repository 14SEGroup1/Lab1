package lab1;

public class CoffeeBeverage extends Beverage {
	private String size;
	public CoffeeBeverage() {
		super.sizeFactor = new CoffeeBased();
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getDiscription(){
		return super.getDescription();
	}
	public void setDescription(String des){
		super.setDescription(des);
	}
	public double cost() {
		return super.cost() + super.sizeFactor.sizeCost(size);
	}
}
