package day11.assi;

public class Example6 {

	public static void main(String[] args) {

	    int count = 0, num = 34443452;

	    for (; num != 0; num /= 10, ++count){ 
	    }
	    System.out.println("Number of digits: " + count);
	}

}
