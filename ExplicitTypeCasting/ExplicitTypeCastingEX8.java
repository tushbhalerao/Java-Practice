//22
public class ExplicitTypeCastingEX8 {
    public static void main(String args[]) {
      double d=22.22;
      byte b=(byte)(short)(int)(long)(float)d;
    
      System.out.println(b);
    }
}