package lld.design.usecases.librarymanagement.dto.user;

public class Employee extends User {
    private double salary;
    public Employee(long id, String name, String email, long contactNumber, double salary) {
        super(id, name, email, contactNumber);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
