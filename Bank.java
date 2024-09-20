package setA_Prog3;

import java.util.Scanner;

class NegativeException extends Exception{
	
	public NegativeException(String msg) {
	
		super(msg);
	}
}


public class Bank {
	
	int amount;
	public void deposit() {
		System.out.println("Deposited amount is:"+amount);
	}

	public static void main(String[] args) throws NegativeException {
		
		Bank b=new Bank();
		try(Scanner s=new Scanner(System.in)){
		
			System.out.println("Enter amount to deposit: ");
			b.amount=s.nextInt();
			if(b.amount<0) {
				throw new NegativeException("Amount never negative");
			}else {
				b.deposit();
			}
		}catch(NegativeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}

