/*0
1
2
3
4
*/
public class TransferStatementBreakEX1 {
    public static void main(String args[]) {
      for(int i=0;i<10;i++){
          if(i==5){
              break;
          }
          System.out.println(i);
      }
    }
}