/*/OOPConstructors1.java:4: error: '{' expected
    class B(){
           ^
/OOPConstructors1.java:5: error: <identifier> expected
        System.out.println("A-con");
                          ^
/OOPConstructors1.java:5: error: illegal start of type
        System.out.println("A-con");
                           ^
3 errors

*/
class A{
    class B(){
        System.out.println("A-con");
    }
}
public class OOPConstructors1 {
    public static void main(String args[]) {
      A a= new A();
    }
}