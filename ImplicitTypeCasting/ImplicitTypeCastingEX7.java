//incompatible types: possible lossy conversion from int to byte
public class ImplicitTypeCastingEX7 {
    public static void main(String args[]) {
      byte b1=60;
      byte b2=70;
      byte b=b1+b2;
    
      System.out.println(b);
    }
}