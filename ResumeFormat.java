class ResumeFormat{
static void format(){
System.out.println("invoking resume format");
}
static void format(String type){
System.out.println("invoking resume format "+type);
}
static void format(String type,int pages){
System.out.println("invoking resume format "+type);
System.out.println("invoking resume pages "+pages);
}
static void clear(){
System.out.println("Resume format clear");
}
static void delete(){
System.out.println("Resume format delete");
}
}