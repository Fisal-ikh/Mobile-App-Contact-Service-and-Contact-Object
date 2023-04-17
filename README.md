# Mobile-App-Contact-Service-and-Contact-Object

This is a GitHub repository for the contact service and contact object components of a mobile application. The purpose of this repository is to provide unit tests to verify that the application meets the customer's requirements for adding, updating, and deleting contacts within the application.

How can I ensure that my code, program, or software is functional and secure?
In reflecting on my work in these projects, I believe that to ensure that code, program, or software is functional and secure, it is important to apply a systematic approach to testing and quality assurance. This approach should include identifying requirements, developing test cases, executing tests, and analyzing test results. It is also important to consider security vulnerabilities and potential attacks, and incorporate security measures into the design and testing process by inputing Private data members. 

How do I interpret user needs and incorporate them into a program?
To interpret user needs and incorporate them into a program, I believe that it is important to actively listen to users, ask questions, and seek feedback throughout the development process. It is also important to consider the user experience and ensure that the program is easy to use and meets the user's goals and objectives.

How do I approach designing software?
When approaching designing software, I believe that it is important to begin by identifying requirements and use cases. This involves understanding the problem that the software is intended to solve and the needs of the users. Once the requirements are established, it is important to develop a software design that meets those requirements while also considering factors such as scalability, maintainability, and security. It is also important to iterate on the design and incorporate feedback throughout the development process to ensure that the final product meets the needs of the users.


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

