package day16_Static_method;

public class parameter {
	
	public static void main(String[] args) {
			//isGivenNumberPrime(17);
			//System.out.println("Given Number : "+ isGivenNumberPrime(17));
			boolean res = isGivenNumberPrime(17);
			System.out.println(res);
		}
		static boolean isGivenNumberPrime(int num) {
			int ct=0;
			boolean res;
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					ct++;
				}
			}
			if(ct==2) {
				res=true;
				//System.out.println("Given Number is Prime"+num);
			}else {
				res=false;
			}
			return res;
		}
}
