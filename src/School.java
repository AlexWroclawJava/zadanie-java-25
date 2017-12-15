
public class School {

    public static void main(String[] args) {

        Student student = new Student("Aleksander", "Szlachcic",25);
        String dane1 = student.show();
        System.out.println(dane1);

        Teacher teacher = new Teacher("Kazimierz", "Szymanowski",47,4999);
        String dane2 = teacher.show();
        System.out.println(dane2);
    }
}
