import java.math.BigDecimal;
import java.math.RoundingMode;

public class PayrollSystemTest {
    public static void main(String[] args) {
        // To create SalariedEmployee object
        var salariedEmployee = new SalariedEmployee("Geethan Raju", new BigDecimal("1000.00"));

        // To create CommissionEmployee object
        var commissionEmployee = new CommissionEmployee("Hannah Amundson", new BigDecimal("10000.00"), new BigDecimal("0.06"));

        // To create HourlyWorker object
        var hourlyWorker = new HourlyWorker("Rajinikanth Gaikwad", new BigDecimal("20.00"), new BigDecimal("45.00"));

        // To process employees individually
        System.out.println("Employees processed individually:");
        System.out.printf("%s%nearned: $%s%n%n", salariedEmployee, salariedEmployee.calculateEarnings().setScale(2, RoundingMode.HALF_EVEN));
        System.out.printf("%s%nearned: $%s%n%n", commissionEmployee, commissionEmployee.calculateEarnings().setScale(2, RoundingMode.HALF_EVEN));
        System.out.printf("%s%nearned: $%s%n%n", hourlyWorker, hourlyWorker.calculateEarnings().setScale(2, RoundingMode.HALF_EVEN));

        // To test HourlyWorker setter methods
        hourlyWorker.setWage(new BigDecimal("25.00"));
        hourlyWorker.setHours(new BigDecimal("42.00"));

        // To test HourlyWorker getter methods
        System.out.println("HourlyWorker setter and getter tests:");
        System.out.println("Wage after setWage(): $" + hourlyWorker.getWage());
        System.out.println("Hours after setHours(): " + hourlyWorker.getHours());
        System.out.println();

        // Test regular earnings at 40 hours
        hourlyWorker.setWage(new BigDecimal("20.00"));
        hourlyWorker.setHours(new BigDecimal("40.00"));

        System.out.printf("Regular earnings for 40 hours: $%s%n", hourlyWorker.calculateEarnings().setScale(2, RoundingMode.HALF_EVEN));

        // To test overtime earnings at 45 hours
        hourlyWorker.setHours(new BigDecimal("45.00"));

        System.out.printf("Overtime earnings for 45 hours: $%s%n%n", hourlyWorker.calculateEarnings().setScale(2, RoundingMode.HALF_EVEN));

        // To create and initialize Employee array
        Employee[] employees = {salariedEmployee, commissionEmployee, hourlyWorker};

        System.out.println("Employees processed polymorphically:");

        // To process each Employee in the array
        for (Employee currentEmployee : employees) {
            // To invoke the appropriate toString method
            System.out.println(currentEmployee);

            // To give SalariedEmployee a 10% salary increase
            if (currentEmployee instanceof SalariedEmployee employee) {
                employee.setSalary(employee.getSalary().multiply(new BigDecimal("1.10")));
                System.out.printf("new salary with 10%% increase is: $%s%n", employee.getSalary().setScale( 2, RoundingMode.HALF_EVEN));
            }
            
            // To calculate earnings polymorphically
            System.out.printf("earned: $%s%n%n", currentEmployee.calculateEarnings().setScale(2, RoundingMode.HALF_EVEN));
        }

        // To display the type of each object in the Employee array
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
        }
        System.out.println();

        // To test invalid HourlyWorker wage
        try {
            hourlyWorker.setWage(new BigDecimal("-10.00"));
        }
        catch (IllegalArgumentException exception) {
            System.out.println("Invalid wage exception caught: " + exception.getMessage());
        }

        // To test invalid HourlyWorker hours
        try {
            hourlyWorker.setHours(new BigDecimal("-5.00"));
        }
        catch (IllegalArgumentException exception) {
            System.out.println("Invalid hours exception caught: " + exception.getMessage());
        }

        // To test constructor validation with invalid wage
        try {
            new HourlyWorker("Invalid Worker", new BigDecimal("-20.00"), new BigDecimal("40.00"));
        }
        catch (IllegalArgumentException exception) {
            System.out.println("Constructor exception caught: " + exception.getMessage());
        }
    }
}