public class Builder {
	boolean b_flag;

	public Builder() {
		b_flag = false;
	}
	
	public Superclass<?> return_class() {

		if( !b_flag ) {
			return (A_class) new Superclass<A_class>();
		}
		else {
			return (B_class) new Superclass<B_class>();
		}
	}
}