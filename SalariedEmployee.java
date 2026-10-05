// SalariedEmployee concrete class (subclass) that extends abstract class Employee
import java.math.BigDecimal;

public class SalariedEmployee extends Employee {
    private BigDecimal salary; // To store the fixed weekly salary

    // The constructor
    public SalariedEmployee(String name, BigDecimal salary) {
        super(name);

        // If salary is invalid, throw an exception
        if (salary.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("salary must be >= 0.0");
        }
        this.salary = salary;
    }

    // To set salary amount
    public void setSalary(BigDecimal salary) {
        if (salary.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("salary must be >= 0.0");
        }
        this.salary = salary;
    }

    // To return salary amount
    public BigDecimal getSalary() {
        return salary;
    }

    // To calculate earnings
    @Override
    public BigDecimal calculateEarnings() {
        return getSalary();
    }

    // To return String representation of SalariedEmployee object
    @Override
    public String toString() {
        return String.format("%s%nsalary: $%s", super.toString(), getSalary());
    }
}