/*Q. Procedure to use abstract classes
m1-A
m2-B
m3-B
----------------
m1-A
m2-B
m3-B
m4-B
*/
abstract class A{
    void m1(){
        System.out.println("m1-A");
    }
    abstract void m2();
    abstract void m3();
}
class B extends A{
    void m2(){
        System.out.println("m2-B");
    }
    void m3(){
        System.out.println("m3-B");
    }
    void m4(){
        System.out.println("m4-B");
    }
}
public class OOPSex2 {
    public static void main(String args[]) {
      //A a= new A();      ----error
      A a= new B();
      a.m1();
      a.m2();
      a.m3();
      //a.m4();             ----error
      System.out.println("----------------");
      B b= new B();
      b.m1();
      b.m2();
      b.m3();
      b.m4();
    }
}