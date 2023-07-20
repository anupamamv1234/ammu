class MainMethodJob{
	public static void main(String[] args){
	System.out.println("invoking main in Job");
	Job.apply();
	Job.apply("divya",4);
	Job.apply("bhavana",5,"gowda");
	Job.apply(5);
	Job.rejectOffer(); 
	
	
	
	System.out.println("\n");
	System.out.println("invoking main in ResumeFormat");
	
	ResumeFormat.format();
	ResumeFormat.format("Fresher");
	ResumeFormat.format("Fresher",1);
	ResumeFormat.clear();
	ResumeFormat.delete();
	}
}