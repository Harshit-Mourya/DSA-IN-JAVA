import java.util.Scanner;

public class Comparison{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if(a > b){
            System.out.println(a + " is greater than " + b);
        } else if(a < b){
            System.out.println(b + " is greater than " + a);
        } else{
            System.out.println(a + "is equal to " + b);
        }

        sc.close();
    }
}

/* Output
$ touch Comparison.java

$ javac Comparison.java 

$ java Comparison
Enter first number: 3
Enter second number: 6
6 is greater than 3
 */