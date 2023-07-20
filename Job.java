class Job{
static void apply(){
System.out.println("invoking apply() in Job");
}	
static void apply(String person,int exp){	
		
System.out.println("invoking person Name in Job "+person);	
System.out.println("invoking person exp() in Job "+exp);	

}
static void apply(String name,int exp,String refName){
		
System.out.println("invoking person Name() in Job "+name);
System.out.println("invoking person expirience() in Job "+exp);
System.out.println("invoking person refName() in Job "+refName);	

}		
static void apply(int exp){
System.out.println("invoking person exp() in Job"+exp);	
}
static void rejectOffer(){
System.out.println("invoking rejectOffer() in Job");	
		
}
}