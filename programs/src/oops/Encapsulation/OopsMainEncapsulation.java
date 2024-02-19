package oops.Encapsulation;

public class OopsMainEncapsulation {
public static void main(String args[]) {
	Account account=new Account();
	account.setAcc_no(786595321870L);
	account.setEmail("Bhavashri2003@gmail.com");
	account.setName("Bhavashri");
	account.setAmount(5607f);
	System.out.println(account.getAcc_no());
	System.out.println(account.getEmail());
	System.out.println(account.getName());
	System.out.println(account.getAmount());
}
}
