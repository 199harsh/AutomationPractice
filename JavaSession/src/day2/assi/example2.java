package day2.assi;

public class example2 {
	int num1=25,num2;  //NSGV
	static int num3=45,num4=55;  //SGV
	
	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		int result;
		
		result=num3+num4;
		System.out.println("SGV num3 :" + num3);
		System.out.println("SGV num4 :" + num4);
		System.out.println("Local Variable Result :" + result);
		
		example2 ref = new example2();
		result = ref.num1+ref.num2;
		System.out.println("NSGV num1 :" + result);
		System.out.println("Program ends");
	
	}
}
