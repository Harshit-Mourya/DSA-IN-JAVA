import java.util.Scanner;

public class HW2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        //My Answer
        // do { 
        //     n = sc.nextInt();
        //     System.out.print("Enter the marks out of 100: ");
        //     int marks = sc.nextInt();
        //     if(marks>=90){
        //         System.out.println("This is Good");
        //     }  else if(marks <=89 && marks >=60){
        //         System.out.println("This is also Good");
        //     }  else if(marks <=59 && marks >=0){
        //         System.out.println("This is Good as well");
        //     }
        // } while (n != 0);

        //Online answer
        do {
            System.out.print("Do you want to enter marks? (1 for Yes, 0 for No): ");
            n = sc.nextInt();

            if (n == 1) {
                System.out.print("Enter the marks out of 100: ");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks entered.");
                }
            }
        } while (n != 0);

        sc.close();
    }
}