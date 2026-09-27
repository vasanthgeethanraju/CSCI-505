// To test the application that creates and uses Employee objects
import java.math.BigDecimal;

public class EmployeeTest {
    public static void main(String[] args) {
        // To create first Employee object
        Employee employee1 = new Employee(
            101,
            "Geethan",
            "Raju",
            new BigDecimal("10000.00")
        );

        // To create second Employee object
        Employee employee2 = new Employee(
            102,
            "Rajinikanth",
            "Gaikwad",
            new BigDecimal("16000.00")
        );

        // To calculate yearly salaries
        BigDecimal employee1YearlySalary = employee1.getMonthlySalary().multiply(new BigDecimal("12"));

        BigDecimal employee2YearlySalary = employee2.getMonthlySalary().multiply(new BigDecimal("12"));

        // To display yearly salaries
        System.out.println("Employee 1: " + employee1.getFirstName() + " " + employee1.getLastName());
        System.out.println("Yearly salary: $" + employee1YearlySalary);
        System.out.println();

        System.out.println("Employee 2: " + employee2.getFirstName() + " " + employee2.getLastName());
        System.out.println("Yearly salary: $" + employee2YearlySalary);
        System.out.println();

        // To give the first employee a 10% raise
        BigDecimal employee1NewMonthlySalary = employee1.getMonthlySalary().multiply(new BigDecimal("1.10"));
        employee1.setMonthlySalary(employee1NewMonthlySalary);

        // To give the second employee a 10% raise
        BigDecimal employee2NewMonthlySalary = employee2.getMonthlySalary().multiply(new BigDecimal("1.10"));
        employee2.setMonthlySalary(employee2NewMonthlySalary);

        // To calculate new yearly salaries
        BigDecimal employee1NewYearlySalary = employee1.getMonthlySalary().multiply(new BigDecimal("12"));

        BigDecimal employee2NewYearlySalary = employee2.getMonthlySalary().multiply(new BigDecimal("12"));

        // To display yearly salaries after the 10% raise
        System.out.println("After 10% raise:");

        System.out.println("Employee 1: " + employee1.getFirstName() + " " + employee1.getLastName());
        System.out.println("New yearly salary: $" + employee1NewYearlySalary);
        System.out.println();

        System.out.println("Employee 2: " + employee2.getFirstName() + " " + employee2.getLastName());
        System.out.println("New yearly salary: $" + employee2NewYearlySalary);
    }
}