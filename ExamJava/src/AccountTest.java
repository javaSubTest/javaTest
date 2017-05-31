import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest {
	public static void main(String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		int k = 1;
		switch(k){
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		}
		boolean is = true;
		do{
			System.out.println();
		}while(false);
		try{
			
		}catch(InputMismatchException e) {
			is = false;
			System.err.print("asdf");
			System.out.println("1111");
		}
		//System.out.println(is);
		Account account = new CheckingAccount(100,50,0.01,0.07);
		//(CheckingAccount)account.debit(20);
		
		
		CheckingAccount account1 = new CheckingAccount(100,50,0.01,0.07);
		SavingAccount account2 = new SavingAccount(100,0.05);
		
		ArrayList<Account> accountList = new ArrayList<Account>();
		accountList.add(account1);
		accountList.add(account2);
		System.out.println("전체 계좌의 잔액 합산 : "+Account.sumForAccount(accountList));
		double next = 50.0;
		System.out.println("전체 계좌의 12개월 후 적용");
		Account.passTimeForList(accountList, 12);
		System.out.println("전체 계좌의 잔액 합산 : "+Account.sumForAccount(accountList));
		System.out.println("흠");
		scan.nextInt();
		scan.nextLine();
		boolean bool = false;
		while(bool = true){
			System.out.printf("돼나%.0f",3.3);
		}
		
	} 
}


/*
Scanner scan = new Scanner(System.in);

Valuable[] objectList = new Valuable[4];

objectList[0] = new CheckingAccount(100,50,0.01,0.07);
objectList[1] = new SavingAccount(100,0.05);
objectList[2] = new Human("Mark", 20);
objectList[3] = new Car("MyCar", 5000);

for(Valuable objectItem : objectList){
	System.out.printf("%s \n", objectItem.toString());
	System.out.printf("1 month later Value (Method Overloding, no parameter) : %.2f\n", objectItem.EstimateValue(1));
	System.out.printf("5 month later Value : %.2f\n\n", objectItem.EstimateValue(5));
}

Account account1 = new CheckingAccount(100,50,0.01,0.07);
Account account2 = new SavingAccount(100,0.05);
CheckingAccount c_account1 = (CheckingAccount)account1;
SavingAccount s_account2 = (SavingAccount)account2;

int cmd;
do{
	double amount = 0;
	cmd = scan.nextInt();
	switch(cmd){
		//CheckingAccount 테스트 
		case 1 : 
			try{ 
				System.out.println("$100 입금");
				account1.credit(100);
				System.out.printf("Account1의 잔액 : $%.2f\n",account1.getBalance());
				System.out.printf("Account1의 출금가능액 : $%.2f\n",account1.getWithdrawableAccount());
				System.out.println("------------------------------------------------------");
				
				System.out.println("$150 출금");
				account1.debit(150);
				System.out.printf("Account1의 잔액 : $%.2f\n",account1.getBalance());
				System.out.printf("Account1의 출금가능액 : $%.2f\n",account1.getWithdrawableAccount());
				if(c_account1.isBankrupted()==true)
					System.out.println("파산");
				System.out.println("------------------------------------------------------");
				
				account1.passTime(1);
				System.out.printf("1개월 뒤 가치변화 후 Account1의 잔액 : $%.2f\n",account1.getBalance());
				System.out.printf("Account1의 출금가능액 : $%.2f\n",account1.getWithdrawableAccount());
				if(c_account1.isBankrupted()==true)
					System.out.println("파산");
				System.out.println("------------------------------------------------------");
					
			
				System.out.println("$80 출금");
				account1.debit(80);
				System.out.printf("Account1의 잔액 : $%.2f\n",account1.getBalance());
				System.out.printf("Account1의 출금가능액 : $%.2f\n",account1.getWithdrawableAccount());
				if(c_account1.isBankrupted()==true)
					System.out.println("파산");
				System.out.println("------------------------------------------------------");
				
				System.out.print("5개윌 뒤 가치 : ");
				account1.passTime(5);
				System.out.printf("5개월 뒤 가치 변화 후 Account1의 잔액 : $%.2f\n",account1.getBalance());
				System.out.printf("Account1의 출금가능액 : $%.2f\n",account1.getWithdrawableAccount());
				if(c_account1.isBankrupted()==true)
					System.out.println("파산");
				System.out.println("------------------------------------------------------");
				
				System.out.println("amount에 음수입력");
				account1.debit(-1);
				System.out.println("------------------------------------------------------");
				
			}catch(InputMismatchException e){
				System.out.println("예외발생 " + e.toString() + ": 숫자를 입력하세요\n");
			}
			catch(Exception e){
				System.out.println("예외발생   "+e.toString());
			}
			
			break;
	
		
		//SavingsAccount 테스트 
		case 2 : 
			try{ 
				System.out.println("$150 출금");
				account2.debit(150);
				
			}catch(InputMismatchException e){
				System.out.println("예외발생 " + e.toString() + ": 숫자를 입력하세요\n");
			}
			catch(Exception e){
				System.out.println("예외발생   "+e.toString());
			}
			
			break;
			
		case 3 :
			try{ 
				account2.passTime(1);
				
				System.out.printf("1개월 뒤 가치변화 후 Account2의 잔액 : $%.2f\n",account2.getBalance());
				System.out.printf("Account2의 출금가능액 : $%.2f\n",account2.getWithdrawableAccount());
				System.out.printf("1개윌 째의 가치 : %.2f\n",((SavingAccount)account2).EstimateValue());
				System.out.println("------------------------------------------------------");
					
				
				
				account2.passTime(5);
				System.out.printf("5개월 뒤 가치 변화 후 Account2의 잔액 : $%.2f\n",account2.getBalance());
				System.out.printf("Account1의 출금가능액 : $%.2f\n",account2.getWithdrawableAccount());
				System.out.printf("6개윌 째의 가치 : %.2f\n",((SavingAccount)account2).EstimateValue(6));
				System.out.println("------------------------------------------------------");
				
				account2.passTime(5);
				System.out.printf("5개월 뒤 가치 변화 후 Account2의 잔액 : $%.2f\n",account2.getBalance());
				System.out.printf("Account2의 출금가능액 : $%.2f\n",account2.getWithdrawableAccount());
				System.out.printf("11개월 째의 가치 %.2f\n",((SavingAccount)account2).EstimateValue(11));
				System.out.println("------------------------------------------------------");
				
				
				account2.passTime(1);
				System.out.printf("1개월 뒤 가치변화 후 Account2의 잔액 : $%.2f\n",account2.getBalance());
				System.out.printf("Account2의 출금가능액 : $%.2f\n",((SavingAccount)account2).getWithdrawableAccount());

				System.out.println("------------------------------------------------------");
				
				System.out.println("amount에 음수입력");
				account1.debit(-1);
				System.out.println("------------------------------------------------------");
				
			}catch(InputMismatchException e){
				System.out.println("예외발생 " + e.toString() + ": 숫자를 입력하세요\n");
			}
			catch(Exception e){
				System.out.println("예외발생   "+e.toString());
			}		
			break;
			
		case 0 : System.out.println("끝");
	}	
}while(cmd!=0);
*/