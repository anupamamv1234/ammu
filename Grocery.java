class Grocery{
 public static void main(String[] args)
 {
	 System.out.println("Running Grocery in main");
	 
 String rice="Rice";
 String salt="Salt";
 String wheat="Wheat";
 String soup="Soup";
 String sugar="Sugar";
 String oil="Oil";
 String butter="Butter";
 
 String[] groceryList={rice,salt,wheat,soup,sugar,oil,butter};
 int total=groceryList.length;
 
 for(int grocery=0;grocery<groceryList.length;grocery++)
 {
	String ref=groceryList[grocery];
    System.out.println("Grocery at"+ref+"is"+grocery);		 
 }
 System.out.println("Grocery item at position 5 before change :"+groceryList[5]);
 
 groceryList[5]="shampoo";
 System.out.println("Grocery item at position 5 after change :"+groceryList[5]);
 
  System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
  
  for(int grocery=groceryList.length-1;grocery>=0;grocery--)
 {
 String ref=groceryList[grocery];
 
 System.out.println("Grocery at"+ref+"is"+grocery);
 }
 }
}