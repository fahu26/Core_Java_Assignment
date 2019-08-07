package comm.fahim;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShapeTest {
	public static Shape line;
	public static Shape rectangle;
	public static Shape cube;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		line=new Line();
		rectangle=new Rectangle();
		cube=new Cube();
	}

	@Test
	public void testIsShape_Cube() {
		assertEquals("cube",cube.draw());
	}
	
	@Test
	public void testIsShape_Line() {
		assertEquals("line",line.draw());
	}
	
	@Test
	public void testIsShape_Rectangle() {
		assertEquals("rectangle",rectangle.draw());
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		line=null;
		rectangle=null;
		cube=null;
	}

}
