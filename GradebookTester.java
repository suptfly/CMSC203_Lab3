import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	private GradeBook g1, g2;

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(60);
		g1.addScore(70);
		
		g2 = new GradeBook(5);
		g2.addScore(90);
		g2.addScore(30);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
		
	}

	@Test
	void testAddScore() {
		
		assertTrue(g1.toString().equals("60.0 70.0 "));
		assertTrue(g2.toString().equals("90.0 30.0 "));
		
		assertEquals(2, g1.getScoreSize());
		assertEquals(2, g2.getScoreSize());
		//fail("Not yet implemented");
	}

	@Test
	void testSum() {
		assertEquals(130, g1.sum(), .0001);
		assertEquals(120, g2.sum(), .0001);
		//fail("Not yet implemented");
	}

	@Test
	void testMinimum() {
		assertEquals(60, g1.minimum(), .001);
		assertEquals(30, g2.minimum(), .001);
		//fail("Not yet implemented");
	}

	@Test
	void testFinalScore() {
		assertEquals(70, g1.finalScore(), .001);
		assertEquals(90, g2.finalScore(), .001);
		//fail("Not yet implemented");
	}

	@Test
	void testGetScoreSize() {
		//fail("Not yet implemented");
		
	}

	@Test
	void testToString() {
		//fail("Not yet implemented");
	}

}
