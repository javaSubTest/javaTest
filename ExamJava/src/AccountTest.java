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
		System.out.println("��ü ������ �ܾ� �ջ� : "+Account.sumForAccount(accountList));
		double next = 50.0;
		System.out.println("��ü ������ 12���� �� ����");
		Account.passTimeForList(accountList, 12);
		System.out.println("��ü ������ �ܾ� �ջ� : "+Account.sumForAccount(accountList));
		System.out.println("��");
		scan.nextInt();
		scan.nextLine();
		boolean bool = false;
		while(bool = true){
			System.out.printf("�ų�%.0f",3.3);
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
		//CheckingAccount �׽�Ʈ 
		case 1 : 
			try{ 
				System.out.println("$100 �Ա�");
				account1.credit(100);
				System.out.printf("Account1�� �ܾ� : $%.2f\n",account1.getBalance());
				System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
				System.out.println("------------------------------------------------------");
				
				System.out.println("$150 ���");
				account1.debit(150);
				System.out.printf("Account1�� �ܾ� : $%.2f\n",account1.getBalance());
				System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
				if(c_account1.isBankrupted()==true)
					System.out.println("�Ļ�");
				System.out.println("------------------------------------------------------");
				
				account1.passTime(1);
				System.out.printf("1���� �� ��ġ��ȭ �� Account1�� �ܾ� : $%.2f\n",account1.getBalance());
				System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
				if(c_account1.isBankrupted()==true)
					System.out.println("�Ļ�");
				System.out.println("------------------------------------------------------");
					
			
				System.out.println("$80 ���");
				account1.debit(80);
				System.out.printf("Account1�� �ܾ� : $%.2f\n",account1.getBalance());
				System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
				if(c_account1.isBankrupted()==true)
					System.out.println("�Ļ�");
				System.out.println("------------------------------------------------------");
				
				System.out.print("5���� �� ��ġ : ");
				account1.passTime(5);
				System.out.printf("5���� �� ��ġ ��ȭ �� Account1�� �ܾ� : $%.2f\n",account1.getBalance());
				System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
				if(c_account1.isBankrupted()==true)
					System.out.println("�Ļ�");
				System.out.println("------------------------------------------------------");
				
				System.out.println("amount�� �����Է�");
				account1.debit(-1);
				System.out.println("------------------------------------------------------");
				
			}catch(InputMismatchException e){
				System.out.println("���ܹ߻� " + e.toString() + ": ���ڸ� �Է��ϼ���\n");
			}
			catch(Exception e){
				System.out.println("���ܹ߻�   "+e.toString());
			}
			
			break;
	
		
		//SavingsAccount �׽�Ʈ 
		case 2 : 
			try{ 
				System.out.println("$150 ���");
				account2.debit(150);
				
			}catch(InputMismatchException e){
				System.out.println("���ܹ߻� " + e.toString() + ": ���ڸ� �Է��ϼ���\n");
			}
			catch(Exception e){
				System.out.println("���ܹ߻�   "+e.toString());
			}
			
			break;
			
		case 3 :
			try{ 
				account2.passTime(1);
				
				System.out.printf("1���� �� ��ġ��ȭ �� Account2�� �ܾ� : $%.2f\n",account2.getBalance());
				System.out.printf("Account2�� ��ݰ��ɾ� : $%.2f\n",account2.getWithdrawableAccount());
				System.out.printf("1���� °�� ��ġ : %.2f\n",((SavingAccount)account2).EstimateValue());
				System.out.println("------------------------------------------------------");
					
				
				
				account2.passTime(5);
				System.out.printf("5���� �� ��ġ ��ȭ �� Account2�� �ܾ� : $%.2f\n",account2.getBalance());
				System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account2.getWithdrawableAccount());
				System.out.printf("6���� °�� ��ġ : %.2f\n",((SavingAccount)account2).EstimateValue(6));
				System.out.println("------------------------------------------------------");
				
				account2.passTime(5);
				System.out.printf("5���� �� ��ġ ��ȭ �� Account2�� �ܾ� : $%.2f\n",account2.getBalance());
				System.out.printf("Account2�� ��ݰ��ɾ� : $%.2f\n",account2.getWithdrawableAccount());
				System.out.printf("11���� °�� ��ġ %.2f\n",((SavingAccount)account2).EstimateValue(11));
				System.out.println("------------------------------------------------------");
				
				
				account2.passTime(1);
				System.out.printf("1���� �� ��ġ��ȭ �� Account2�� �ܾ� : $%.2f\n",account2.getBalance());
				System.out.printf("Account2�� ��ݰ��ɾ� : $%.2f\n",((SavingAccount)account2).getWithdrawableAccount());

				System.out.println("------------------------------------------------------");
				
				System.out.println("amount�� �����Է�");
				account1.debit(-1);
				System.out.println("------------------------------------------------------");
				
			}catch(InputMismatchException e){
				System.out.println("���ܹ߻� " + e.toString() + ": ���ڸ� �Է��ϼ���\n");
			}
			catch(Exception e){
				System.out.println("���ܹ߻�   "+e.toString());
			}		
			break;
			
		case 0 : System.out.println("��");
	}	
}while(cmd!=0);
*/