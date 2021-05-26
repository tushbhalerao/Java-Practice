/*Q. methods in java
No of argument: 1
Argument List: 
10 

Addition: 10
------------------
No of argument: 2
Argument List: 
20 
30 

Addition: 50
------------------
No of argument: 3
Argument List: 
10 
20 
30 

Addition: 60
------------------

*/
class A{
    void add(int ... a){   //int[] a={---list of arguments---}
        System.out.println("No of argument: "+a.length);
        int result =0;
        System.out.println("Argument List: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
            result=result+a[i];
        }
        System.out.println();
        System.out.println("Addition: "+result);
        System.out.println("------------------");
    }
}
public class OOPSex5 {
    public static void main(String args[]) {
        A a= new A();
        a.add(10);
        a.add(20,30);
        a.add(10,20,30);  
    }
}