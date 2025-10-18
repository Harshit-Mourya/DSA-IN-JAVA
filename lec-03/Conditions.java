import java.util.Scanner;

public class Conditions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are adult.");   
        } else{
            System.out.println("you are not adult.");
        }

        sc.close();
    }
}

/* output
$ javac Conditions.java 

$ java Conditions
Enter your age: 21
You are adult.
 */