public class CheckingAccount extends Account implements Valuable{
	private double credit_limit, interest, loan_interest;
	
	CheckingAccount(double balance, double credit_limit, double interest, double loan_interest){
		super(balance);
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
	}
	
	@Override
	public void debit(double amount) throws Exception{
		if(amount <0)
			throw new Exception("음수입력!");
		else if(getBalance()-amount>= -1* credit_limit){
			setBalance(getBalance() - amount);
		}
		else{
			throw new Exception("Debit amount exceeded account balance.");
		}
	}
	
	public void passTime(int month){
		if(getBalance()>=0)
			setBalance(getBalance() * (1+interest*month));
		else
			setBalance(getBalance()*(1+loan_interest*month));
	}
	public void passTime(){
		int month = 1;
		if(getBalance()>=0)
			setBalance(getBalance() * (1+interest*month));
		else
			setBalance(getBalance()*(1+loan_interest*month));
	}
	 public double getWithdrawableAccount(){
		 return getBalance()+credit_limit;
		 }
	 
	 boolean isBankrupted(){
		 if(getBalance()<credit_limit*(-1))
			 return true;
		 else
			 return false;
	 }

	@Override
	public String toString(){
		return String.format("CheckingAccount Balance : %.2f", getBalance());
	}
	
	@Override
	public double EstimateValue(int month) {
		if(getBalance()>=0)
			return (getBalance() * (1+interest*month));
		else
			return (getBalance()*(1+loan_interest*month));
	}
	
	@Override
	public double EstimateValue() {
		double month = 1.0f;
		if(getBalance()>=0)
			return (getBalance() * (1+interest*month));
		else
			return (getBalance()*(1+loan_interest*month));
	}
}
