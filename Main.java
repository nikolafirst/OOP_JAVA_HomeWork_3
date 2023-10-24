import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 30, 50000, "Sales"));
        employees.add(new Employee("Amy", 25, 60000, "Finance"));
        employees.add(new Employee("David", 35, 45000, "HR"));
        employees.add(new Employee("Emily", 28, 55000, "IT"));
        

        System.out.println("Before sorting:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("After sorting by age:");
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("After sorting by salary (descending):");
        Collections.sort(employees, new SalaryComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("After sorting by department (in lexicographic order):");
        Collections.sort(employees, new DepartmentComparator());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
