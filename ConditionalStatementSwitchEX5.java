//ten
public class ConditionalStatementSwitchEX5 {
    public static void main(String args[]) {
      String c="BBB";
      
      switch(c){
          case "AAA":
              System.out.println("five");
            break;
          case "BBB":
              System.out.println("ten");
            break;
          case "CCC":
              System.out.println("fifteen");
            break;
          case "DDD":
              System.out.println("twenty");
            break;
          default:
              System.out.println("Default");
            break;
      }
    }
}