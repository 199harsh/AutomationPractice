package day5;

public class Unary_Ops3 {

	public static void main(String[] args) {

		int a = 5,b;

		b = a++ + ++a + ++a + a;

//initial: 5 +  7  +  8  + 8

//final:   6    7     8    8

		System.out.println("a: "+a);//8

		System.out.println("b: "+b);//28

		System.out.println("**************");

		a = 7;
		b = a-- + --a + --a + a ;

//initial:  7  +  5  +  4  +  4
//final :   6     5     4     4

		System.out.println("a: "+a);//4 
		System.out.println("b: "+b);//20

		a = -21;

		b = --a + --a + --a + a + ++a + a++;//

		System.out.println(a);//
		System.out.println(b);//
		
		a = -5;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		System.out.println(a);//
		System.out.println(b);//
	}

}
