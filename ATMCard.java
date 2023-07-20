class ATMCard{
	String debit;
	int pin;
	String bank;
	ATMCard()
	{
		System.out.println("invoking with no argument");
		System.out.println(this.debit);
		System.out.println(this.pin);
		System.out.println(this.bank);
	}
	
		ATMCard(String debit,int pin,String bank){
		System.out.println("invoking with argument");	
		this.debit=debit;
		this.pin=pin;
		this.bank=bank;
		System.out.println(this.debit);
		System.out.println(this.pin);
		System.out.println(this.bank);	
	 }
	    public static void main(String[] args){
		System.out.println("invoking in main method");
		ATMCard ATMCard=new ATMCard();
	    ATMCard.debit="M.Chinnaswamy";
		ATMCard.pin=2035;
		ATMCard.bank=canara;
		System.out.println("Name of the debit "+ATMCard.debit);
		System.out.println("Name of pin "+ATMCard.pin);
		System.out.println("Name of bank "+ATMCard.bank);
		
		ATMCard ATMCard1=new ATMCard ("Dr.B R Ambedkar",1520,"SBI");
		System.out.println("Name of the debit "+ATMCard1.debit);
		System.out.println("Name of pin "+ATMCard1.pin);
		System.out.println("Name of bank "+ATMCard1.bank);	
	}
}