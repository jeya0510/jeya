import java.util.*;
class AtmTrans
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);	
		AtmTrans a1 = new AtmTrans();	
		char card='Y';
		while(card=='Y')
        	{
		System.out.println("ATM..");
		
		int n=sc.next();
		switch(n)
		{
			case 1:
					a1.atm();		
				
			default:
				System.out.Println("Please check and try again..");
				break;
			}
			System.out.Println("Do you want to try again..?");
				card='N';
			}
	}
	public void atm()
	{
		int balance=10000, withdraw;
		System.out.print("Enter money to be withdrawn:");
                withdraw = sc.next();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money..");
                }
		else
                {
                    System.out.println("Insufficient Balance..");
                }
                System.out.println("");
		
}
}


            	
