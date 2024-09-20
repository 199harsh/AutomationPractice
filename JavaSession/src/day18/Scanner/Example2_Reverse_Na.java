package day18.Scanner;
import java.util.Scanner;

public class Example2_Reverse_Na {

	public static void main(String[] args) {

		int x,r;
		System.out.println("Enter Any Na. :");
		Scanner snc=new Scanner(System.in);
		x=snc.nextInt();
		System.out.println("Your Na. in Reverse Oreder :");
		do {
			r=x%10;
			System.out.println(" " + x);
			x=x/10;
		}
		while(x>0);
	}

}
