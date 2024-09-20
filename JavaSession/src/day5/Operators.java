package day5;

public class Operators {
	public static void main(String[] args) {
		System.out.println("Program Starts");
	
		int num1=25,num2=30;
		boolean res=(num1==num2);
		System.out.println("Comparing num1 and num2 using '==' " + res);
		System.out.println("Comparing num1 and num2 using '==' " + (num1==num2));
		System.out.println("Comparing num1 and num2 using '!=' " + (num1!=num2));
		System.out.println("Comparing num1 and num2 using '<' " + (num1<num2));
		System.out.println("Comparing num1 and num2 using '<=' " + (num1<=num2));
		System.out.println("Comparing num1 and num2 using '>' " + (num1>num2));
		System.out.println("Comparing num1 and num2 using '>=' " + (num1>=num2));
	
		System.out.println("Program End");
	}

}
