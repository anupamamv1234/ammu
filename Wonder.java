class Wonder{
 public static void main(String[] args)
 {
	 System.out.println("Running Wonder in main");
	 
 String gardenOfBabylon="Hanging Garden Of Babylon";
 String statueOfZeus="Statue Of Zeus at Olympia";
 String mausoleum="mausoleum";
 String pyramidOfGiza="Great Pyramid Of Giza";
 String colossus="Colossus of Rhodes";
 String templeOfArtemis="Temple Of Artemis at Ephesus ";
 String lightHouse="Light House of Alexandria";
 
 String[] wonder={gardenOfBabylon,statueOfZeus,mausoleum,pyramidOfGiza,colossus,templeOfArtemis,lightHouse};
 
 int total=wonder.length;
 
 for(int wonders=0;wonders<wonder.length;wonders++)
 {
 String ref=wonder[wonders];
 System.out.println("Wonder at"+ref+"is"+wonders);		 
 }
 System.out.println("Wonder at position 2 before change :"+wonder[2]);
 
 wonder[2]="Taj Mahal";
 System.out.println("Wonder at position 2 after change :"+wonder[2]);
 System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
  
 for(int wonders=wonder.length-1;wonders>=0;wonders--)
 {
 String ref=wonder[wonders];
 
 System.out.println("Wonder at"+ref+"is"+wonders);
 }
 }
}