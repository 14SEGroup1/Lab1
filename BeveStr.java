package lab1;

//!! important !!
//!! this film is for the Replacement plan !!
//!! if the system doesn't support java 1.7 or higher it could be the part to replace !!

public enum BeveStr {

	espresso,houseblend,mocha,latte,cappuccino,greentea,redtea,
	whitetea,flowertea,gingertea,tealatte,decafmocha,decaf,
	decaflatte,decafcappuccino,NOVALUE ;
	
	
	
	public static BeveStr toBeveStr(String str){

		try {
			str.replaceAll(" ", "") ;
			return valueOf(str);
		}

		catch (Exception ex) {

			return NOVALUE;

		}
	
	}
	
	
}
