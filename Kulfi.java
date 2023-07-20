class Kulfi{
	static void info(String flavor,int amount,String company)
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
		if(amount>=20)
		{
			System.out.println("Condition valid :"+amount);
		}
		else
		{
			System.err.println("Condition invalid :"+amount);
			return;
		}
		if(company!=null)
		{
			System.out.println("Condition valid :"+company);
		}
		else
		{
			System.err.println("Condition invalid :"+company);
			return;
		}
		System.out.println("Kulfi Information");
	}
}