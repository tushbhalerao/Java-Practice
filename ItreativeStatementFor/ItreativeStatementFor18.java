/*1
2
3
4
5

1
2
3
4
5
*/
public class ItreativeStatementFor18 {
    public static void main(String args[]) {
        int[] a={1,2,3,4,5};
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);            
        }
        System.out.println();
        for(int x:a){
            System.out.println(x);
        }
    }     
}