package linkedlistDouble;

public class DLLPerson {
	String name;
	DLLPerson connectNext=null;
	DLLPerson connectPrev=null;
	public DLLPerson(String name) {
		this.name=name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setConnectNext(DLLPerson connectNext) {
		this.connectNext = connectNext;
	}
	public DLLPerson getConnectNext() {
		return connectNext;
	}
	public void setConnectPrev(DLLPerson connectPrev) {
		this.connectPrev = connectPrev;
	}
	public DLLPerson getConnectPrev() {
		return connectPrev;
	}
}
