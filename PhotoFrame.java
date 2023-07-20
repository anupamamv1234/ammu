class PhotoFrame{
	String brand;
	int size;
	int price;
	PhotoFrame()
	{
		System.out.println("invoking with no argument");
		System.out.println(this.brand);
		System.out.println(this.size);
		System.out.println(this.price);
	}
	
		PhotoFrame(String brand,int size,int price){
		System.out.println("invoking with argument");	
		this.brand=brand;
		this.size=size;
		this.price=price;
		System.out.println(this.brand);
		System.out.println(this.size);
		System.out.println(this.price);	
	 }
	    public static void main(String[] args){
		System.out.println("invoking in main method");
		PhotoFrame photoFrame=new PhotoFrame();
	    photoFrame.brand="Generic";
		photoFrame.size=12*18;
		photoFrame.price=6;
		System.out.println("Name of brand "+photoFrame.brand);
		System.out.println("Name of size "+photoFrame.size);
		System.out.println("Name of price "+photoFrame.price);
		
		PhotoFrame photoFrame1=new PhotoFrame ("EVAN",8*12,500);
		System.out.println("Name of the brand "+photoFrame1.brand);
		System.out.println("Name of size "+photoFrame1.size);
		System.out.println("Name of price "+photoFrame1.price);	
	}
}