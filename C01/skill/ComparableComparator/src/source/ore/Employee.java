package source.ore;
import java.util.*;
class Employee implements Comparable<Employee>, Cloneable {
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can't happen
        }
    }
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}