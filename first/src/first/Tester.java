package first;
import java.util.ArrayList;
import java.util.List;
class Module 
{
	int id;
	String accountName;
	long accountNum;
	double balance;
	public Module(int id, String accountName, long accountNum, double balance) {
		super();
		this.id = id;
		this.accountName = accountName;
		this.accountNum = accountNum;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Module [id=" + id + ", accountName=" + accountName + ", accountNum=" + accountNum + ", balance="
				+ balance + "]";
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
	public class Tester{
		public static void main(String[] args) {
			Module Eshika= new Module(1, "Eshika", 1234, 120000);
			Module Aasma= new Module(2, "Aasma", 2345, 130000);
			Module Rehna= new Module(3, "Rehna", 3456, 140000);
			List<Module> list =new ArrayList<>();
			list.add(Eshika);
			list.add(Aasma);
			list.add(Rehna);
			double max=0;
			String name="";
			for (Module x:list)
			{
				System.out.println(x);				
			}
			for (Module x:list)
			{
				if(x.getBalance()>max)
				{
					max=x.getBalance();
					name=x.getAccountName();	
				}		
			}
			System.out.println("Account with highest balance:");
			System.out.println(name+" "+max);			
			
		}
	}



		

