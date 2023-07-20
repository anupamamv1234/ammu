class Biscuit{
 public static void main(String[] args)
 {
	 System.out.println("Running Biscuit in main");
	 
 String sunfeast="Sunfeast";
 String britannia="Britannia";
 String cremica="Cremica";
 String patanjali="Patanjali";
 String happyhappy="Happyhappy";
 String monaco="Monaco";
 String krackjack="Krackjack";
 
 String[] biscuit={sunfeast,britannia,cremica,patanjali,happyhappy,monaco,krackjack};
 
 int total=biscuit.length;
 
 for(int bisct=0;bisct<biscuit.length;bisct++)
 {
 String ref=biscuit[bisct];
 System.out.println("Biscuit at"+ref+"is"+bisct);		 
 }
 System.out.println("Biscuit at position 6 before change :"+biscuit[5]);
 
 biscuit[5]="goodDay";
 System.out.println("Biscuit at position 6 after change :"+biscuit[5]);
 
 System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
  
 for(int bisct=biscuit.length-1;bisct>=0;bisct--)
 {
 String ref=biscuit[bisct];
 
 System.out.println("Biscuit at"+ref+"is"+bisct);
 }
 }
}