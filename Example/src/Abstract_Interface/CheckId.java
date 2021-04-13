package Abstract_Interface;

public class CheckId implements ICheckId{

	@Override
	public boolean control(Customer customer) {
		if(customer.getAge()<18) {
			return false;
		}
		else {
			return true;
		}
	}
}
