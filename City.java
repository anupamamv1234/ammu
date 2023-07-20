class City{
	String place;
	int pincode ;
	String food;
	City()
	{
		System.out.println("invoking with no argument");
		System.out.println(this.place);
		System.out.println(this.pincode);
		System.out.println(this.food);
	}
	
		City(String place,int pincode,String food){
		System.out.println("invoking with argument");	
		this.place=place;
		this.pincode=pincode;
		this.food=food;
		System.out.println(this.place);
		System.out.println(this.pincode);
		System.out.println(this.food);	
	 }
	    public static void main(String[] args){
		System.out.println("invoking in main method");
		City city=new City();
	    city.place="Hassan";
		city.pincode=573201;
		city.food="MasalaDose";
		System.out.println("Name of the place "+city.place);
		System.out.println("Name of pincode "+city.pincode);
		System.out.println("Name of food "+city.food);
		
		City city1=new City ("Malligevalu",573218,"Palav");
		System.out.println("Name of place "+city1.place);
		System.out.println("Name of pincode "+city1.pincode);
		System.out.println("Name of food "+city1.food);	
	}
}