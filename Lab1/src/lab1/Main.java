package lab1;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args) {
		String[] disArr= new String[args.length]; 
		for (int j = 0; j < args.length; j++) { 
			disArr[j] = args[j].toLowerCase(); 
		} 
		int i;
		for (i = 0; i < disArr.length; i++){
			//use switch-case to reduce comparison times
			int sizeExistance = 1;
			switch(disArr[i]){
			    case "small" :sizeExistance = 0;break;
			    case "medium":sizeExistance = 0;break;
			    case "large" :sizeExistance = 0;break;
			    case "grand" :sizeExistance = 0;break;
			    default :break;
			}
			if(sizeExistance==0){
				break;
			}
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
		//I added a new class named OrderMachine to take over some of main function's work and make it easier for debugging
		OrderMachine ordermachine = new OrderMachine(disArr);
		Beverage order = ordermachine.getBeverage(beveStr,i);//Create an beverage instance based on the input of the user including it's size 
		order = ordermachine.addIngredient(order,i);//add ingredient to the beverage if urged	
		DecimalFormat df = new DecimalFormat(".0");
		System.out.println("The total cost of your order is: "+ df.format(order.cost()));
		//System.out.println(ordermachine.getDescription(order));
		}
  }