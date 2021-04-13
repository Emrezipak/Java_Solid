package Abstract_Interface;

import java.io.IOException;

public class starbucksManager extends BaseCustomerManager {

	private ICheckId CheckControl;
	
	public starbucksManager(ICheckId checkControl) {
		CheckControl = checkControl;
	}

	@Override
	public void save(Customer customer){
		
		if(CheckControl.control(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Kayýt geçersiz...");
		}
	}
	
}
