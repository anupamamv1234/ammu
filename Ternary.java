class Ternary{
public static void main(String[] args)
{
int x=15, y=30,z=20;
int largest=(x>=y)?((x>=z)?x:z):((y>=z)?y:z);
System.out.println("largest number:"+largest);
}

}