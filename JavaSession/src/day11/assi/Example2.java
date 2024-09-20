package day11.assi;

public class Example2 {

	public static void main(String[] args) {
		int x=10,y=15,z=6;
		
		if(x>y) {
			if(x>z) {
					System.out.println("Large is x :" +x);
			}
			else {
				System.out.println("Large is z :"+ z);
			}
		}
		else {
			if(y>z) {
				System.out.println("Large is y :"+ y);
			}
			else {
				System.out.println("Large is z :"+ z);
			}
		}
	}

}
