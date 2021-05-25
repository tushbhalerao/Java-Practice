/*Q. Procedure to use interfaces in java Application
m1-A
m2-A
m3-A
----------------
m1-A
m2-A
m3-A
m4-A
*/
interface I{
    int x=20;  //public satatic final
    void m1(); //public and abstract
    void m2(); //public and abstract
    void m3(); //public and abstract
}
class A implements I{
    public void m1(){
        System.out.println("m1-A");
    }
    public void m2(){
        System.out.println("m2-A");
    }
    public void m3(){
        System.out.println("m3-A");
    }
    public void m4(){
        System.out.println("m4-A");
    }
}
public class OOPSex3 {
    public static void main(String args[]) {
      //I a= new I();      ----error
      I i= new A();
      i.m1();
      i.m2();
      i.m3();
      //i.m4();             ----error
      System.out.println("----------------");
      A a= new A();
      a.m1();
      a.m2();
      a.m3();
      a.m4();
    }
}