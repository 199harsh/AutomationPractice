package day11.assi;

public class Example8 {

	public static void main(String[] args) {

		int num=12321,t,s,rem;
		t=num;
		
		for(s=0;num>0;num/=10){
			rem=num%10;
			s=(s*10)+rem;
		}
		if(s==t) {
			System.out.println(t+" is a palindrome number ");			
		} 
		else{
			System.out.println(t+" is not a palindrome number ");
		}
		
		
	}
}
