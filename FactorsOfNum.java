package setA_Prog2;
import java.util.Scanner;

public class FactorsOfNum{

	public static void main(String[] args) {


		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=s.nextInt();
		int cnt=0;
		System.out.print("Factors of "+n+" are: ");
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.print("1 and "+n);
			System.out.println();
			System.out.println(n+" has no more factors because it's prime number.");
		}

	}

}
