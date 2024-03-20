package overrideEx;
public class OverrideMain {
	public static void main(String[]args) {
		SBI sbi=new SBI(43754f);
		sbi.setAmount(854594.79f);
		
		sbi.setAmount(565f);
		System.out.println(sbi.HolderName());
		System.out.println(sbi.IFSCcode());
		System.out.println();
		System.out.println(sbi.getAmount());
	}
}
