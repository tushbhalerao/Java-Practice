/*0
1
2
3
4
6
7
8
9*/
public class TransferStatementContinueEX1 {
    public static void main(String args[]) {
      for(int i=0;i<10;i++){
          if(i==5){
              continue;
          }
          System.out.println(i);
      }
    }
}