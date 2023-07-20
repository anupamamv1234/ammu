class CarpenterMain{
	
	
	public static void main(String[] args)
	{
		System.out.println("Invoking carpenter in CarpenterMain");
		Carpenter.cut();
		Carpenter.cut(1200);
		Carpenter.cut(1700,6);
		Carpenter.polishing("Door");
		Carpenter.polishing("door",800);
		Carpenter.repair(800);
		Carpenter.framing("window");
		Carpenter.shape("Square");
		Carpenter.phoneNo(6361645123l);
		//Carpenter.window();
		
	}
}