package day11.assi;

public class Example7 {

	public static void main(String[] args) {

		int num=1234567890;
		
		do{
			System.out.println("Your Revers Order :    " + num );
			num=num/10;
		}
		while(num>0);
	}
}
