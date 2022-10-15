package Encapsulation;

class Bank{
	private int  accountnumber;
	private String accountholdername;
	
	public void setAccountNumber(int accountnumber)
	{
		this.accountnumber=accountnumber;
	}
	
	public int getAccountNumber()
	{
		return accountnumber;
	}
	
	public void setAccountName(String accountholdername)
	{
		this.accountholdername=accountholdername;
	}
	
	public String getAccountHolderName()
	{
		return accountholdername;
	}
	
	
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Bank bk= new Bank();
		bk.setAccountName("Ganesh");
		bk.setAccountNumber(809088054);
		System.out.println(bk.getAccountHolderName());
		System.out.println(bk.getAccountNumber());
		

	}

}
