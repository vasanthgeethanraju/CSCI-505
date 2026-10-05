// CommissionEmployee concrete class (subclass) extends abstract class Employee
import java.math.BigDecimal;

public class CommissionEmployee extends Employee {
    private BigDecimal grossSales;      // gross weekly sales
    private BigDecimal commissionRate;  // commission percentage

    // The constructor
    public CommissionEmployee(String name, BigDecimal grossSales, BigDecimal commissionRate) {
        super(name);

        // If gross sales are invalid, throw an exception
        if (grossSales.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("gross sales must be >= 0.0");
        }

        // If commission rate is invalid, throw an exception
        if (commissionRate.compareTo(BigDecimal.ZERO) <= 0 || commissionRate.compareTo(BigDecimal.ONE) >= 0) {
            throw new IllegalArgumentException("commission rate must be > 0.0 and < 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // To set gross sales
    public void setGrossSales(BigDecimal grossSales) {
        if (grossSales.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    // To return gross sales
    public BigDecimal getGrossSales() {
        return grossSales;
    }

    // To set commission rate
    public void setCommissionRate(BigDecimal commissionRate) {
        if (commissionRate.compareTo(BigDecimal.ZERO) <= 0 || commissionRate.compareTo(BigDecimal.ONE) >= 0) {
            throw new IllegalArgumentException("commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    // To return commission rate
    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    // To calculate earnings
    @Override
    public BigDecimal calculateEarnings() {
        return getGrossSales().multiply(getCommissionRate());
    }

    // To return String representation of CommissionEmployee object
    @Override
    public String toString() {
        return String.format("%s%ngross sales: $%s%ncommission rate: %s", super.toString(), getGrossSales(), getCommissionRate());
    }
}