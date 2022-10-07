package hw1_oop;

public class CompanyCustomer extends Customer {
	private String taxNumber;

	private String companyName;

	public CompanyCustomer() {

	}

	public CompanyCustomer(String taxNumber, String companyName) {
		super();
		this.taxNumber = taxNumber;
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
