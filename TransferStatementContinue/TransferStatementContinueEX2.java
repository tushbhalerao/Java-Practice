/*error: unreachable statement*/
public class TransferStatementContinueEX2 {
    public static void main(String args[]) {
      for(int i=0;i<10;i++){
          System.out.println("Before loop");
          if(i==5){
              System.out.println("Inside loop, Before loop");
              continue;
              System.out.println("Inside loop, After loop");
          }
          System.out.println("After loop");
      }
    }
}