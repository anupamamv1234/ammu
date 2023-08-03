package inheritance;

public class BankRunner {
	public static void main(String[] args) {
		Banker banker=new Banker();
		Banker ref=new BankTeller();
		BankerTeller ref1=new CreditAnalyst();
		CreaditAnalyst ref2=new InveastmentBanker();
		InveastmentBanker ref3=new LoanProcessor();
		LoanProcessor ref4=new Manager();
		manager ref5=new MotgageConsultant();
		MotgageConsultant motgageConsultant=new MotgageConsultant();
		System.out.println(ref.name);
		ref.BankerInfo();
		System.out.println(ref1.namr);
		ref1.BankerTellerInfo();
		System.out.println(ref1.namr);
		ref2.CreditAnalystInfo();
		System.out.println(ref1.namr);
		ref3.InveastmentBankerInfo();
		System.out.println(ref1.namr);
		ref4.LoanProcessorInfo();
		System.out.println(ref1.namr);
		ref5.ManagerInfo();
		System.out.println(motgageConsultant.name);
		motgageConsultant.MotgageConsultantInfo();

	}
}
