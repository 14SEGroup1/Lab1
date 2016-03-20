package lab1;

public class TeaBased implements SizeFactor {

	@Override
	public double sizeCost(String size) {
		//change to switch-case to reduce comparison times
		switch(size.toLowerCase()){
		case "small":return 0.2;
		case "medium":return 0.5;
		case "large":return 0.7;
		case "grand":return 0.9;
		//add new size here if necessary
		default:return 0;
		}
	}

}
