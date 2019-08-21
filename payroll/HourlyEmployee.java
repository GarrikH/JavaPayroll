
package payroll;

/**
 *
 * @author Garrik Hoyt
 */
public class HourlyEmployee extends Employee {
    private int hours = 0;
    private double wage;
    private static final double OT = 1.5;
    
    public HourlyEmployee(String f, String l, String ssn, double w)
    {
        super(f, l , ssn);
        wage = w;
    }
    public void setHours(int h)
    {
        hours = h;
    }
    public int getHours()
    {
        return this.hours;
    }
    public void setWage(double w)
    {
        wage = w;
    }
    public double getWage()
    {
        return this.wage;
    }
    public double getOtWage()
    {
        return this.getWage() * OT;
    }
    public double weeklySalary()
    {
        double pay = 0;
        if(this.hours <= 40)
        {
            if(this.hours < 0)
            {
                System.out.println("Invalid hours worked input");
            }
            else
            {
                pay = this.getWage() * this.getHours();
            }
        }
        else
        {
            pay = (this.getWage() * this.getHours()) 
                    +( (this.getHours() - 40) * this.getOtWage() );
        }
        
        return pay;
    }
    
}
