//incompatible types: possible lossy conversion from char to short
public class ImplicitTypeCastingEX4 {
    public static void main(String args[]) {
      char c='A';
      short s=c;
    
      System.out.println(c+" " +s);
    }
}