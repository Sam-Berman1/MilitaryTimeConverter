package militaryTimeConversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase2 {

	/**
	 * @Test Boundary condition "1" in convertFromMilitaryTime
	 * Passed test!
	 */
	void test() {
		double result = MilitaryTimeConversion.convertFromMilitaryTime(1);
		assertEquals(1, result);
		}
	}


