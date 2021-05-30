/*
error: modifier static not allowed here
    static A(){
           ^
*/
class A{
    static A(){
        System.out.println("A-con");
    }
}
public class OOPConstructors3 {
    public static void main(String args[]) {
      A a= new A();
      
    }
}