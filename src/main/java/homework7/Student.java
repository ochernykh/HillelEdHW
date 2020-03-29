package homework7;

public class Student {

    String firstName;
    String lastName;
    int age;

    Student() {
    }

    Student(int age) {
        this.firstName = "Undefined";
        this.lastName = "Undefined";
        this.age = age;
    }

    Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    void displayInfo(){
        System.out.printf("Students first name is %s \nStudents last name is %s \nStudents age is %d\n\n", firstName,lastName,age);
    }
}
