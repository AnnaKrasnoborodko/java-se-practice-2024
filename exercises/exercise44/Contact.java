package pl.globallogic.exercises.exercise44;

public class Contact {
    private String name;
    private String phoneNumber;

public Contact (String name, String phoneNumber) {
    setName(name);
    setPhoneNumber(phoneNumber);
}

    public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    }
    public void setName(String name) {
    this.name = name;
    }
    public String getName() {
    return name;
    }
    public String getPhoneNumber() {
    return phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber) {
    return new Contact(name, phoneNumber);
    }
}
