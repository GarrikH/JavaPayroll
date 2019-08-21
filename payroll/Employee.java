
package payroll;

/**
 *
 * @author Garrik Hoyt
 */
public abstract class Employee {
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;

   // three-argument constructor
   public Employee(String f, String l, String ssn)
   {
       firstName = f;
       lastName = l;
       socialSecurityNumber = ssn;
   }
   // set first name
   public void setFName(String name)
   {
       firstName = name;
   }
   // return first name
   public String getFName()
   {
       return this.firstName;
   }
    // set last name
   public void setLName(String name)
   {
       lastName = name;
   }
   // return last name
   public String getLName()
   {
       return this.lastName;
   }
   // set social security number
   public void setSSN(String ssn)
   {
       this.socialSecurityNumber = ssn;
   }
   // return social security number
   public String getSSN()
   {
       return this.socialSecurityNumber;
   }
   // return String representation of Employee object
   public String getFullName()
   {
       return this.getFName() + " " + this.getLName();
   }
   // abstract method overridden by concrete subclasses
   abstract double weeklySalary();
     // no implementation here

} // end abstract class Employee
