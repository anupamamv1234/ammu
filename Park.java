class Park{
String parkname;
String type;                                                                                                                                                        ;
String location;
int nooftrees;
int noofbenches;
String things;
float diemention;
int size;
String nature;
Park()
{
	System.out.println("invoking the const in park");
}
Park(String parkname)
{
	this.parkname=parkname;
	System.out.println("invoking with String arguments");	
} 
Park(String parkname,String type)
{
	this.parkname=parkname;
	this.type=type;
	System.out.println("invoking with String and String arguments");
}
Park(String parkname,String type,String location)
{
	this("parkname",type);
	this.location=location;
	System.out.println("invoking with String String and String arguments");
}
Park(String parkname,String type,String location,int nooftrees)
{
	this("parkname","type","location");
	this.nooftrees=nooftrees;
	System.out.println("invoking with String String String and int arguments");
}
Park(String parkname,String type,String location,int nooftrees,int noofbenches)
{
	this("parkname","type","location",nooftrees);
	this.noofbenches=noofbenches;
	System.out.println("invoking with String String String int and int arguments");
}
Park(String parkname,String type,String location,int nooftrees,int noofbenches,String things)
{
	this("parkname","type","location",nooftrees,noofbenches);
	this.things=things;
	System.out.println("invoking with String String String int int and String arguments");
}
Park(String parkname,String type,String location,int nooftrees,int noofbenches,String things,float diemention)
{
	this("parkname","type","location",nooftrees,noofbenches,"things");
	this.diemention=diemention;
	System.out.println("invoking with String String String int int String and float arguments");
}
Park(String parkname,String type,String location,int nooftrees,int noofbenches,String things,float diemention,int size)
{
	this("parkname","type","location",nooftrees,noofbenches,"things",diemention);
	this.size=size;
	System.out.println("invoking with String String String int int String float and int arguments");
}
Park(String parkname,String type,String location,int nooftrees,int noofbenches,String things,float diemention,int size,String nature)
{
	this("parkname","type","location",nooftrees,noofbenches,"things",diemention,size);
	this.nature=nature;
	System.out.println("invoking with String String String int int String float int and String arguments");
}
	
}