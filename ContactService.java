/*
 * Author Fisal Ikhmayes 
 * Cs-320
 * Module 3 milestone 
 */


package module_3_milestone_cs_320;

import java.util.HashMap;


public class ContactService {
	  private HashMap<String, Contact> contacts; // maps contactID to Contact object
	
	public ContactService() {
		this.contacts = new HashMap<>();
		
	}
	 public HashMap<String, Contact> getContacts() {
	        return this.contacts;
	    }
	// adds new contact
	public void addContact(Contact contact) {
		if (contacts.containsKey(contact.GetContactID())) {
			throw new IllegalArgumentException("Contact ID already exists.");
		}
		contacts.put(contact.GetContactID(), contact);
	}
	
	//deletes contact
	public void deleteContact(String contactID) {
        if (!contacts.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact ID does not exist.");
        }
        contacts.remove(contactID);
    }
	
	
	//updates the info
	public void UpdatesInfo(String contactID, String firstName, String lastName, String phone, String address) {
		//checks if contact id exists
		if (!contacts.containsKey(contactID)) {
			throw new IllegalArgumentException("ContactID" + contactID + "does not exists");
		}
		//creates a new object of Contact
		Contact contact = contacts.get(contactID);
		
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		contact.SetFirstName(firstName);
		
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		contact.SetLastName(lastName);
		
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		contact.SetPhone(phone);
		
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		contact.SetAddress(address);
		
	}
	
	//i believe this is for my test service to retrive the contact id. eclipse made me add it
	// and it took away my error
	public Contact getContact(String contactID) {
	    return contacts.get(contactID);
	}

	
}
