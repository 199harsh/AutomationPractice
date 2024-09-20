package day9.loop;

public class loop {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
		}
		System.out.println("*********************************");
		for(int i=1;i<6;i++) {
			System.out.println("Hello");
		}
		System.out.println("*********************************");
		for(int i=1;i<6;i++) {
			System.out.println(i);
		}
		System.out.println("*********************************");
		for(int i=5;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println("*********************************");
		int x=5;
		for(;x>=1;) {
			System.out.println(x);
			x--;
		}
		System.out.println("*************A to Z********************");
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch + ",");
		}
		System.out.println("*************Z to A ********************");
		for(char ch='Z';ch>='A';ch--) {
			System.out.println(ch + ",");
		}	
	}

}
