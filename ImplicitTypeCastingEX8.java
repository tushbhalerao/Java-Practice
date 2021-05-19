//incompatible types: possible lossy conversion from int to byte
public class ImplicitTypeCastingEX8 {
    public static void main(String args[]) {
      byte b1=30;
      byte b2=30;
      byte b=b1+b2;
    
      System.out.println(b);
    }
}