package day11.assi;

public class Example3 {

	public static void main(String[] args) {

		int a = 10,b = 20;
		
        System.out.println("Before swapping, a = " + a + " and b = " + b);

        b = a + b - (a = b);

        System.out.println("Before swapping, a = " + a + " and b = " + b);
	}

}
