// Employee class with employee information and monthly salary
import java.math.BigDecimal;

public class Employee {
    // Employee instance variables employeeID, firstName, lastName, and monthlySalary
    private int         employeeID;
    private String      firstName;
    private String      lastName;
    private BigDecimal  monthlySalary;

    // Employee Constructor 
    // To initialize the Employee instance variables
    public Employee(int employeeID, String firstName, String lastName, BigDecimal monthlySalary) {
        this.employeeID = employeeID;
        this.firstName  = firstName;
        this.lastName   = lastName;

        // To validate that monthly salary is positive
        if (monthlySalary.compareTo(BigDecimal.ZERO) > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            throw new IllegalArgumentException( "Monthly salary must be positive.");
        }
    }

    // To set employee ID
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    // To return employee ID
    public int getEmployeeID() {
        return employeeID;
    }

    // To set first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // To return first name
    public String getFirstName() {
        return firstName;
    }

    // To set last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // To return last name
    public String getLastName() {
        return lastName;
    }

    // To set monthly salary if the value is positive
    public void setMonthlySalary(BigDecimal monthlySalary) {
        if (monthlySalary.compareTo(BigDecimal.ZERO) > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            throw new IllegalArgumentException( "Monthly salary must be positive.");
        }
    }

    // To return monthly salary
    public BigDecimal getMonthlySalary() {
        return monthlySalary;
    }
}