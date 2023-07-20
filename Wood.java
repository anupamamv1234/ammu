class Wood{
String color;
float thickness;
int years;
String properties;
String furniture;
Wood()
{
	System.out.println("invoking the const in wood");
}
Wood(String color)
{
	this.color=color;
	System.out.println("invoking with String arguments");	
} 
Wood(String color,float thickness)
{
	this.color=color;
	this.thickness=thickness;
	System.out.println("invoking with String and float arguments");
}
Wood(String color,float thickness,int years)
{
	this("color",thickness);
	this.years=years;
	System.out.println("invoking with String float and int arguments");
}
Wood(String color,float thickness,int years,String properties)
{
	this("color",thickness,years);
	this.properties=properties;
	System.out.println("invoking with String float int String arguments");
}
Wood(String color,float thickness,int years,String properties,String furniture)
{
	this("color",thickness,years,"properties");
	this.furniture=furniture;
	System.out.println("invoking with String float int String and String arguments");
}	
}