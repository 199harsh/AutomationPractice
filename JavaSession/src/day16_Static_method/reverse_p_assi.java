package day16_Static_method;

public class reverse_p_assi {

	public static void main(String[] args) {
		System.out.println("reverse Number : "+ reverse(17));
	}		
	static int reverse(int num) {
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
