/*error: incompatible types: possible lossy conversion from int to byte*/
public class ConditionalStatementSwitchEX12 {
    public static void main(String args[]) {
        byte b=126;
        switch(b){
            case 125:
                System.out.println("125");
            break;
            case 126:
                System.out.println("126");
            break;
            case 127:
                System.out.println("127");
            break;
            case 128:
                System.out.println("128");
            break;
            default:
                System.out.println("Default");
            break;
        }
    }     
}