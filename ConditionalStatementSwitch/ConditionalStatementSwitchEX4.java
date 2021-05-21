//ten
public class ConditionalStatementSwitchEX4 {
    public static void main(String args[]) {
      char c='B';
      
      switch(c){
          case 'A':
              System.out.println("five");
            break;
          case 'B':
              System.out.println("ten");
            break;
          case 'C':
              System.out.println("fifteen");
            break;
          case 'D':
              System.out.println("twenty");
            break;
          default:
              System.out.println("Default");
            break;
      }
    }
}