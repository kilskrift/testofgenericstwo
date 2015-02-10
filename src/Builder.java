
public class Builder {
	boolean b_flag;

	public Builder() {
		b_flag = false;
	}
	
	public <T extends Generic_class<T>> T return_class() {

		if( !b_flag ) {
			return (T) new A_class();
		}
		else {
			return (T) new B_class();
		}
	}
}