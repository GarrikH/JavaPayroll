
package payroll;

/**
 *
 * @author Garrik Hoyt
 */
public class CommissionEmployee extends Employee{
    private double sales = 0;
    private static double COM_RATE = 0.09;
    
    public CommissionEmployee(String f, String l, String ssn)
    {
        super(f, l, ssn);
    }
    public void setSales(double s)
    {
        sales = s;
    }
    public double getSales()
    {
        return this.sales;
    }
    public double weeklySalary()
    {
        return this.getSales() * COM_RATE;
    }
}
