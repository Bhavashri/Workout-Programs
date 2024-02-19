package oops.Abstraction;

public class OopsMainAbstraction {
	public static void main(String[]args) {
		SBI sbi=new SBI(56700f);
		sbi.setAmount(8594.7f);
		System.out.println(sbi.RateOfIntrest());
		System.out.println(sbi.IFSCcode());
		System.out.println(sbi.HolderName());
		System.out.println(sbi.getAmount());
	}
}
