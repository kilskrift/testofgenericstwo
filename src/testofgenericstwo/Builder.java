package testofgenericstwo;

public class Builder {
	boolean b_flag;

	public boolean get_flag() {
		return b_flag;
	}
	
	public void set_flag( boolean new_flag ) {
		b_flag = new_flag;
	}
			
	public Builder() {
		b_flag = false;
	}

	public Superclass return_class() {

		if( !b_flag ) {
			return new A_class();
		}
		else {
			return new B_class();
		}
	}
}