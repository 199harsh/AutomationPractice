package day11.assi;

public class Example10_Prime_Na {

	public static void main(String[] args) {

		 int num = 108,i=2;
		    for (; i <= num / 2;) {
		      if (num % i == 0) {
			      System.out.println(num + " is a prime number.");
		      }
		      else{
			      System.out.println(num + " is not a prime number.");
		      }
		      break;
		    }  
	}
}
