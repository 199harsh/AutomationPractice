package day17_Non_Static;

public class Prime {

	public static void main(String[] args) {
		Prime ref1 = new Prime();
		ref1.PrintPrime(5,50);
	}
	public void PrintPrime(int start,int end) {

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
