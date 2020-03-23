package militaryTimeConversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase3 {
	/**
	 * @Test
	 * Tests method AMPM to ensure 12 doesnt return AM 
	 * Test passed!
	 */
	
	void test() {
		String result = MilitaryTimeConversion.ampm(12);
		assertEquals("PM", result);
	}

}
