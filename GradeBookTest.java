import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook one;
	GradeBook two;
	@BeforeEach
	void setUp() throws Exception {
		one = new GradeBook(5);
		two = new GradeBook(5);
		one.addScore(75.5);
		one.addScore(97.2);
		one.addScore(61.4);
		two.addScore(100.0);
		two.addScore(55.5);
	}

	@AfterEach
	void tearDown() throws Exception {
		one = null;
		two = null;
	}

	@Test
	void testAddScore() {
		assertTrue(one.toString().equals("75.5 97.2 61.4 0.0 0.0 "));
		assertTrue(two.toString().equals("100.0 55.5 0.0 0.0 0.0 "));
	}

	@Test
	void testSum() {
		assertEquals(234.1, one.sum());
		assertEquals(155.5 ,two.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(61.4, one.minimum());
		assertEquals(55.5, two.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(172.7, one.finalScore());
		assertEquals(100.0, two.finalScore());
	}

	@Test
	void testGetScoreSize() {
		assertEquals(5, one.getScoreSize() + two.getScoreSize());
	}

	@Test
	void testToString() {
		assertTrue(one.toString().equals("75.5 97.2 61.4 0.0 0.0 "));
	    assertTrue(two.toString().equals("100.0 55.5 0.0 0.0 0.0 "));
	}

}
