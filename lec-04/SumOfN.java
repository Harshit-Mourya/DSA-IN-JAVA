import java.util.Scanner;

public class SumOfN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // while(i<=n){
        //     sum+=i;
        //     i++;
        // }
        for(int i = 0;i<=n;i++){
                sum+=i;
        }
        System.out.println("Sum is " + sum);
        sc.close();
    }
}