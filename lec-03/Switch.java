import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Hello!");
                break;
            case 2:
                System.out.println("Namaste!");
                break;
            case 3:
                System.out.println("Bonjour!");
                break;
            default:
            System.out.println("Invalid number!");
        }

        sc.close();
    }
}

/* Output
$ touch Switch.java

$ javac Switch.java 

$ java Switch
Enter a number: 2
Namaste!

$ java Switch
Enter a number: 1
Hello!

$ java Switch
Enter a number: 4
Invalid number!
 */