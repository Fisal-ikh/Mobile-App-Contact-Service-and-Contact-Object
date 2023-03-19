/*
 * Author Fisal Ikhmayes 
 * Cs-320
 * Module 3 milestone 
 */

package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import module_3_milestone_cs_320.Contact;

class ContactTest {
    private Contact contact;


	@BeforeEach
	void setUp() {
	    // create test data
        contact = new Contact("1234567890", "Fisal", "Ikhmayes", "6149000100", "234 Blue Lake Ln");
	}
	@Test
	void testContactNullInput() {
	    // test invalid null
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(null, "Fisal", "Ikhmayes", "6149000100", "234 Blue Lake Ln");
	    });

	    // test invalid null
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("1234567890", null, "Ikhmayes", "6149000100", "234 Blue Lake Ln");
	    });

	    // test invalid null
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("1234567890", "Fisal", null, "6149000100", "234 Blue Lake Ln");
	    });

	    // test invalid null
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("1234567890", "Fisal", "Ikhmayes", null, "234 Blue Lake Ln");
	    });

	    // test invalid null
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("1234567890", "Fisal", "Ikhmayes", "6149000100", null);
	    });
	}

	@Test
	void testContactMaxLengthInput() {
	    // test invalid length
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("12345678901", "Fisal", "Ikhmayes", "6149000100", "234 Blue Lake Ln");
	    });

	    // test invalid length
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("1234567890", "verylongfirstname", "Ikhmayes", "6149000100", "234 Blue Lake Ln");
	    });

	    // test invalid length
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("1234567890", "Fisal", "verylonglastname", "6149000100", "234 Blue Lake Ln");
	    });

	    // test invalid length
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("1234567890", "Fisal", "Ikhmayes", "6149000100", "123 Main St 123 Main St 123 Main St");
	    });
	}
	
	
	@Test
	void testSetFirstName() {
		// test invalid length
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.SetFirstName("verylongfirstname");
	    });
	    //tests a good input 
	    Assertions.assertDoesNotThrow(() -> {
	        contact.SetFirstName("Fisal");
	    });
	    //tests null
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.SetFirstName(null);
	    });
	    
	  
	}

	@Test
	void testSetLastName() {
		// test invalid length
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.SetLastName("verylongLastname");
	    });
	    //tests a good input 
		Assertions.assertDoesNotThrow(() -> {
	        contact.SetLastName("ikhmayes");
	    });
	    //tests null
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.SetLastName(null);
	    });
	}
	
	@Test
	void testSetPhone() {
		// test invalid length
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.SetPhone("1234567891011");
	    });
	    //tests a good input 
	  	Assertions.assertDoesNotThrow(() -> {
	  		contact.SetPhone("6149000100");
	  	});
	    //tests shorter then 10
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.SetPhone("123");
	    });
	    //tests null
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.SetPhone(null);
	    });
	}
	
	@Test
	void testSetAddress() {
		//tests longer than 30
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.SetAddress("123 Main St 123 Main St 123 Main St");
	    });
	    //tests a good input 
	  	Assertions.assertDoesNotThrow(() -> {
	  		contact.SetAddress("123 Jane Doe");
	  	});
	    //tests null
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.SetAddress(null);
	    });
	}
	
	
	//tests the getters methods
	@Test
    void testGetContactID() {
        assertEquals("1234567890", contact.GetContactID());
    }

    @Test
    void testGetFirstName() {
        assertEquals("Fisal", contact.GetFirstName());
    }

    @Test
    void testGetLastName() {
        assertEquals("Ikhmayes", contact.GetLastName());
    }

    @Test
    void testGetPhone() {
        assertEquals("6149000100", contact.GetPhone());
    }

    @Test
    void testGetAddress() {
        assertEquals("234 Blue Lake Ln", contact.GetAddress());
    }
}







