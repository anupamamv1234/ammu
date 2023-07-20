class Soda{
	static void drink(String flavor,int amount,String type)
	{
		if(flavor!=null)
		{
			System.out.println("Condition valid :"+flavor);
		}
		else
		{
			System.err.println("Condition invalid :"+flavor);
			return;
		}
		if(amount>=50)
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
		System.out.println("Soda Information");
	}
}