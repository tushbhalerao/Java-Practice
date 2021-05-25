/*Q. methods in java
Addition: 50
*/
class A{
    void add(int a,int b){
        System.out.println("Addition: "+(a+b));
    }
}
public class OOPSex4 {
    public static void main(String args[]) {
        A a= new A();
        a.add(20,30);
        //a.add();  ---Invalid
        //a.add(10);  ---Invalid
        //a.add(10,20,30);  ---Invalid
    }
}