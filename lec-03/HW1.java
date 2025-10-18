import java.util.Scanner;

public class HW1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter an operation: + - * / %: ");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println("a + b = " + (a + b));
                break;
            case "-":
                System.out.println("a - b = " + (a - b));
                break;
            case "*":
                System.out.println("a * b = " + (a * b));
                break;
            case "/":
                System.out.println("a / b = " + (a / b));
                break;
            case "%":
                System.out.println("a % b = " + (a % b));
                break;
            default:
                System.out.println("Invalid operator selected!");
        }

        sc.close();
    }
}

/* Output
$ touch HW1.java

$ javac HW1.java 

$ java HW1
Enter two numbers: 6
3
Enter an operation: + - * / %: *
a * b = 18
 */