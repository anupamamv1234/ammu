package inheritance;

public class BagRunner {
public static void main(String[] args) {
	Bag bag=new Bag();
	Bag ref=new Cloth();
	Fload ref1=new Fload();
	Fload fload=new Fload();
	System.out.println(ref.zip);
	ref.color();
	System.out.println(ref1.color);
	ref1.brand();
	System.out.println(fload.numberOfcloth);
	fload.numberOfFload();
}
}
