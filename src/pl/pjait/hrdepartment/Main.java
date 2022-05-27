package pl.pjait.hrdepartment;

import pl.pjait.hrdepartment.model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Manager manager = new Manager("Steve", "Hawkins", 1989, 3200.0, 0.5, 999444222, 23, 1500.0, "Photo");
        Employee worker = new Worker("Joe",
                "Doe",
                1993,
                18.00,
                160,
                30,
                manager,
                new ArrayList<>(Arrays.asList("drilling", "smelting")));
        Employee officeWorker = new OfficeWorker("Gabe", "Nelson", 1995, 3800.0, 0.5, 333222666, 24, manager);
        Employee executive = new Executive("Michael", "Urbankus", 1988, 5500.0, 200.0, officeWorker, 4);
        Employee trainee = new Trainee("Bart", "Simpleson", 1999, officeWorker, true);
        Employee trainee2 = new Trainee("Krzysztof", "Ujerman", 1993, officeWorker, false);


        System.out.println(worker);
        System.out.println(worker.getSalary());
        System.out.println(manager);
        System.out.println(manager.getSalary());
        System.out.println(officeWorker);
        System.out.println(officeWorker.getSalary());
        System.out.println(executive);
        System.out.println(executive.getSalary());
        System.out.println(trainee);
        System.out.println(trainee.getSalary());
        System.out.println(trainee2);
        System.out.println(trainee2.getSalary());


    }
}
