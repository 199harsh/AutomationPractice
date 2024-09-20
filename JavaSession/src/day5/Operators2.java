package day5;

public class Operators2 {

	public static void main(String[] args) {

		int num1=25,num2=45;
		boolean cond1=(num1!=num2);
		boolean cond2=(num1<num2);
		
		boolean res1=(cond1 && cond2);
		boolean res2=(cond1 || (num1==num2));
		boolean res3=((num1 <= num2) && (num1==num2));
		boolean res4=((num1 <= num2) || (num1==num2));

		System.out.println("Result1: " +res1);
		System.out.println("Result2: " +res2);
		System.out.println("Result3: " +res3);
		System.out.println("Result4: " +res4);
	}

}
