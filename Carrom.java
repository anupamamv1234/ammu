class Carrom{
	double cost;
	String color;
	int pan;
	int noofplayers;
	float lenght;
	
	Carrom()
	{
		System.out.println("Invoking no-org of carrom");
		
	}
	
	Carrom(double cost)
	{
		System.out.println("Invoking string, float constructor of carrom");
		System.out.println("Cost :"+cost);
		this.cost=cost;
		
	}
	Carrom(double cost, String color)
	{
		System.out.println("Invoking string, float constructor of carrom");
		System.out.println("Cost :"+cost);
		System.out.println("Color :"+color);
		this.cost=cost;
		this.color=color;
		
	}
	Carrom(double cost, String color,int pan)
	{
		System.out.println("Invoking string, float constructor of carrom");
		System.out.println("Cost :"+cost);
		System.out.println("Color :"+color);
		System.out.println("Pan :"+pan);
		this.cost=cost;
		this.color=color;
		this.pan=pan;
		
	}
	Carrom(double cost, String color,int pan,int noofplayers )
	{
		System.out.println("Invoking string, float constructor of carrom");
		System.out.println("Cost :"+cost);
		System.out.println("Color :"+color);
		System.out.println("Pan :"+pan);
		System.out.println("Noofplayers :"+noofplayers);
		this.cost=cost;
		this.color=color;
		this.pan=pan;
		this.noofplayers=noofplayers;
		
	}
	Carrom(double cost, String color,int pan,int noofplayers,float lenght)
	{
		System.out.println("Invoking string, float constructor of carrom");
		System.out.println("Cost :"+cost);
		System.out.println("Color :"+color);
		System.out.println("Pan :"+pan);
		System.out.println("Noofplayers :"+noofplayers);
		System.out.println("Lenght :"+lenght);
		this.cost=cost;
		this.color=color;
		this.pan=pan;
		this.noofplayers=noofplayers;
		this.lenght=lenght;
		
	}
	}