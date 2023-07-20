class ChariotMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking Chariot in ChariotMain");
		Chariot chariot=new Chariot();
		System.out.println(chariot.type);
		System.out.println(chariot.wheel);
		System.out.println(chariot.animal);
		System.out.println(chariot.driver);
		System.out.println(chariot.purpose);
		System.out.println(chariot.name);
		System.out.println(chariot.name1);
		System.out.println(chariot.carry);
		System.out.println(chariot.carry1);
		System.out.println(chariot.material);
		System.out.println(chariot.material1);
		
		System.out.println("++++++++++++++++++++");
		Chariot chariot1=new Chariot("Open Vehicle");
		System.out.println(chariot1.type);
		
		System.out.println("++++++++++++++++++++");
		Chariot chariot2=new Chariot("Open Vehicle",2);
		System.out.println(chariot2.type);
		System.out.println(chariot2.wheel);
		
		System.out.println("++++++++++++++++++++");
		Chariot chariot3=new Chariot("Open Vehicle",2,"Horse");
		System.out.println(chariot3.type);
		System.out.println(chariot3.wheel);
		System.out.println(chariot3.animal);
		
		System.out.println("++++++++++++++++++++");
		Chariot chariot4=new Chariot("Open Vehicle",2,"Horse",1);
		System.out.println(chariot4.type);
		System.out.println(chariot4.wheel);
		System.out.println(chariot4.animal);
		System.out.println(chariot4.driver);
		
		System.out.println("++++++++++++++++++++");
		Chariot chariot5=new Chariot("Open Vehicle",2,"Horse",1,"Transport");
		System.out.println(chariot5.type);
		System.out.println(chariot5.wheel);
		System.out.println(chariot5.animal);
		System.out.println(chariot5.driver);
		System.out.println(chariot5.purpose);
		
		System.out.println("++++++++++++++++++++");
		Chariot chariot6=new Chariot("Open Vehicle",2,"Horse",1,"Transport","Ratha");
		System.out.println(chariot6.type);
		System.out.println(chariot6.wheel);
		System.out.println(chariot6.animal);
		System.out.println(chariot6.driver);
		System.out.println(chariot6.purpose);
		System.out.println(chariot6.name);
		
		System.out.println("++++++++++++++++++++");
		Chariot chariot7=new Chariot("Open Vehicle",2,"Horse",1,"Transport","Ratha","Quadriga");
		System.out.println(chariot7.type);
		System.out.println(chariot7.wheel);
		System.out.println(chariot7.animal);
		System.out.println(chariot7.driver);
		System.out.println(chariot7.purpose);
		System.out.println(chariot7.name);
		System.out.println(chariot7.name1);
		
		System.out.println("++++++++++++++++++++");
		Chariot chariot8=new Chariot("Open Vehicle",2,"Horse",1,"Transport","Ratha","Quadriga","Person");
		System.out.println(chariot8.type);
		System.out.println(chariot8.wheel);
		System.out.println(chariot8.animal);
		System.out.println(chariot8.driver);
		System.out.println(chariot8.purpose);
		System.out.println(chariot8.name);
		System.out.println(chariot8.name1);
		System.out.println(chariot8.carry);
		
		System.out.println("++++++++++++++++++++");
		Chariot chariot9=new Chariot("Open Vehicle",2,"Horse",1,"Transport","Ratha","Quadriga","Person","Things");
		System.out.println(chariot9.type);
		System.out.println(chariot9.wheel);
		System.out.println(chariot9.animal);
		System.out.println(chariot9.driver);
		System.out.println(chariot9.purpose);
		System.out.println(chariot9.name);
		System.out.println(chariot9.name1);
		System.out.println(chariot9.carry);
		System.out.println(chariot9.carry1);
		
		System.out.println("++++++++++++++++++++");
		Chariot chariot10=new Chariot("Open Vehicle",2,"Horse",1,"Transport","Ratha","Quadriga","Person","Things","Thin Wood Slats");
		System.out.println(chariot10.type);
		System.out.println(chariot10.wheel);
		System.out.println(chariot10.animal);
		System.out.println(chariot10.driver);
		System.out.println(chariot10.purpose);
		System.out.println(chariot10.name);
		System.out.println(chariot10.name1);
		System.out.println(chariot10.carry);
		System.out.println(chariot10.carry1);
		System.out.println(chariot10.material);
		
		System.out.println("++++++++++++++++++++");
		Chariot chariot11=new Chariot("Open Vehicle",2,"Horse",1,"Transport","Ratha","Quadriga","Person","Things","Thin Wood Slats","Leather");
		System.out.println(chariot11.type);
		System.out.println(chariot11.wheel);
		System.out.println(chariot11.animal);
		System.out.println(chariot11.driver);
		System.out.println(chariot11.purpose);
		System.out.println(chariot11.name);
		System.out.println(chariot11.name1);
		System.out.println(chariot11.carry);
		System.out.println(chariot11.carry1);
		System.out.println(chariot11.material);
		System.out.println(chariot11.material1);
	}
}