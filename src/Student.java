
public class Student extends BasisClass {

    private int age;

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName);
        this.age = age;
    }

    @Override
    public void show() {
        System.out.print("Student: ");
        super.show();
        System.out.print(", wiek: ");
        System.out.println(" " + age);
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
