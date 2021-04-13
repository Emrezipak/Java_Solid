package Abstract_Interface;


public class neroCustomer extends BaseCustomerManager{
	
	private ICheckId CheckControl;

	public neroCustomer(CheckId CheckControl) {
		this.CheckControl = CheckControl;
	}

	@Override
	public void save(Customer customer) {
	    if(CheckControl.control(customer)) {
			super.save(customer);
	    }
	    else {
	    	System.out.println("Kayýt geçersiz...");
	    }
	}


	

}
