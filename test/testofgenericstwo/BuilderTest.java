package testofgenericstwo;

import static org.junit.Assert.*;
import org.junit.Test;

public class BuilderTest {
	
	@Test
	public void return_class_test_returns_A_class_if_Builder_flag_not_set() {
		
		Superclass myclass;	// common ancestor to A_class and B_class		
		
		Builder builder = new Builder();
		
		builder.set_flag(false); // i.e. return_class will return A_class
		if( !builder.get_flag() ) {
			myclass = (A_class) builder.return_class();
		}
		else {
			myclass = (B_class) builder.return_class();
		}
		
		assertTrue( myclass instanceof A_class);
		assertTrue( myclass instanceof Superclass);
	}
	
	@Test
	public void return_class_test_returns_B_class_if_Builder_flag__set() {
		
		Superclass myclass;	// common ancestor to A_class and B_class		
		
		Builder builder = new Builder();

		builder.set_flag(true); // i.e. return_class will return A_class
		if( !builder.get_flag() ) {
			myclass = (A_class) builder.return_class();
		}
		else {
			myclass = (B_class) builder.return_class();
		}
		
		assertTrue( myclass instanceof B_class);
		assertTrue( myclass instanceof Superclass);
	}
}
