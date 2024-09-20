package day5;

public class Unary_Ops2 {

	public static void main(String[] args) {

		int a =-25,b;

		b = a++;// b = - 25 | a = - 24 
		int x = a, y;//x=-24

		System.out.println(x);//-24

		y = ++x;// x = - 23 | y = - 23

		System.out.println(a);//-24

		System.out.println(b);//-25

		System.out.println(x);//-23

		System.out.println(y);//-23

		int p = 15 , q = 30 ,res;

		res = p+++--q;//res=15+29

		System.out.println("res: " + res);//44

		System.out.println("p: " + p);//16

		System.out.println("q: " + q);//29

		System.out.println("**************************");
			
		int res1 = ++p+ ++q;//res1=17+30

		System.out.println(res1); // 47

		System.out.println("p: " + p);//17 System.out.println("q: " + q);//30
	}

}
