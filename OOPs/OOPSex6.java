/*Q. Printing Object Hashcode and Object Reference
Object HashCode: 1785210046
Object Reference: A@6a6824be
*/
class A{
    
}
public class OOPSex6 {
    public static void main(String args[]) {
      A a= new A();
      int hashCode= a.hashCode();
      System.out.println("Object HashCode: "+hashCode);
      String ref= a.toString();
      System.out.println("Object Reference: "+ref);
    }
}