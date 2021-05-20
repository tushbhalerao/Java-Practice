//incompatible types: possible lossy conversion from int to byte
public class ImplicitTypeCastingEX2 {
    public static void main(String args[]) {
      int i=10;
      byte b=i;
    
      System.out.println(i+" " +b);
    }
}