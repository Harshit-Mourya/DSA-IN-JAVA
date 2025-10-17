/* Make a program that prints the table of a number that is input by the user. 
(HINT - You will have to write 10 lines for this but as we proceed in the course you will be studying about ‘LOOPS’ that will simplify your work A LOT!) */

import java.util.Scanner;

public class HW2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Table of " + n + ": ");
        System.out.println(n * 1);
        System.out.println(n * 2);
        System.out.println(n * 3);
        System.out.println(n * 4);
        System.out.println(n * 5);
        System.out.println(n * 6);
        System.out.println(n * 7);
        System.out.println(n * 8);
        System.out.println(n * 9);
        System.out.println(n * 10);
        sc.close();
    }
}

/* Output
$ javac HW2.java 

$ java HW2
Enter a number: 3
Table of 3: 
3
6
9
12
15
18
21
24
27
30
 */