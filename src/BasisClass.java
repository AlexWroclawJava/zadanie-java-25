public class BasisClass {

    public String firstName;
    public String lastName;


    public BasisClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}