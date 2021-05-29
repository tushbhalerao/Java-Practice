/*Q Difference between String and StringBuffer
ABC 
ABC Software 
ABC Software solution

ABC Software solution
ABC Software solution
ABC Software solution
*/
public class OOPSex10 {
    public static void main(String args[]) {
        String str1= new String("ABC ");
        String str2= str1.concat("Software ");
        String str3= str2.concat("solution");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println();
        StringBuffer sb1= new StringBuffer("ABC ");
        StringBuffer sb2= sb1.append("Software ");
        StringBuffer sb3= sb2.append("solution");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
    }
}