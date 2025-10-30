// Print a number pyramid:
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5

public class HW3{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for (int j = 0; j < (n-i)*2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");                
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}