
public class Builder {
	boolean b_flag;

	public Builder() {
		b_flag = false;
	}
	
	public A_class return_class() {

		if( !b_flag ) {
			return new A_class();
		}
		else {
			return new B_class();
		}
	}
}