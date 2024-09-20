package day_21_ex;

public class Example6 {

	public static void main(String[] args) {
		int r=5,k=0;
		for(int i=1;i<=r;++i,k=0) {
			for(int c=1;c<=r-i;++c) {
				System.out.print(" ");	
			}
			while(k!=2*i-1) {
				System.out.print("*");	
				++k;
			}
			System.out.println();			
		}
		
		System.out.println("############################################");	
	
			    int rows = 5, k1 = 0, count = 0, count1 = 0;
			    for (int i = 1; i <= rows; ++i) {
			      for (int space = 1; space <= rows - i; ++space) {
			        System.out.print("  ");
			        ++count;
			      }
			      while (k1 != 2 * i - 1) {
			        if (count <= rows - 1) {
			          System.out.print((i + k1) + " ");
			          ++count;
			        } else {
			          ++count1;
			          System.out.print((i + k1 - 2 * count1) + " ");
			        }
			        ++k1;
			      }
			      count1 = count = k1 = 0;
			      System.out.println();
			    }
			    
				System.out.println("############################################");	

			    int rows1 = 5;
			    for(int i = rows1; i >= 1; --i) {
			      for(int space = 1; space <= rows1 - i; ++space) {
			        System.out.print("  ");
			      }
			      for(int j=i; j <= 2 * i - 1; ++j) {
			        System.out.print("* ");
			      }
			      for(int j = 0; j < i - 1; ++j) {
			        System.out.print("* ");
			      }
			      System.out.println();
			    }
			    
				System.out.println("############################################");	

			    int rows11 = 6, coef = 1;
			    for(int i = 0; i < rows11; i++) {
			      for(int space = 1; space < rows11 - i; ++space) {
			        System.out.print("  ");
			      }
			      for(int j = 0; j <= i; j++) {
			        if (j == 0 || i == 0)
			          coef = 1;
			        else
			          coef = coef * (i - j + 1) / j;
			        System.out.printf("%4d", coef);
			      }
			      System.out.println();
			    }
			    
				System.out.println("############################################");	

			    int rows111 = 4, number = 1;
			    for(int i = 1; i <= rows111; i++) {

			      for(int j = 1; j <= i; j++) {
			        System.out.print(number + " ");
			        ++number;
			      }
			      System.out.println();
			    }
	}
}
