// Print the pattern:
// *****
// *   *
// *   *
// *****

public class Pattern2{
    public static void main(String[] args) {
        int n=4,m=5;
        for(int i = 1; i <= n ; i++){
            for (int j = 1; j <= m; j++) {

            //My Solution
            //     if(i==1 || i==n){
            //         System.out.print("*");
            //     } else if(j==1 || j==m){
            //         System.out.print("*");
            //     } else{
            //         System.out.print(" ");
            //     }

            //Solution
            if(i==1 || j == 1 || i == n || j == m){
                System.out.print("*");
            }else{
                System.out.print(" ");  
            }
            
            }
            System.out.println();
        }
    }
}