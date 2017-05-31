// 1년계약만 한다. 입력은 이자율. 계약기간동안 출금불가. 계약종료 후 추가 이자없음
public class SavingAccount extends Account implements Valuable{
	private int saving_contract;
	private double interest;
	private boolean expiration_date;
	private double truebalance;
	SavingAccount(double balance,double interest) {
		super(balance);
		this.interest = interest;
		this.saving_contract = 12;
		this.expiration_date = false;
		truebalance = balance;
	}
	
	@Override
	public void debit(double amount) throws Exception{
		if(amount <0)
			throw new Exception("음수입력!");
		else if(getWithdrawableAccount()>0){
			setBalance(getBalance() - amount);
		}
		else
			throw new Exception("아직 출금할 수 없습니다.");
	}
	
	public double getWithdrawableAccount(){
		if(saving_contract ==0)
			return getBalance();
		else
			return 0;
	}
	
	public void passTime(int month){
		if(saving_contract > 0)
			saving_contract -= month;
		if(saving_contract<=0 && !expiration_date){
			setBalance(getBalance() * Math.pow((1+interest), 12));
			expiration_date = true;
		}
	}
	public void passTime(){
		int month = 1;
		if(saving_contract > 0)
			saving_contract -= month;
		if(saving_contract<=0 && !expiration_date){
			setBalance(getBalance() * Math.pow((1+interest), 12));
			expiration_date = true;
		}
	}

	@Override
	public double EstimateValue(int month) {
		if(saving_contract-month<=0 && !expiration_date){
			if(!expiration_date)
				return truebalance * Math.pow((1+interest), month);
			else
				return truebalance* Math.pow((1+interest), month);
		}
		else 
			return (truebalance * Math.pow((1+interest), month));
	}
	@Override
	public double EstimateValue() {
		int month = 1;
		return (truebalance * Math.pow((1+interest), month));
	}
	public String toString(){
		return String.format("CheckingAccount Balance : %.2f", getBalance());
	}
}
