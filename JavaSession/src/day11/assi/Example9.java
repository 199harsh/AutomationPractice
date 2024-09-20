package day11.assi;

public class Example9{
	public static void main(String[]args) {
	
		int num=5,fact=1;
	
		for(;num>0;){
			fact=fact*num;
			num=num-1;
		}
		System.out.print("Factorial Number : "+num+" is :" + fact);
	}
}
