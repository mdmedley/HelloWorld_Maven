import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorld_MavenTest {
	private HelloWorld_Maven h;

	@Before
	public void setUp() throws Exception {
		h = new HelloWorld_Maven();
	}

	@SuppressWarnings("static-access")
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals("We keep it rockin!!", h.getMessage());
	}

}