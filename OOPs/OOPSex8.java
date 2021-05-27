/* Q. Display data, pass reference variable as a parameter
Employee Details
--------------------
Employee ID: E-111
Employee Name: Durga
Employee Salary: 25000
Employee Address: Delhi
Employee Email: durga@gmail.com
Employee Mobile: 9988776655
*/
class Employee{
    String eid="E-111";
    String ename="Durga";
    String esal="25000";
    String eaddr="Delhi";
    String eemail="durga@gmail.com";
    String emob="9988776655";
    public String toString(){
        System.out.println("Employee Details");
        System.out.println("--------------------");
        System.out.println("Employee ID: "+eid);
        System.out.println("Employee Name: "+ename);
        System.out.println("Employee Salary: "+esal);
        System.out.println("Employee Address: "+eaddr);
        System.out.println("Employee Email: "+eemail);
        System.out.println("Employee Mobile: "+emob);
        return "";
    }
}
public class OOPSex8 {
    public static void main(String args[]) {
      Employee emp= new Employee();
      System.out.println(emp);
    }
}