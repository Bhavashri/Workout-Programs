package oops.Inhertance.Hibrid;
public class Daughter extends Father {
	int age=27;
	String gender="female";
 public Daughter (String name) {
	 super(name);//new father(name)
 }
 public void setAge(int age) {
	 this.age=age;
 }
 public int getAge() {
	 return age;
 }
 public void setgender(String gender) {
	 this.gender=gender;
 }
 public String getGender() {
	 return gender;
 }
}
