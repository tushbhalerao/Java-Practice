//error: variable j might not have been initialized
public class ConditionalStatementEX1 {
    public static void main(String args[]) {
      int i=10;
      int j;
      if(i==10){
          j=20;
      }
    
      System.out.println(j);
    }
}