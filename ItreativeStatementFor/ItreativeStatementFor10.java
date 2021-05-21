/*error: unreachable statement
        System.out.println("After loop");
*/
public class ItreativeStatementFor10 {
    public static void main(String args[]) {
        System.out.println("Before loop");
        for (int i=0;;i++){
            System.out.println("Inside loop");
        }
        System.out.println("After loop");
    }     
}