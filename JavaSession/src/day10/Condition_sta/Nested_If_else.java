package day10.Condition_sta;

public class Nested_If_else {

	public static void main(String[] args) {

		int marks=34;
		if(marks>=35) {
			if(marks>=70) {
				System.out.println("You are passed with distinction");
			}else { 
				System.out.println("You are passed");
			}
		}else{
			System.out.println("you are failed");
		}
	}
		
}
