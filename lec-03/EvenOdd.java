import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println(n + " is even.");
        } else{
            System.out.println(n + " is odd.");
        }

        sc.close();
    }
}

/* output
$ touch EvenOdd.java

$ javac EvenOdd.java 

$ java EvenOdd
Enter a number: 3
3 is odd.
 */