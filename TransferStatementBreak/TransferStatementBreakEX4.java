/*Before loop
0 0
0 1
0 2
0 3
0 4
After loop
*/
public class TransferStatementBreakEX4 {
    public static void main(String args[]) {
        System.out.println("Before loop");
        Lable:for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(j==5){
                    break Lable;
                }
                System.out.println(i+" "+j);
            }
        }
        System.out.println("After loop");
    }
}