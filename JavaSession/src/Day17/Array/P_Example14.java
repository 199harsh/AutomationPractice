package Day17.Array;

public class P_Example14 {

	public static void main(String[] args) {
		
		int x[];
		x = new int[5];
		x[0]=10;//initialization  
		x[1]=20;  
		x[2]=70;  
		x[3]=40;  
		x[4]=50; 

		int i,j,t;
		for(i=0;i<5;i++) {
			for(j=i+1;j<5;j++) {
				t=x[i];
				x[i]=x[j];
				x[j]=t;
			}
		}
		System.out.println("Your data");
		for(i=0;i<5;i++) {
			System.out.println(""+x[i]);
		}
	}

}
