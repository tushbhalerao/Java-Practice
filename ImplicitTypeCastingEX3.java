//incompatible types: possible lossy conversion from byte to char
public class ImplicitTypeCastingEX3 {
    public static void main(String args[]) {
      byte b=65;
      char c=b;
    
      System.out.println(b+" " +c);
    }
}