package lab1;

public class CoffeeBased implements SizeFactor {

	@Override
	public double sizeCost(String size) {
		switch(size.toLowerCase()){
		case "small":return 0.4;
		case "medium":return 0.7;
		case "large":return 1.0;
		case "grand":return 1.3;
		//add new size here if necessary
		default:return 0;
	}
	}
}
