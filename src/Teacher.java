
public class Teacher extends BasisClass {

    private int height;
    private double salary;

    public Teacher(String firstName, String lastName, int height, int salary) {
        super(firstName, lastName);
        this.height = height;
        this.salary = salary;
    }

    @Override
    public void show() {
        System.out.print("Nauczyciel: ");
        super.show();
        System.out.println(", wzrost:" + height + " " + "wynagrodzenie: " + salary);
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
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
