class CarromMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking main on carrom");
		Carrom carrom1=new Carrom();
		System.out.println(carrom1.cost);
		System.out.println(carrom1.color);
		System.out.println(carrom1.pan);
		System.out.println(carrom1.noofplayers);
		System.out.println(carrom1.lenght);
		
		System.out.println("--------------------------");
		Carrom carrom2=new Carrom(1000);
		System.out.println(carrom2.cost);
		
		System.out.println("--------------------------");
		Carrom carrom3=new Carrom(1000,"Block");
		System.out.println(carrom3.cost);
		System.out.println(carrom3.color);
		
		System.out.println("--------------------------");
		Carrom carrom4=new Carrom(1000,"Black",11);
		System.out.println(carrom4.cost);
		System.out.println(carrom4.color);
		System.out.println(carrom4.pan);
		
		System.out.println("--------------------------");
		Carrom carrom5=new Carrom(1000,"Black",11,4);
		System.out.println(carrom5.cost);
		System.out.println(carrom5.color);
		System.out.println(carrom5.pan);
		System.out.println(carrom5.noofplayers);
		
		System.out.println("--------------------------");
		Carrom carrom6=new Carrom(2000,"Block",11,4,32f);
		System.out.println(carrom6.cost);
		System.out.println(carrom6.color);
		System.out.println(carrom6.pan);
		System.out.println(carrom6.noofplayers);
		System.out.println(carrom6.lenght);
		
	}
	
}