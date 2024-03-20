package mathPro;

public class IntegerDoubleMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer age= new Integer(21);
		Integer age1=99;
		String pincode = "675848";
		Integer pin=Integer.parseInt(pincode);
		String ageStr = age1.toString();
		System.out.println(age1.max(21, 7));
		System.out.println(age1.min(21, 7));
		System.out.println(Integer.sum(21, 7));
		
		Double d = new Double(21.6);
		Double d1=34.1;
		System.out.println(Double.parseDouble(ageStr));
		System.out.println(Double.sum(32.5, 87.9));
		String dStr=d.toString();
		System.out.println(dStr);
		
		int ageint = 30;
		String ageStr1=""+ageint;
	}

}
