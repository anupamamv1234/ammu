public class PersonEmail{
	static String getEmailByName(String personEmail){
	System.out.println("email of the person");
		if(personEmail != null){
			if(personEmail == "anu"){
				System.out.println("person is: " + personEmail);
				return "anupamamv@gmail.com";
			}
			if(personEmail == "theja"){
				System.out.println("person is: " + personEmail);
				return "theja@gmail.com";
			}
			if(personEmail == "appu"){
				System.out.println("person is: " + personEmail);
				return "appu@gmail.com";
			}
			if(personEmail == "divya"){
				System.out.println("person is: " + personEmail);
				return "divya@gmail.com";
			}
			if(personEmail == "punith"){
				System.out.println("person is: " + personEmail);
				return "punith@gmail.com";
			}
			if(personEmail == "devraju"){
				System.out.println("person is: " + personEmail);
				return "devraju@gmail.com";
			}
			if(personEmail == "bhavana"){
				System.out.println("person is: " + personEmail);
				return "bhavana@gmail.com";
			}
			if(personEmail == "jeevitha"){
				System.out.println("person is: " + personEmail);
				return "jeevitha@gmail.com";
			}
			if(personEmail == "lathamani"){
				System.out.println("person is: " + personEmail);
				return "lathamani@gmail.com";
			}
			if(personEmail == "chandini"){
				System.out.println("person is: " + personEmail);
				return "chandume869@gmail.com";
			}
		}
		else{
			System.out.println("Email is not acceptable");
		}
		return "0";
	}
	
	public static void main(String[] args){
		String Emailanu = getEmailByName("anu");
		System.out.println("refeence is: " + Emailanu);
		
        String Emailtheja = getEmailByName("theja");
		System.out.println("refeence is: " + Emailtheja);
		
        String Emailappu = getEmailByName("appu");
		System.out.println("refeence is: " + Emailappu);
		
		String Emaildivya = getEmailByName("divya");
		System.out.println("refeence is: " + Emaildivya);
		
		String Emailpunith = getEmailByName("punith");
		System.out.println("refeence is: " + Emailpunith);
		
		String Emaildevraju = getEmailByName("devraju");
		System.out.println("refeence is: " + Emaildevraju);
		
		String Emailbhavana = getEmailByName("bhavana");
		System.out.println("refeence is: " + Emailbhavana);
		
		String Emailjeevitha = getEmailByName("jeevitha");
		System.out.println("refeence is: " +Emailjeevitha);
		
		String Emaillathamani= getEmailByName("lathamani");
		System.out.println("refeence is: " + Emaillathamani);
		
		String Emailchandini= getEmailByName("chandini");
		System.out.println("refeence is: " + Emailchandini);
	}
}