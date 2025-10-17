import java.util.*;

public class Sum{
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum: " + sum);
        sc.close();
    }
}

/* Output
$ javac Sum.java 

$ java Sum
3
6
Sum: 9
 */