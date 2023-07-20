public class PersonAge{
	static int getAgeByName(String personName){
	System.out.println("age of the person");
		if(personName != null){
			if(personName== "anu"){
				System.out.println("person is: " + personName);
				return 23;
			}
			if(personName == "mani"){
				System.out.println("person is: " + personName);
				return 35;
			}
			if(personName == "appu"){
				System.out.println("person is: " + personName);
				return 19;
			}
			if(personName == "venkatsh"){
				System.out.println("person is: " + personName);
				return 52;
			}
			if(personName == "punith"){
				System.out.println("person is: " + personName);
				return 17;
			}
			if(personName == "devraju"){
				System.out.println("person is: " + personName);
				return 45;
			}
			if(personName == "theja"){
				System.out.println("person is: " + personName);
				return 25;
			}
			if(personName == "jeevitha"){
				System.out.println("person is: " + personName);
				return 38;
			}
			if(personName == "sanjay"){
				System.out.println("person is: " + personName);
				return 55;
			}
			if(personName == "gangadhara"){
				System.out.println("person is: " + personName);
				return 70;
			}
		}
		else{
			System.out.println("Age is not acceptable");
		}
		return 0;
	}
	
	public static void main(String[] args){
		int Nameanu = getAgeByName("anu");
		System.out.println("refeence is: " + Nameanu);
		
        int Namemani = getAgeByName("mani");
		System.out.println("refeence is: " + Namemani);
		
        int Nameappu = getAgeByName("appu");
		System.out.println("refeence is: " + Nameappu);
		
		int Namevenkatesh = getAgeByName("venkatesh");
		System.out.println("refeence is: " + Namevenkatesh);
		
		int Namepunith = getAgeByName("punith");
		System.out.println("refeence is: " + Namepunith);
		
		double Namedevraju = getAgeByName("devraju");
		System.out.println("refeence is: " + Namedevraju);
		
		int Nametheja = getAgeByName("theja");
		System.out.println("refeence is: " + Nametheja);
		
		int Namejeevitha = getAgeByName("jeevitha");
		System.out.println("refeence is: " + Namejeevitha);
		
		int Namesanjay = getAgeByName("sanjay");
		System.out.println("refeence is: " + Namesanjay);
		
		int Namegangadhara = getAgeByName("gangadhara");
		System.out.println("refeence is: " + Namegangadhara);
	}
}