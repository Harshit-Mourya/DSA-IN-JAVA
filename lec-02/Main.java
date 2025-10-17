import java.util.*;

public class Main{
    public static void main(String[] args){
        //output
        System.out.print("Hello Harshit!");
        System.out.println("Hello Harshit!");
        System.out.print("Hello Harshit!\n");
        System.out.print("Hello Harshit!");

        //input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
        sc.close();
    }
}

/*Output
$ javac Main.java 

$ java Main
Hello Harshit!Hello Harshit!
Hello Harshit!
Hello Harshit!Jay    
Jay 
 */