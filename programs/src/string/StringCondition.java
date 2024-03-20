package string;

public class StringCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello", str2="world",str3=null, str4="lo",str5="hello";
		System.out.println("str1: "+str1+" | str2: "+str2);
		//   Equals
		if(str1.equals(str2)) {
			System.out.println("str1: "+str1+" == str2: "+str2+" true");
		}else {
			System.out.println("str1: "+str1+" == str2: "+str2+" false");
		}
		//     to convert uppercase to lowercase
		if(str1.toLowerCase().equals(str5.toLowerCase())) {
			System.out.println("str1: "+str1+" == str5: "+str5+" true");
		}else {
			System.out.println("str1: "+str1+" == str5: "+str5+" false");
		}
		// to ingnore uppercase and lowercase
		if(str1.equalsIgnoreCase(str5)) {
			System.out.println("str1: "+str1+" == str5: "+str5+" true");
		}else {
			System.out.println("str1: "+str1+" == str5: "+str5+" false");
		}
		
		//    contains 1
		if(str1!=null && str3 !=null && str1.contains(str3)) {
			System.out.println("str1: "+str1+" == str3: "+str3+" true");
		}else {
			System.out.println("str1: "+str1+" == str3: "+str3+" false");
		}
		//      contains 2
		if(str1!=null && str4 !=null && str1.contains(str4)) {
			System.out.println("str1: "+str1+" == str3: "+str4+" true");
		}else {
			System.out.println("str1: "+str1+" == str3: "+str4+" false");
		}
		
	}

}
