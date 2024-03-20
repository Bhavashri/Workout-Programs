package overrideEx;

public class SBI extends Bank {
	public SBI(float amount) {
		
   }
	@Override
	public long IFSCcode() {
		// TODO Auto-generated method stub
		return 794574944733l;
	}
	@Override
	
	public String HolderName() {
		// TODO Auto-generated method stub
		return "Bhavashri";
	}
	
	@Override
	void setAmount(float amount) {
		// TODO Auto-generated method stub
		super.setAmount(amount);
	}
}
