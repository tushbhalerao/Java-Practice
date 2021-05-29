/*Q String, Exception, Thread, Integer, Arraylist printed 
abc
java.lang.Exception: My own exception
Thread[Thread-0,5,main]
10
[AAA, BBB, CCC]
*/
public class OOPSex9 {
    public static void main(String args[]) {
      //Declaring and printing String value
      String str= new String("abc");
      System.out.println(str);
      //Declaring and printing Exception
      Exception e= new Exception("My own exception");
      System.out.println(e);
      //Declaring and printing thread
      Thread t= new Thread();
      System.out.println(t);
      //Declaring and printing Integer value
      Integer in= new Integer(10);
      System.out.println(in);
      //Declaring and printing ArrayList
      java.util.ArrayList al= new java.util.ArrayList();
      al.add("AAA");
      al.add("BBB");
      al.add("CCC");
      System.out.println(al);
    }
}