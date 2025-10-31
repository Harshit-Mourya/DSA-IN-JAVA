// Print the pattern: (Diamond pattern)
//       *
//     * * *
//   * * * * *
// * * * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *


public class Pattern11{
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for(int j = 2*(n-i); j>0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j < (2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for(int j = 2*(n-i); j>0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j < (2*i-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}