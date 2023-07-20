class Mall{
String ownername;
String product;
String location;
int floor;
String lift;
String cctv;
int shops;
Mall()
{
	System.out.println("invoking the const in mall");
}
Mall(String ownername)
{
	this.ownername=ownername;
	System.out.println("invoking with String arguments");	
} 
Mall(String ownername,String product)
{
	this.ownername=ownername;
	this.product=product;
	System.out.println("invoking with String and String arguments");
}
Mall(String ownername,String product,String location)
{
	this("ownername",product);
	this.location=location;
	System.out.println("invoking with String String and String arguments");
}
Mall(String ownername,String product,String location,int floor)
{
	this("ownername","product",location);
	this.floor=floor;
	System.out.println("invoking with String float int String arguments");
}
Mall(String ownername,String product,String location,int floor,String lift)
{
	this("ownername","product","location",floor);
	this.lift=lift;
	System.out.println("invoking with String String String int and String arguments");
}
Mall(String ownername,String product,String location,int floor,String lift,String cctv)
{
	this("ownername","product","location",floor,"lift");
	this.cctv=cctv;
	System.out.println("invoking with String String String int String and String arguments");
}
Mall(String ownername,String product,String location,int floor,String lift,String cctv,int shops)
{
	this("ownername","product","location",floor,"lift","cctv");
	this.shops=shops;
	System.out.println("invoking with String String String int String String and int arguments");
}
	
}