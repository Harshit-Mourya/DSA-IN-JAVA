// Print the pattern: (Inverted Half Pyramid)
// 1 1 1 1
// 2 2 2 
// 3 3 
// 4 

public class HW4 {
    public static void main(String[] args) {
        int n = 4, k = 1;
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(k);
            }
            k++;
            System.out.println();
        }
    }
}