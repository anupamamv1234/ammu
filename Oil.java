class Oil{
	String name;
	int viscosity;
	int quantity;
	Oil()
	{
		System.out.println("invoking with no argument");
		System.out.println(this.name);
		System.out.println(this.viscosity);
		System.out.println(this.quantity);
	}
	
		Oil(String stadium,int viscosity,int quantity){
		System.out.println("invoking with argument");	
		this.name=name;
		this.viscosity=viscosity;
		this.quantity=quantity;
		System.out.println(this.name);
		System.out.println(this.viscosity);
		System.out.println(this.quantity);	
	 }
	    public static void main(String[] args){
		System.out.println("invoking in main method");
		Oil oil=new Oil();
	    oil.name="M.Chinnaswamy";
		oil.viscosity=2;
		oil.quantity=6;
		System.out.println("Name of the stadium "+oil.name);
		System.out.println("Name of ball "+oil.viscosity);
		System.out.println("Name of wicket "+oil.quantity);
		
		Oil oil1=new Oil ("Dr.B R Ambedkar",2,6);
		System.out.println("Name of the name "+oil1.name);
		System.out.println("Name of viscosity "+oil1.viscosity);
		System.out.println("Name of quantity "+oil1.quantity);	
	}
}