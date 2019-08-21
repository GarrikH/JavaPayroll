
package payroll;

/**
 *
 * @author Garrik Hoyt
 */
public class BasePlusCommission extends CommissionEmployee {
    private double salary;
    
    public BasePlusCommission(String f, String l, String ssn, double s)
    {
        super(f, l, ssn);
        salary = s;
    }
    public void setSalary(double s)
    {
        salary = s;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public double weeklySalary()
    {
        return super.weeklySalary() + (this.getSalary() / 52);
    }
}
