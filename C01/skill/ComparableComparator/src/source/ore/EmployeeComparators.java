package source.ore;

import java.util.Comparator;

public class EmployeeComparators {
	public static Comparator<Employee> byAge() {
        return Comparator.comparingInt(Employee::getAge);
    }

    public static Comparator<Employee> bySalary() {
        return Comparator.comparingDouble(Employee::getSalary);
    }
}