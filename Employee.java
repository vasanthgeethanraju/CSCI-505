import java.math.BigDecimal;

public abstract class Employee {
    private final String name;
    // The constructor
    public Employee(String name) {
        this.name = name;
    }
    // To return employee name
    public String getName() {
        return name;
    }
    // To return String representation of Employee object
    @Override
    public String toString() {
        return String.format("name: %s", getName());
    }

    // The abstract method must be overridden by concrete subclasses
    public abstract BigDecimal calculateEarnings();
}