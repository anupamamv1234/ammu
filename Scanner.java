class Scanner{
	static void information(String brand,int amount,String type)
	{
		if(brand!=null)
		{
			System.out.println("Condition valid :"+brand);
		}
		else
		{
			System.err.println("Condition invalid :"+brand);
			return;
		}
		if(amount>=10000)
		{
			System.out.println("Condition valid :"+amount);
		}
		else
		{
			System.err.println("Condition invalid :"+amount);
			return;
		}
		if(type!=null)
		{
			System.out.println("Condition valid :"+type);
		}
		else
		{
			System.err.println("Condition invalid :"+type);
			return;
		}
		System.out.println("Scanner Information");
	}
}