/*
 * Author Fisal Ikhmayes 
 * Cs-320
 * Module 3 milestone 
 */

package Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import module_3_milestone_cs_320.Contact;
import module_3_milestone_cs_320.ContactService;

class ContactServiceTest {

private ContactService contactService;
	
	@BeforeEach
	void setUp() throws Exception {
		contactService = new ContactService();
	}

	@Test
	void testContactService() {
		//tests if hash map is not null
	    ContactService contactService = new ContactService();
	    HashMap<String, Contact> contacts = contactService.getContacts();
	    assertNotNull(contacts, "HashMap should not be null");
	}
	
	@Test
	void testAddContact() {
		//create a new Contact object
        Contact contact = new Contact("1234567890", "Fisal", "Ikhmayes", "6148272374", "4345 Main St");

        // add the Contact object to the ContactService's HashMap
        contactService.addContact(contact);

        assertThrows(IllegalArgumentException.class, () -> {
            contactService.addContact(contact);
        });
    }
	@Test
	void testDeleteContact() {
	    // ccreate a new Contact object 
	    Contact contact = new Contact("1234567890", "Fisal", "Ikhmayes", "6148272374", "4345 Main St");

	    // add the Contact object to the ContactService's HashMap
	    contactService.addContact(contact);

	    // test deleting a valid contact ID
	    contactService.deleteContact("1234567890");

	    // check that the ContactServices HashMap no longer contains the removed contact
	    HashMap<String, Contact> contacts = contactService.getContacts();
	    assertFalse(contacts.containsKey("1234567890"));

	    // test deleting an invalid contact ID
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	        contactService.deleteContact("invalid contact id");
	    });

	    //check that the correct exception is thrown
	    assertEquals("Contact ID does not exist.", exception.getMessage());
	}

	@Test
	void testUpdatesInfo() {
	    // create a contact to add
	    Contact contact = new Contact("1", "Fisal", "Ikhmayes", "6148272374", "4345 Main St.");

	    // add the contact to the service
	    contactService.addContact(contact);

	    // update the contact info
	    contactService.UpdatesInfo("1", "Adam", "Smith", "5437772323", "456 Park Ave.");

	    // get the updated contact from the service
	    Contact updatedContact = contactService.getContact("1");

	    // verify that the contact was updated correctly
	    assertNotNull(updatedContact);
	    assertEquals("Adam", updatedContact.GetFirstName());
	    assertEquals("Smith", updatedContact.GetLastName());
	    assertEquals("5437772323", updatedContact.GetPhone());
	    assertEquals("456 Park Ave.", updatedContact.GetAddress());

	    // test invalid parameters Length
	    assertThrows(IllegalArgumentException.class, () -> contactService.UpdatesInfo("1", "veryLongFirstName", "Ikhmayes", "1234567890", "4345 Main St."));
	    assertThrows(IllegalArgumentException.class, () -> contactService.UpdatesInfo("1", "Fisal", "VeryLongLastName", "1234567890", "4345 Main St."));
	    assertThrows(IllegalArgumentException.class, () -> contactService.UpdatesInfo("1", "Fisal", "Ikhmayes", "12345678", "4345 Main St."));
	    assertThrows(IllegalArgumentException.class, () -> contactService.UpdatesInfo("1", "Fisal", "Ikhmayes", "1234567890", "1234567890123456789012345678901"));
	    // Test null parameters
	    assertThrows(IllegalArgumentException.class, () -> contactService.UpdatesInfo("1", null, "Ikhmayes", "1234567890", "4345 Main St."));
	    assertThrows(IllegalArgumentException.class, () -> contactService.UpdatesInfo("1", "Fisal", null, "1234567890", "4345 Main St."));
	    assertThrows(IllegalArgumentException.class, () -> contactService.UpdatesInfo("1", "Fisal", "Ikhmayes", null, "4345 Main St."));
	    assertThrows(IllegalArgumentException.class, () -> contactService.UpdatesInfo("1", "Fisal", "Ikhmayes", "1234567890", null));
	
	    //tests contactId does not exist 
	    assertThrows(IllegalArgumentException.class, () -> contactService.UpdatesInfo("2", "Fisal", "Ikhmayes", "6148272374", "4345 Main St."));
	}

	}



