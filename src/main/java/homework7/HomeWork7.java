package homework7;

public class HomeWork7 {

    public static void main(String[] args) {
        //Set and display student credentials using default constructor
        Student alex = new Student();
        alex.firstName = "Alex";
        alex.lastName = "Smith";
        alex.age = 18;

        alex.displayInfo();

        //Set and display student credentials using parameterized constructors
        Student john = new Student("John", "Peterson", 20);

        john.displayInfo();

        Student undefinedStudent = new Student(17);
        undefinedStudent.displayInfo();

        //Set and display teacher credentials using default constructor and getters/setters
        Teacher teacher = new Teacher();
        teacher.setFirstName("Paul");
        teacher.setLastName("Johnson");
        teacher.setAge(31);

        System.out.printf("Teachers first name is %s\nTeachers last name is %s" +
                "\nTeachers age is %d\n", teacher.getFirstName(), teacher.getLastName(), teacher.getAge());

    }
}
