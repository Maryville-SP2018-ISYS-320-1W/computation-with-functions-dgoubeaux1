/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 What were the errors you found?
 
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = 37;
		ftoc(tempf, tempc);
		System.out.println("Body temp in C is: " + tempc);
	}

	// converts Fahrenheit temperatures to Celsius
	public static void ftoc(double tempf, double tempc) {
	      tempc = (tempf - 32) * 5 / 9;
    }
}
