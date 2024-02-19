package oops.Inhertance.Multilevel;
public class Father extends GrandFather {
String name="Bhavas";
public Father (String dob) {
	super(dob);
}
public String getName() {
	return this.name;
}
public void setname(String name) {
	this.name=name;
}
}
