package day16_Static_method;

public class factor_assi {

	public static void main(String[] args) {
		getFactors(-10);
	}
	static void getFactors(int num) {
		int i=num;
		for(;i<-(num);i++){
			if(i!=0){
				if(num%i==0){
					System.out.println(""+num+ "  is : "+ i);
				}
				
			}
			
		}
	}

}
