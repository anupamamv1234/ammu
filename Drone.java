class Drone{
	static double getDistanceByFlight(String operator,String event){
		if(operator=="anupama" && event=="inspection"){
		System.out.println("Given oprator name is "+ operator+" and event is "+event);
			return 100;
		}
		else
		{
			System.out.println("Given is in valid");
			return 10;
		}
		}
static double getPricePerEvent(String eventName){
	if(eventName=="BirthdayEvent"){
		System.out.println("The drone used in "+eventName);
		return 25000;
	}
	System.out.println("event name is invalid");
	return 10;
}
static int getDistanceByEvent(String eventName,String refPerson){
	if(eventName=="wedding" && refPerson=="anupama"){
		System.out.println("event name is "+eventName+" ref person "+refPerson);
		return 200;
	}
	else{
		System.out.println("Distance by event is invalid");
		return 20;
	}
}
	public static void main(String[] args){
	System.out.println("invoking the main method");
	double ref=Drone.getDistanceByFlight("anupama","inspection");
	System.out.println("Distance by the flight is "+ref);
double event=Drone.getPricePerEvent("Birthday");
	System.out.println("Event price per event is "+event);
int distance=Drone.getDistanceByEvent("wedding","anupama");
System.out.println("Event Distance  is "+distance);
	}
	}