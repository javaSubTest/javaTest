import java.util.ArrayList;
import java.util.List;

public abstract class Account{
	
	private double balance;
	Account(double balance){
		this.balance = balance;
	}
	public void credit(double amount){
		balance += amount;
	}
	public void debit(double amount) throws Exception{
		balance -=amount;
	}
	public double getBalance(){	return balance ;}
	protected void setBalance(double amount){	balance = amount; }
	
	//�߰� �޼ҵ�
	abstract double getWithdrawableAccount();
	abstract void passTime(int month);
	abstract void passTime();
	public static double sumForAccount(List<? extends Account> list){
		double sum = 0;
		for(Account account : list){
			sum += account.getBalance();
		}
		return sum;
	}
	
	public static void passTimeForList(ArrayList<? extends Account> list, int month){
		for(Account account : list){
			account.passTime(month);
		}
	}
}