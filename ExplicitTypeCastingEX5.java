//incompatible types: possible lossy conversion from byte to char
public class ExplicitTypeCastingEX5 {
    public static void main(String args[]) {
      short s=65;
      char c=(byte)s;
    
      System.out.println(s+" "+c);
    }
}