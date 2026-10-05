// HourlyWorker concrete class (subclass) extends abstract class Employee
import java.math.BigDecimal;

public class HourlyWorker extends Employee {
    private BigDecimal wage;   // hourly wage
    private BigDecimal hours;  // hours worked

    // The constructor
    public HourlyWorker(String name, BigDecimal wage, BigDecimal hours) {
        super(name);

        // If wage is invalid, throw exception
        if (wage.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("wage must be >= 0.0");
        }

        // If hours are invalid, throw exception
        if (hours.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("hours must be >= 0.0");
        }

        this.wage = wage;
        this.hours = hours;
    }

    // To set hourly wage
    public void setWage(BigDecimal wage) {
        if (wage.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("wage must be >= 0.0");
        }
        this.wage = wage;
    }

    // To return hourly wage
    public BigDecimal getWage() {
        return wage;
    }

    // To set hours worked
    public void setHours(BigDecimal hours) {
        if (hours.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("hours must be >= 0.0");
        }
        this.hours = hours;
    }

    // To return hours worked
    public BigDecimal getHours() {
        return hours;
    }

    // To calculate earnings
    @Override
    public BigDecimal calculateEarnings() {

        BigDecimal fortyHours = new BigDecimal("40");
        BigDecimal overtimeRate = new BigDecimal("1.5");

        // To calculate regular earnings for 40 hours or less
        if (getHours().compareTo(fortyHours) <= 0) {
            return getWage().multiply(getHours());
        }

        // To calculate regular pay for the first 40 hours
        BigDecimal regularPay = getWage().multiply(fortyHours);

        // To calculate the number of overtime hours
        BigDecimal overtimeHours = getHours().subtract(fortyHours);

        // To calculate overtime pay at 1.5 times the hourly wage
        BigDecimal overtimePay = overtimeHours.multiply(getWage().multiply(overtimeRate));

        // To return regular pay plus overtime pay
        return regularPay.add(overtimePay);
    }

    // To return String representation of HourlyWorker object
    @Override
    public String toString() {
        return String.format("%s%nwage: $%s%nhours: %s", super.toString(), getWage(), getHours());
    }
}