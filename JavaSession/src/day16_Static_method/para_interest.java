package day16_Static_method;

public class para_interest {

	public static void main(String[] args) {

		int principleAmount=550000;
		double intrest=getSimpleInterest(principleAmount,8.5,5);
		
		double finalAmount=principleAmount+intrest;
		System.out.println(finalAmount);
	}
	static double getSimpleInterest(int p,double r,int t) {
		//double res=(p*r*t);
		//return res;
		
		return (p*r*t)/100;
	}

}
