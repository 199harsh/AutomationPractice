package day9.loop;

public class loop2 {

	public static void main(String[] args) {
 
		System.out.println("*********Even number b/n 1 to 50****************");
		for(int i=0;i<=50;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		} 
		System.out.println("*********Odd number b/n 1 to 50****************");
		for(int i=0;i<=50;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
