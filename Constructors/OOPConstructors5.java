/*
Employee Details
-----------------
Employee id=E-111
Employee name=Abc
Employee salary=50000.0
Employee Address=Mumbai
*/
class Employee{
    String eid;
    String ename;
    float esal;
    String eaddr;
    Employee(){
        eid="E-111";
        ename="Abc";
        esal=50000.00f;
        eaddr="Mumbai";
    }
    public void getEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("-----------------");
        System.out.println("Employee id="+eid);
        System.out.println("Employee name="+ename);
        System.out.println("Employee salary="+esal);
        System.out.println("Employee Address="+eaddr);
    }
}
public class OOPConstructors5 {
    public static void main(String args[]) {
      Employee emp= new Employee();
      emp.getEmployeeDetails();
    }
}