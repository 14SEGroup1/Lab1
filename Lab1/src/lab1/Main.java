package lab1;
import java.text.DecimalFormat;
public class Main {
	private static Beverage order;
	private static String[] disArr; 
	public static void main(String[] args) {
		disArr= new String[args.length]; 
		for (int j = 0; j < args.length; j++) { 
			disArr[j] = args[j].toLowerCase(); 
		} 
		int i;
		for (i = 0; i < disArr.length; i++)
			if (disArr[i].equals("small") || disArr[i].equals("medium")
					|| disArr[i].equals("large") || disArr[i].equals("grand")){
				break;
			}
		if (i >= disArr.length) {
			System.out.println("Must set a size!");
			return;
		}
		String beveStr;
		if (i == 2) {
			beveStr = disArr[0] + " " + disArr[1];
		} else {
			beveStr = disArr[0];
		}
		
		
		setSize(beveStr,i);//Create an beverage instance based on the input of the user including it's size 
		addIngredient(i);//add ingredient to the beverage if urged	
		DecimalFormat df = new DecimalFormat(".0");
		System.out.println("The total cost of your order is: "
				+ df.format(order.cost()));
			
		
		/**
		 * How do I get the description of each order instead of doing this
		 * stupid thing forever (except for printing the args)?
		 */
		if (order instanceof BeverageWithIngredient){
			((BeverageWithIngredient) order).getDescription();
		} 
		else if (order instanceof Espresso) {
			((Espresso) order).getDescription();
		} 
		else if (order instanceof HouseBlend){
			((HouseBlend) order).getDescription();
		} 
		else if (order instanceof Decaf){
			((Decaf) order).getDescription();
		} 
		else if (order instanceof RedTea){
			((RedTea) order).getDescription();
		} 
		else if (order instanceof GreenTea){
			((GreenTea) order).getDiscription();
		} 
		else {
			((WhiteTea) order).getDescription();
		}
	}
	
	public static void setSize(String beveStr,int i){
		switch (beveStr) {
		case "espresso" :
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
			break;
		case "houseblend" :
			order = new HouseBlend();
			((CoffeeBeverage) order).setSize(disArr[i]);
			break;
		case "mocha" :
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new Chocolate(order);
			break;
		case "latte" : 
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new Milk(order);
			break;
		case "cappuccino" :
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new WhipCream(order);
			break;
		case "green tea" :
			order = new GreenTea();
			((TeaBeverage) order).setSize(disArr[i]);
			break;
		case "red tea" :
			order = new RedTea();
			((TeaBeverage) order).setSize(disArr[i]);
			break;
		case "white tea" : 
			order = new WhiteTea();
			((TeaBeverage) order).setSize(disArr[i]);
			break;
		case "flower tea" :
			order = new GreenTea();
			((TeaBeverage) order).setSize(disArr[i]);
			order = new Jasmine(order);
			break;
		case "ginger tea" :
			order = new GreenTea();
			((TeaBeverage) order).setSize(disArr[i]);
			order = new Ginger(order);
			break;
		case "tea latte" :
			order = new RedTea();
			((TeaBeverage) order).setSize(disArr[i]);
			order = new Milk(order);
			break;
		case "decaf mocha" :
			order = new Decaf();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new Chocolate(order);
			break;
		case "decaf" :
			order = new Decaf();
			((CoffeeBeverage) order).setSize(disArr[i]);
			break;
		case "decaf latte" :
			order = new Decaf();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new Milk(order);
			break;
		case "decaf cappuccino" :
			order = new Decaf();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new WhipCream(order);
			break;
		default :
			System.out.println("Illegal input: " + beveStr);
			System.exit(0);
		}
	}
	public static void addIngredient(int i){
		for (i++; i < disArr.length; i++) {
			switch( disArr[i] ){

			case "chocolate" :
				order = new Chocolate(order);
				break;

			case "ginger" :
				order = new Ginger(order);
				break;

			case "milk" :
				order = new Milk(order);
				break;

			case "jasmine" :
				order = new Jasmine(order);
				break;

			case "whip" :
				i++;
				order = new WhipCream(order);
				break;

			default :
				System.out.println("Illegal input: " + disArr[i]);
				System.exit(0);
			}
		}
	}
}