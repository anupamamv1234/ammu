package inheritance;

public class GandhiRunner {
	public static void main(String[] args) {
		RajeevGandhi rajeevGandhi=new RajeevGandhi();
		RajeevGandhi ref=new IndiraGandhi();
		IndiraGandhi ref1=new RahulGandhi();
		IndiraGandhi ref2=new PriyankaGandhi();
		RahulGandhi ref3=new RahulGandhi();
		System.out.println(ref.age);
		ref.possition();
		System.out.println(ref1.age);
		ref1.qualification();
		System.out.println(ref2.age);
		ref.possition();
		System.out.println(ref3.age);
		ref.possition();
	}
	
}
