package day18.Scanner;

import java.util.Scanner;

public class Factor_na {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter Any Na. :");
		Scanner snc=new Scanner(System.in);
		num=snc.nextInt();
		for(int i=num;i<-(num);i++) {
			if(i!=0) {
				if(num%i==0) {
					System.out.println("" + num + " is " +i);
				}
			}
		}
	}

}
