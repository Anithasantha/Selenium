package test1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class Account{
		private String accountNumber,customerName;
		private Double amount;
	
		
		public String getAccoutNumber() {
			return accountNumber;
		}
		public void setAccoutNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		
		void billPayments(String accountNumber,String customerName,Double amount) {
		}
		
		
		void print()
        {
		System.out.println("Hi! "+customerName+","+"currently you are using CheckingAccount");
		System.out.println("Your account number is "+accountNumber+"\nYour are currently holding amount"+amount);
        }
	}
	class CheckingAccount extends Account{
		void billPayments(String accountNumber,String customerName,Double amount) {
			double billAmount=amount-(amount*5/100);
			super.setAmount(billAmount);
			super.print();
		}
	}
	class SavingsAccount extends Account{
		void billPayments(String accountNumber,String customerName,Double amount) {
			double billAmount=amount-(amount*2/100);
            super.setAmount(billAmount);
			super.print();
		}
	}
	class FixedAccount extends Account{
		void billPayments(String accountNumber,String customerName,Double amount) {
			System.out.println("You can't withdrawl any amount from fixed account ");	
		}
	}
	
class MoneyTransfer{
	static String accNo,name;
	static Double amt;
	static void getDetails(){
		Scanner s=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Account Number");
		//accNo=s.nextLine();
		try {
			accNo=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter The Available Amount");
		try
		{
		amt=Double.parseDouble(br.readLine());
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter The Customer Name");
		name=s.next();
		
	}
	public static void main(String[] args) {
	Account newaccount=new Account();
	int ch;
	
	
	do {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Checking Account");
		System.out.println("2.Saving Account");
		System.out.println("3.Fixed Account");
		System.out.println("4.Exit");
		System.out.println("Enter the Account Type");
		ch=sc.nextInt();
		if(ch<4)
		getDetails();
		if(!checkDetails(accNo)) {
			System.out.println("Account not matching from given inputs");
			continue;
		}
		
		
		switch(ch){
			case 1: 
				newaccount=new CheckingAccount();
			    break;
			case 2:
				newaccount=new SavingsAccount();
				break;
			case 3:
				newaccount=new FixedAccount();
				 break;
			
		}
		if(ch<=3)
		{
		newaccount.setAccoutNumber(accNo);
		newaccount.setAmount(amt);
		newaccount.setCustomerName(name);
		newaccount.billPayments(accNo,name,amt);
		}
	}while(ch!=4);
	
	}
	private static boolean checkDetails(String accNo) {
		boolean f=false;
		String accNum[]= {"1111","2222","3333","4444","5555"};
		for(int i=0;i<accNum.length;i++) {
			if(accNo.equals("1111") ||accNo.equals("2222") || accNo.equals("3333")||accNo.equals("4444")) {
				f=true;
				break;
			}	
		}	
		return f;
	}
}
