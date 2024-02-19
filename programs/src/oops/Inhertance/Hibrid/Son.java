package oops.Inhertance.Hibrid;

public class Son extends Father {
	int age=15;
	String gender="male";
 public Son (String name) {
	 super(name);//new father(name)
 }
 public void setAge(int age) {
	 this.age=age;
 }
 public int getAge() {
	 return age;
 }
 
}
