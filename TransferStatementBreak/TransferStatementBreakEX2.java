/*error: unreachable statement
                System.out.println("Inside loop, After break");
*/
public class TransferStatementBreakEX2 {
    public static void main(String args[]) {
        System.out.println("Before loop");
        for(int i=0;i<10;i++){
            if(i==5){
                System.out.println("Inside loop, Before Break");
                break;
                System.out.println("Inside loop, After break");
            }
        }
        System.out.println("After loop");
    }
}