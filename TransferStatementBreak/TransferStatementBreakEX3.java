/*Before loop
0 0
0 1
0 2
0 3
0 4
1 0
1 1
1 2
1 3
1 4
2 0
2 1
2 2
2 3
2 4
3 0
3 1
3 2
3 3
3 4
4 0
4 1
4 2
4 3
4 4
5 0
5 1
5 2
5 3
5 4
6 0
6 1
6 2
6 3
6 4
7 0
7 1
7 2
7 3
7 4
8 0
8 1
8 2
8 3
8 4
9 0
9 1
9 2
9 3
9 4
After loop

*/
public class TransferStatementBreakEX3 {
    public static void main(String args[]) {
        System.out.println("Before loop");
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(j==5){
                    break;
                }
                System.out.println(i+" "+j);
            }
        }
        System.out.println("After loop");
    }
}