package Abstract_Interface;


public class main {

	public static void main(String[] args) {
		BaseCustomerManager base1=new neroCustomer(new CheckId());
		base1.save(new Customer("Hasan",1,"zipak","25733747746",17));
		BaseCustomerManager base2=new starbucksManager(new CheckId());
		base2.save(new Customer("Emre",2,"Zipak","13636266264",17));

	}

}
