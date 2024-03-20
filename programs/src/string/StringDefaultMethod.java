package string;

public class StringDefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world", a=null;
		
		try {
//			int c=3/0;
//			System.out.println(c);
	
		if(s!=null && a!=null && s.contains(a)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		}
		catch(Exception e) {
			// it print which exception is occur
			e.printStackTrace();
		}
		
		System.out.println("Length: "+s.length());
		System.out.println("Length: "+s.toCharArray().length);
		System.out.println("Replace: "+s.replace("world","all"));
		System.out.println("SubString: "+s.substring(0,8));
		System.out.println("concat: "+s.concat(" All"));
		System.out.println("split: "+s.split(" ")[0]+"  2: "+s.split(" ")[1]);
		System.out.println("Trim: "+s.trim());
		System.out.println("index of: "+s.indexOf("l"));
		System.out.println("upperCase: "+s.toUpperCase());
		System.out.println("uppercase: "+s.toString());
		
		int j=3;
		String s1= String.valueOf(j);
		System.out.println("upper Case : "+s1.equals("3"));
		
		String[] sArr = s.split("");
		char[] sArr1=s.toCharArray();
		System.out.println("***************************split*********************************");
		//      split each char
		for(int i=0;i<sArr.length;i++) {
			System.out.print(sArr[i]);
		}
		System.out.println("\n**************************** tochar array *********************************");
		for(int i=0;i<sArr1.length;i++) {
			System.out.print(sArr1[i]);
		}
		System.out.println("\n***************************** find duplicate *********************************");
		System.out.println("duplicate:"+findDuplicate(s));
	}
	public static String findDuplicate(String s) {
		String response="";
		s=s.trim();
		for(int i=1;i<s.length();i++) {
			if(s.substring(i).contains(s.substring(i-1,i))) {
				if(!response.contains(s.substring(i-1,i))) {
					response = response.concat(s.substring(i-1,i));
				}
			}
		}
		return response;
	}
}
