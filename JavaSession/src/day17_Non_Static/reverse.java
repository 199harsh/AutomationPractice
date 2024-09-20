package day17_Non_Static;

public class reverse {

	public static void main(String[] args) {
		reverse ref = new reverse();
		//ref.PrintReverse()
		System.out.println("Reverse Number is : " + ref.PrintReverse(123));
	}
	public int PrintReverse(int num) {
		System.out.println("Original number is : " +num);
		int rev=0,rem;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev ;
	}

}
