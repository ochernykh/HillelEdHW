package homework8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Initialize Parent class
        Employee employee = new Employee();
        employee.work();
        employee.learn();

        //Initialize Child classes
        Employee undefinedDev = new Developer();
        undefinedDev.learn();
        System.out.println(undefinedDev);

        Developer alex = new Developer(1, "Alex", 3000, "dev@mail.com", new ArrayList<String>() );
        alex.sleep();//call parent method
        alex.work();///call child method
        alex.learn("Java");
        System.out.println(alex);
    }
}
