package militaryTimeConversion;

import static org.junit.jupiter.api.Assertions.*;

class TestCase5 {

	/**
	 * @Test Boundary Condition 0 in convertFromMilitaryTime
	 * Passed test!
	 */
	void test() {
		
		double result = MilitaryTimeConversion.convertFromMilitaryTime(0);
		assertEquals(12, result);
		}

}
