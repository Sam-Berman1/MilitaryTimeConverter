package militaryTimeConversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase1 {

	/**
	 * @Test Boundary Condition 23 in convertFromMilitaryTime
	 * Passed test!
	 */
	void test() {
		
		double result = MilitaryTimeConversion.convertFromMilitaryTime(23);
		assertEquals(11, result);
		}

}
