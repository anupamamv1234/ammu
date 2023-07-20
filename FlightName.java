class FlightName{
 public static void main(String[] args)
 {
 	 System.out.println("Running FlightName in main");
	 
 String indiGo="IndiGo";
 String qatarAirways="QatarAirways";
 String allianceAir="AllianceAir";
 String vistara="Vistara";
 String saudia="Saudia";
 String airIndia="AirIndia";
 String spiceJet="SpiceJet";
 
 String[] flightName={indiGo,qatarAirways,allianceAir,vistara,saudia,airIndia,spiceJet};
 
 int total=flightName.length;
 
 for(int flight=0;flight<flightName.length;flight++)
 {

 String ref=flightName[flight];
 System.out.println("flightName at"+ref+"is"+flight);		 
 }
 System.out.println("FlightName at position 6 before change :"+flightName[5]);
 
 flightName[5]="Air Arabia";
 System.out.println("FlightName at position 6 after change :"+flightName[5]);
 
 System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
  
 for(int flight=flightName.length-1;flight>=0;flight--)
 {
 String ref=flightName[flight];
 
 System.out.println("FlightName at"+ref+"is"+flight);
 }
 }
}