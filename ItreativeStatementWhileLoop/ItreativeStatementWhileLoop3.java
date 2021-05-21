/*error: illegal start of expression
        while(){
*/
public class ItreativeStatementWhileLoop3 {
    public static void main(String args[]) {
        System.out.println("Before loop");
        while(){
            System.out.println("Inside loop");
        }
        System.out.println("After Loop");
    }     
}