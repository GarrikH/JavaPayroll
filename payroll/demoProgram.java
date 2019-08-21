
package payroll;

/**
 *
 * @author Garrik Hoyt
 */
public class demoProgram {

    
    public static void main(String[] args) {
        SalariedEmployee e1 = new SalariedEmployee("Garrik", "Hoyt", "12-123-1234", 96888.00);
        System.out.println("e1 weekly pay: " + e1.weeklySalary());
        
        HourlyEmployee e2 = new HourlyEmployee("Donna", "Bingham", "98-987-9876", 29.99);
        e2.setHours(60);
        System.out.println("e2 week pay: " + e2.weeklySalary());
        
        CommissionEmployee e3 = new CommissionEmployee("Zach", "Vitale", "65-32-2822");
        e3.setSales(34060.38);
        System.out.println("e3 week pay: " + e3.weeklySalary());
        
        BasePlusCommission e4 = new BasePlusCommission("Chan", "Bingham", "32-291-2912", 72120.87);
        e4.setSales(22213.21);
        System.out.println("e4 week pay: " + e4.weeklySalary());
    }
    
}
