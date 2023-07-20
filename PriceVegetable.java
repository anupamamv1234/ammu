class PriceVegetable{
 public static void main(String[] args)
 {
	 System.out.println("Running PriceVegetable in main");
	 
 int potato=40;
 int tomato=60;
 int onion=50;
 int carrot=30;
 int brinjal=20;
 int cabbage=80;
 int corn=70;
 
 int[] vegetable={potato,tomato,onion,carrot,brinjal,cabbage,corn};
 
 int total=vegetable.length;
 
 for(int vegetables=0;vegetables<vegetable.length;vegetables++)
 {
 int ref=vegetable[vegetables];
 System.out.println("Vegetables at"+ref+"is"+vegetables);		 
 }
  System.out.println("Vegetable at position 6 before change :"+vegetable[6]);
 
 vegetable[6]=50;
 System.out.println("Vegetable at position 6 after change :"+vegetable[6]);
 
 System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
  
 for(int vegetables=vegetable.length-1;vegetables>=0;vegetables--)
 {
 int ref=vegetable[vegetables];
 
 System.out.println("Vegetables at"+ref+"is"+vegetables);
 }
 
 }
 
}