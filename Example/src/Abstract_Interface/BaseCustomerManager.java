package Abstract_Interface;


public abstract class BaseCustomerManager implements IcustomerManager {

	@Override
	public void save(Customer customer) {
		  
		  System.out.println(customer.getName()+" isimli ki�i kaydedilmi�tir...");
	}
	
    //public abstract void hesap();
		

	
	

}
