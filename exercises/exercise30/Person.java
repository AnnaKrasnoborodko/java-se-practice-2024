package pl.globallogic.exercises.exercise30;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setAge(int newAge) {
        if (newAge < 0 || newAge > 100) {
            this.age = 0;
        }
        this.age = newAge;
    }

    public boolean isTeen() {

        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
                return lastName;
            } else if (lastName.isEmpty()) {
                    return firstName;
                } else {
        return firstName + " " + lastName;
        }
    }
}
