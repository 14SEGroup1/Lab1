package lab1;

public class OrderMachine {
	
	private String[] orderMessage;
	
	public OrderMachine(String[] inputMessage){
		orderMessage = inputMessage;
	}
	
	public Beverage getBeverage(String beveStr,int beveSize){
		Beverage order = new Beverage();
		switch (beveStr) {
		case "espresso" :
			order = new Espresso();
			((CoffeeBeverage) order).setSize(orderMessage[beveSize]);
			break;
		case "houseblend" :
			order = new HouseBlend();
			((CoffeeBeverage) order).setSize(orderMessage[beveSize]);
			break;
		case "mocha" :
			order = new Espresso();
			((CoffeeBeverage) order).setSize(orderMessage[beveSize]);
			order = new Chocolate(order);
			break;
		case "latte" : 
			order = new Espresso();
			((CoffeeBeverage) order).setSize(orderMessage[beveSize]);
			order = new Milk(order);
			break;
		case "cappuccino" :
			order = new Espresso();
			((CoffeeBeverage) order).setSize(orderMessage[beveSize]);
			order = new WhipCream(order);
			break;
		case "green tea" :
			order = new GreenTea();
			((TeaBeverage) order).setSize(orderMessage[beveSize]);
			break;
		case "red tea" :
			order = new RedTea();
			((TeaBeverage) order).setSize(orderMessage[beveSize]);
			break;
		case "white tea" : 
			order = new WhiteTea();
			((TeaBeverage) order).setSize(orderMessage[beveSize]);
			break;
		case "flower tea" :
			order = new GreenTea();
			((TeaBeverage) order).setSize(orderMessage[beveSize]);
			order = new Jasmine(order);
			break;
		case "ginger tea" :
			order = new GreenTea();
			((TeaBeverage) order).setSize(orderMessage[beveSize]);
			order = new Ginger(order);
			break;
		case "tea latte" :
			order = new RedTea();
			((TeaBeverage) order).setSize(orderMessage[beveSize]);
			order = new Milk(order);
			break;
		case "decaf mocha" :
			order = new Decaf();
			((CoffeeBeverage) order).setSize(orderMessage[beveSize]);
			order = new Chocolate(order);
			break;
		case "decaf" :
			order = new Decaf();
			((CoffeeBeverage) order).setSize(orderMessage[beveSize]);
			break;
		case "decaf latte" :
			order = new Decaf();
			((CoffeeBeverage) order).setSize(orderMessage[beveSize]);
			order = new Milk(order);
			break;
		case "decaf cappuccino" :
			order = new Decaf();
			((CoffeeBeverage) order).setSize(orderMessage[beveSize]);
			order = new WhipCream(order);
			break;
		default :
			System.out.println("Illegal input: " + beveStr);
			System.exit(0);
		}
		return order;
	}
	
	public Beverage addIngredient(Beverage order,int i){
		for (i++; i < orderMessage.length; i++) {
			switch( orderMessage[i] ){

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
				System.out.println("Illegal input: " + orderMessage[i]);
				System.exit(0);
			}
		}
		return order;
	}
	
	public void getDescription(Beverage order){
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
}


