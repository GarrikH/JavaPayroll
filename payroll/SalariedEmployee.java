
package payroll;

/**
 *
 * @author Garrik Hoyt
 */
public class SalariedEmployee extends Employee {
    private double salary;
    
    public SalariedEmployee(String f, String l, String ssn, double s)
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
        return this.getSalary() / 52;
    }
}
