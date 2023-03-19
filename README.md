# Mobile-App-Contact-Service-and-Contact-Object

This is a GitHub repository for the contact service and contact object components of a mobile application. The purpose of this repository is to provide unit tests to verify that the application meets the customer's requirements for adding, updating, and deleting contacts within the application.

Getting Started

To get started with this project, clone this repository to your local machine.

bash
Copy code
git clone https://github.com/<username>/mobile-app-contact-service.git
Prerequisites

Java 8 or higher
JUnit 4 or higher
Contact Class Requirements

The contact object has the following requirements:

A required unique contact ID string that cannot be longer than 10 characters.
The contact ID cannot be null and cannot be updated.
A required firstName string field that cannot be longer than 10 characters.
The firstName field cannot be null.
A required lastName string field that cannot be longer than 10 characters.
The lastName field cannot be null.
A required phone string field that must be exactly 10 digits.
The phone field cannot be null.
A required address field that must be no longer than 30 characters.
The address field cannot be null.
Contact Service Requirements

The contact service has the following requirements:

The contact service shall be able to add contacts with a unique ID.
The contact service shall be able to delete contacts per contact ID.
The contact service shall be able to update contact fields per contact ID. The following fields are updatable: firstName, lastName, phone, and address.
Running the Unit Tests

To run the unit tests, navigate to the project root directory and execute the following command:

bash
Copy code
./gradlew test
This command will run all of the JUnit tests for the contact service and contact object. If all tests pass, you should see a message indicating that all tests were successful.

Contributing

If you wish to contribute to this project, please fork the repository and submit a pull request.

License

This project is licensed under the MIT License - see the LICENSE file for details.
