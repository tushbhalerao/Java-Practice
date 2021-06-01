/*
A() has private access in A
      A a= new A();
           ^
*/
class A{
    private A(){
        System.out.println("A-con");
    }
}
public class OOPConstructors4 {
    public static void main(String args[]) {
      A a= new A();
      
    }
}