package triangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

	@Before 
	public void setup()
	{
		
	}
	@Test
	public void test() {
		Triangle t1 = new Triangle (3,4,5);
		assertEquals(t1.getType(),TriangleType.Scalene);
		t1=new Triangle(5,7,5);
		assertEquals(t1.getType(),TriangleType.Isoceles);
		t1=new Triangle (9,9,9);
		assertEquals(t1.getType(),TriangleType.Equilateral);
		t1=new Triangle (0,0,0);
		assertEquals(t1.getType(),TriangleType.Invalid);
		t1=new Triangle (1,2,3);
		assertEquals(t1.getType(),TriangleType.Invalid);
		t1=new Triangle (5,6,0);
		assertEquals(t1.getType(),TriangleType.Invalid);
		t1=new Triangle (7,7,-1);
		assertEquals(t1.getType(),TriangleType.Invalid);
	}
	@After
	public void fin()
	{
		
	}
}
