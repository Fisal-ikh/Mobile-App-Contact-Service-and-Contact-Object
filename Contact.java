/*
 * Author Fisal Ikhmayes 
 * Cs-320
 * Module 3 milestone 
 */

package module_3_milestone_cs_320;

public class Contact {
	
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		
		// check contact ID
        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID.");
        }
        this.contactID = contactID;
		
     // check first name
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name.");
        }
        this.firstName = firstName;
        
        // check last name
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name.");
        }
        this.lastName = lastName;
        
        // check phone number
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number.");
        }
        this.phone = phone;
        
        // check address
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address.");
        }
        this.address = address;
		
	}
	
	
	public void SetFirstName(String firstName) {
		//check first name
	    if (firstName == null || firstName.length() == 0 || firstName.length() > 10) {
	        throw new IllegalArgumentException("Invalid first name.");
	    }
	    this.firstName = firstName;
	}

	
	public void SetLastName(String lastName) {
		//check lastname
	    if (lastName == null || lastName.length() == 0 || lastName.length() > 10) {
	        throw new IllegalArgumentException("Invalid last name.");
	    }
	    this.lastName = lastName;
	}
	
	public void SetPhone(String phone) {
		// Check phone
		if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number.");
        }
        this.phone = phone;
	}
	
	public void SetAddress(String address) {
		// Check address
		  if (address == null || address.length() > 30) {
	            throw new IllegalArgumentException("Invalid address.");
	        }
	        this.address = address;
	}
	
	//getters methods 
	 public String GetContactID() {
	        return contactID;
	    }
	public String GetFirstName() {
		return firstName;
	}
	
	public String GetLastName() {
		return lastName;
	}
	
	public String GetPhone() {
		return phone;
	}

	public String GetAddress() {
		return address;
	}


}
