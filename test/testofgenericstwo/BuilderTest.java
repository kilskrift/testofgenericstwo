package testofgenericstwo;

import static org.junit.Assert.*;
import org.junit.Test;

public class BuilderTest {

	@Test
	public void return_class_test() {
		Builder builder = new Builder();
		Superclass<?> myclass = builder.return_class();
		
		assertTrue( myclass instanceof A_class);
	}
}
