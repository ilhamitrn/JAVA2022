package hw1_oop;



public class Main {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager(); //örneğini oluşturma ve instance oluşturma,instance creation,  referansını oluşturma
		creditManager.calculate();
		creditManager.calculate();
		
		System.out.println("***************");
		Customer customer = new Customer(); //örneğini oluşturma ve instance oluşturma, instance creation,  referansını oluşturma
		customer.setId(1);
		//customer.setFirstName("İlhami");
		//customer.setLastName("Turan");
		//customer.setNationalIdentity("12356434234");
		customer.setCity("Konya");
		
		
		
		CustomerManager customerManager = new CustomerManager(customer,new MilitaryCreditManager());
		customerManager.save();
		customerManager.delete();
		
		creditManager.save();
		
		CompanyCustomer company = new CompanyCustomer();
		company.setTaxNumber("123654");
		company.setCompanyName("Vestel");
		company.setId(200);
		
		CustomerManager customerManager2 = new CustomerManager(company, new TeacherCreditManager());
		
		Customer c1 = new Customer();
		Customer c2 = new IndividualCustomer();
		Customer c3 = new CompanyCustomer();
		
		IndividualCustomer customer2 = new IndividualCustomer();
	customer2.setNationalIdentity("12312343543");
		
		
		CustomerManager customerManager3 = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager3.giveCredit();
		
		ICreditManager teCreditManager = new TeacherCreditManager();
		teCreditManager.save();
		
	}


	

	}
