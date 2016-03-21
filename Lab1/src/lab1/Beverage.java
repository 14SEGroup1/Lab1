package lab1;

public class Beverage {
	protected SizeFactor sizeFactor;
	protected String description;
	public double cost(){
		return 0;
	}
	public String getDescription(){
		return description;
	}
	public void setDescription(String des){
		description=des;
	}
	public void addDescription(String ingre){
		description+=ingre;
	}
}
