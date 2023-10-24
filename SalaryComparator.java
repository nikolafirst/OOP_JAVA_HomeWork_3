import java.util.Comparator;

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Double.compare(employee2.getSalary(), employee1.getSalary());
    }
}

class DepartmentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getDepartment().compareTo(employee2.getDepartment());
    }
}
