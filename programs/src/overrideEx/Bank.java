package overrideEx;
public abstract class Bank { 
	float amount;
	void setAmount(float amount) {
		this.amount=amount;
	}
	float getAmount() {
		return amount;
	}
  public abstract long IFSCcode();
  public abstract String HolderName();
}
