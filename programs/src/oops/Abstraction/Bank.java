package oops.Abstraction;

public abstract class Bank { 
	float amount;
	//normal function
	void setAmount(float amount) {
		this.amount=amount;
	}
	float getAmount() {
		return amount;
	}
	//abstract function
  public abstract float RateOfIntrest();
  public abstract long IFSCcode();
  public abstract String HolderName();
}
