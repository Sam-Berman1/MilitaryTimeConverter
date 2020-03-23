package militaryTimeConversion;

import java.util.Scanner;

/**
 * 
 * @author Sam Berman
 * @Desc Program converts military into standard time
 * 8/30/19
 */ 

public class MilitaryTimeConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
    	System.out.println("*****Input Military hours to convert*****\n Type -1 to exit");
    	int inputHours = input.nextInt(); // hours in military time
		
    	if(inputHours == -1) {
			System.exit(0);
		}
    	
		System.out.printf("Military Time: %d %n", inputHours);
		System.out.println("------------------------");
		System.out.printf("Civilian Time: %d %s%n", convertFromMilitaryTime(inputHours), ampm(inputHours));
		MilitaryTimeConversion.main(null);
	 }
	
	
	
	/**
	 *  convertFromMilitaryTime
	 * <p> public static int convertFromMilitaryTime(int t)
	 *  Convert an input # of Hours from Military Time to Regular Time
	 * @param t - an integer representing # of hours (0 to 23)	
	 * @precondition t >=0, t<=23
	 * @return An integer representing the # of Hours (1 to 12) in standard Time
	 * @throws Indicates that t is less than 0 or greater than 23
	 */
	public static int convertFromMilitaryTime(int t) {
		try {
			// checks for valid input
			if (t < 0 || t > 23) {
				throw new IllegalArgumentException("Time must be between 0 and 23");
			}
			
			if (t == 0) {
				return 12;
			}
			
			if(t > 12) {
				return  t - 12;
			}
			
		}
	
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			MilitaryTimeConversion.main(null);
			System.exit(0);
		}
		return t;
	}
	
	/**
	 * Adds AM or PM to civilian time conversion.
	 * @param t - integer to represent.
	 * @precondition t >= 12
	 * @return returns AM or PM dependent on variable t being over 12.
	 */
	public static String ampm(int t) {
		return (t >= 12) ? "PM" : "AM";
			
	}
	
}
