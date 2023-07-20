class Generator{
	String brand;
	float price;
	int capacity;
	Generator()
	{
		System.out.println("invoking with no argument");
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.capacity);
	}
	
		Generator(String brand,float price,int capacity){
		System.out.println("invoking with argument");	
		this.brand=brand;
		this.price=price;
		this.capacity=capacity;
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.capacity);	
	 }
	    public static void main(String[] args){
		System.out.println("invoking in main method");
		Generator generator=new Generator();
	    generator.brand="Ac Generator";
		generator.price=20000f;
		generator.capacity=1400;
		System.out.println("Name of the brand "+generator.brand);
		System.out.println("Name of price "+generator.price);
		System.out.println("Name of capacity "+generator.capacity);
		
		Generator generator1=new Generator ("Synchronous",15000f,2500);
		System.out.println("Name of the brand "+generator1.brand);
		System.out.println("Name of price "+generator1.price);
		System.out.println("Name of capacity "+generator1.capacity);	
	}
}