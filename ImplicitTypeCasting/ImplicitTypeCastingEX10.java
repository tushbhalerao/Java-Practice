//incompatible types: possible lossy conversion from float to long
public class ImplicitTypeCastingEX10 {
    public static void main(String args[]) {
      float f=22.22f;
      long l=f;
    
      System.out.println(f+" "+l);
    }
}