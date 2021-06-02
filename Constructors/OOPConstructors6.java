/*
Employee Details
-----------------
Employee id=E-111
Employee name=abc
Employee salary=50000.0
Employee Address=Mumbai
Employee Details
-----------------
Employee id=E-131
Employee name=abd
Employee salary=50000.0
Employee Address=Jaypur
Employee Details
-----------------
Employee id=E-411
Employee name=gsf
Employee salary=60000.0
Employee Address=Pune
*/
class Employee{
    String eid;
    String ename;
    float esal;
    String eaddr;
    Employee(String emp_id, String emp_name, float emp_sal, String emp_addr){
        eid=emp_id;
        ename=emp_name;
        esal=emp_sal;
        eaddr=emp_addr;
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
public class OOPConstructors6 {
    public static void main(String args[]) {
      Employee emp1= new Employee("E-111","abc",50000.00f,"Mumbai");
      emp1.getEmployeeDetails();
      Employee emp2= new Employee("E-131","abd",50000.00f,"Jaypur");
      emp2.getEmployeeDetails();
      Employee emp3= new Employee("E-411","gsf",60000.00f,"Pune");
      emp3.getEmployeeDetails();
    }
}