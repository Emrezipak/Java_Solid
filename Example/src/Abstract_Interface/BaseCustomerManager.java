package Abstract_Interface;


public abstract class BaseCustomerManager implements IcustomerManager {

	@Override
	public void save(Customer customer) {
		  
		  System.out.println(customer.getName()+" isimli kiþi kaydedilmiþtir...");
	}
	
    //public abstract void hesap();
		

	
	

}
