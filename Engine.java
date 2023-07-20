class Engine{
static String getCCByModel(String CCByModel)
{
	System.out.println("invoking the getCCByModel by Engine");
	if(CCByModel!=null){
		
		if("1198cc"==CCByModel){
			return "swift";
		}
		if("1197cc"==CCByModel){
			return "rapid";
		}
		if("1498cc"==CCByModel){
			return "bwm";
		}
		if("2998cc"==CCByModel){
			return "benz";
		}
		if("1993cc"==CCByModel){
			return "audi";
		}
		if("1194cc"==CCByModel){
			return "bently";
		}
	}
	else{
		System.out.println("Given cc is not valid");
	}
	return "engine";
}

public static void main(String[] args){
	String model=Engine.getCCByModel("1198cc");
	System.out.println("Reference name is:"+model);
	String model1=Engine.getCCByModel("1197cc");
	System.out.println("Reference name is:"+model1);
	String model2=Engine.getCCByModel("1498cc");
	System.out.println("Reference name is:"+model2);
	String model3=Engine.getCCByModel("2998cc");
	System.out.println("Reference name is:"+model3);
	String model4=Engine.getCCByModel("1993cc");
	System.out.println("Reference name is:"+model4);
	String model5=Engine.getCCByModel("1194cc");
	System.out.println("Reference name is:"+model5);
}
}