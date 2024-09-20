package day16_Static_method;

public class prime_assi {
	
	public static void main(String[] args)
	{
		PrintPrime(5, 50);
	}
	static void PrintPrime(int start,int end) {
		for(;start<=end;start++) {
			int ct=0;
			for(int i=1;i<=start;i++) {
				if(start%i==0) {
					ct++;
				}
			}
			if(ct==2) {
				System.out.println("Prime Number is : " + start);
			}
		}
	}

}
