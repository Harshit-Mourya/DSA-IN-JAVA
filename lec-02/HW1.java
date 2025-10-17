/* Make a program that takes the radius of a circle as input, calculates its area and prints it as output to the user. */

import java.util.Scanner;

public class HW1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();
        double area = 3.14 * r * r;
        System.out.println("Area of circle: " + area);
        sc.close();
    }
}

/* Output
$ javac HW1.java 

$ java HW1
Enter radius of circle: 5
Area of circle: 78.5
 */