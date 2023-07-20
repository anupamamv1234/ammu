class TubeLight{
	String color;
	String use;
	float lenght;
	TubeLight()
	{
		System.out.println("invoking with no argument");
		System.out.println(this.color);
		System.out.println(this.use);
		System.out.println(this.lenght);
	}
	
		TubeLight(String color,String use,float lenght){
		System.out.println("invoking with argument");	
		this.color=color;
		this.use=use;
		this.lenght=lenght;
		System.out.println(this.color);
		System.out.println(this.use);
		System.out.println(this.lenght);	
	 }
	    public static void main(String[] args){
		System.out.println("invoking in main method");
		TubeLight tubeLight=new Tubelight();
	    tubeLight.color="white";
		tubeLight.use="light";
		tubeLight.lenght=4.7f;
		System.out.println("Name of the color "+tubeLight.color);
		System.out.println("Name of use "+tubeLight.use);
		System.out.println("Name of lenght "+tubeLight.lenght);
		
		TubeLight tubeLight1=new TubeLight ("Blue","light",7.6f);
		System.out.println("Name of the color "+tubeLight1.color);
		System.out.println("Name of use "+tubeLight1.use);
		System.out.println("Name of lenght "+tubeLight1.lenght);	
	}
}