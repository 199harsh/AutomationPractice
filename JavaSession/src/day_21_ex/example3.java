package day_21_ex;

public class example3 {
	public static void main(String[] args) {
		char r,c;
		for(r='A';r<='E';r++) {
			for(c='A';c<=r;c++) {
				System.out.print("" + c);			
			}
			System.out.println();			
		}
	}
}
