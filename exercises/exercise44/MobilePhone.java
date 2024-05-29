package pl.globallogic.exercises.exercise44;/* Mobile Phone
Create a program that implements a simple mobile phone with the following capabilities.
1. Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following attributes:
Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
And seven methods, they are (their functions are in their names):
addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't exists, or false if the contact already exists.
updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.
findContact(), has one parameter of type Contact and returns an int. The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
findContact(), same as above, only it has one parameter of type String.
queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the name and then return the Contact. Return null otherwise.
printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:
    • Contact List:
    • 1. Bob -> 31415926
    • 2. Alice -> 16180339
    • 3. Tom -> 11235813
    • 4. Jane -> 23571113
2. Implement the Contact class with the following attributes:
Two fields, both String, one called name and the other phoneNumber.
A constructor that takes two Strings, and initialises name and phoneNumber.
And Three methods, they are:
getName(), getter for name.
getPhoneNumber(), getter for phoneNumber.
createContact(), has two parameters of type String (the persons name and phone number) and returns an instance of Contact. This is the only method that is static.package pl.globallogic.exercises.exercise44;
*/
import pl.globallogic.exercises.exercise44.Contact;

import java.util.ArrayList;

public class MobilePhone {
private String myNumber;
private ArrayList<Contact> myContacts = new ArrayList<>();

public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<>();
}

public boolean addNewContact(Contact contact) {
    if (myContacts.contains(contact)) {
        return false;
    } else {
        myContacts.add(contact);
        return true;
    }
}

public boolean updateContact(Contact oldContact, Contact newContact) {
    int index = myContacts.indexOf(oldContact);
    if (index >= 0) {
        myContacts.set(index, newContact);
        return true;
    } else {
        return false;
    }
}
public boolean removeContact(Contact contact) {
    if (myContacts.contains(contact)) {
        myContacts.remove(contact);
        return true;
    } else {
        return false;
    }
}
public int findContact(Contact contact) {
    if (myContacts.contains(contact)) {
        return myContacts.indexOf(contact);
    } else {
        return -1;
    }
}

public int findContact(String name) {
    for (int i = 0; i < myContacts.size(); i++) {
        if (myContacts.get(i).getName().equals(name)) {
            return i;
        }
    }
    return -1;
}

public Contact queryContact(String name) {
    int position = findContact(name);
    if (position >= 0) {
        return this.myContacts.get(position);
    }
    return null;
}

public void printContacts() {
    System.out.println("Contact List: ");
    for (int i = 0; i < myContacts.size(); i++) {
        Contact contact = myContacts.get(i);
        System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
    }
}

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234567890");
        Contact contact1 = Contact.createContact("Bob", "31415926");
        Contact contact2 = Contact.createContact("Alice", "16180339");
        Contact contact3 = Contact.createContact("Tom", "11235813");
        Contact contact4 = Contact.createContact("Jane", "23571113");

        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);

        mobilePhone.printContacts();

        Contact newContact = Contact.createContact("Tom", "99999999");
        mobilePhone.updateContact(contact3, newContact);

        mobilePhone.printContacts();

        System.out.println("Query Tom: " + mobilePhone.queryContact("Tom").getPhoneNumber());

        mobilePhone.removeContact(contact4);
        mobilePhone.printContacts();
    }
}
