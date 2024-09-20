package day2.assi;

public class Example3 {
	static int radius=2,base=5,height=10; //SGV
	int length=8,width=10; //NSGV
	
	
	public static void main(String[] args) {

		float result,result2,result3;                                                                
		
		result = 3.14F*radius*radius;
		result2 = 0.5F*base*height;
		
		System.out.println("Area Of Circle is :" + result);
		System.out.println("Area Of Triangle is :" + result2);
		
		Example3 ref=new Example3();
		result3 = ref.length*ref.width;

		System.out.println("Area Of Rectangle is :" + result3);	
	}
}

