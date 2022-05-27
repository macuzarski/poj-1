package pl.pjait.student;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Maciej", "Uzarski", 1993, Gender.MALE);
        Student student = new Student("Andrzej", "Duda", 1972, Gender.MALE, 123321);
        Lecturer lecturer = new Lecturer("Kamila", "Świerczyńska", 1995, Gender.FEMALE, "Magister");
        Scholar scholar = new Scholar("Patryk", "Gęsiak", 1993, Gender.MALE, 555234, 2000D);

        System.out.print("Person: " + person);
        System.out.println("\n");
        System.out.print("Student: " + student);
        System.out.println("\n");
        System.out.print("Lecturer: " + lecturer);
        System.out.println("\n");
        System.out.print("Scholar: " + scholar);
    }
}
