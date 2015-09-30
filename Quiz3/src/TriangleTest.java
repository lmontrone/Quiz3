import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testGetArea() 
	{
		Triangle tester = new Triangle(24.0, 30.0, 18.0);
		assertEquals("Test Area", tester.getArea(), 216.0, .1);
		assertEquals("Test Perimeter", tester.getPerimeter(), 72.0, .1);
	}

}
