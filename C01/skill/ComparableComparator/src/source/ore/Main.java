package source.ore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 70000));
        employees.add(new Employee("Bob", 25, 50000));
        employees.add(new Employee("Charlie", 35, 60000));
        Collections.sort(employees);
        System.out.println("Sorted by name: " + employees);
        employees.sort(EmployeeComparators.byAge());
        System.out.println("Sorted by age: " + employees);
        employees.sort(EmployeeComparators.bySalary());
        System.out.println("Sorted by salary: " + employees);
        Employee clonedEmployee = employees.get(0).clone();
        System.out.println("Cloned Employee: " + clonedEmployee);
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}