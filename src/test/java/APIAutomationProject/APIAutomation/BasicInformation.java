package APIAutomationProject.APIAutomation;

public class BasicInformation {
	
	private String id;
	private String firstname;
	private String lastname;
	private String designation;
	private AddressInformation addressInformation;
	

	public AddressInformation getAddressInformation() {
		return addressInformation;
	}
	public void setAddressInformation(AddressInformation addressInformation) {
		this.addressInformation = addressInformation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
