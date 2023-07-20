class Cricket{
	String stadium;
	int ball ;
	int wicket;
	Cricket()
	{
		System.out.println("invoking with no argument");
		System.out.println(this.stadium);
		System.out.println(this.ball);
		System.out.println(this.wicket);
	}
	
		Cricket(String stadium,int ball,int wicket){
		System.out.println("invoking with argument");	
		this.stadium=stadium;
		this.ball=ball;
		this.wicket=wicket;
		System.out.println(this.stadium);
		System.out.println(this.ball);
		System.out.println(this.wicket);	
	 }
	    public static void main(String[] args){
		System.out.println("invoking in main method");
		Cricket cricket=new Cricket();
	    cricket.stadium="M.Chinnaswamy";
		cricket.ball=2;
		cricket.wicket=6;
		System.out.println("Name of the stadium "+cricket.stadium);
		System.out.println("Name of ball "+cricket.ball);
		System.out.println("Name of wicket "+cricket.wicket);
		
		Cricket cricket1=new Cricket ("Dr.B R Ambedkar",2,6);
		System.out.println("Name of the stadium "+cricket1.stadium);
		System.out.println("Name of ball "+cricket1.ball);
		System.out.println("Name of wicket "+cricket1.wicket);	
	}
}