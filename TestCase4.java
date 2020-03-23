package militaryTimeConversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase4 {

	/**
	 * @Test for method ampm to ensure 11 (one before boundary condition) returns an AM
	 * Test passed!
	 */
	void test() {
		String result = MilitaryTimeConversion.ampm(11);
		assertEquals("AM", result);
	}

}
