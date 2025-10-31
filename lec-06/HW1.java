// Print the pattern: (Hollow Butterfly pattern)
// *             *
// * *         * *
// *   *     *   *
// *     * *     *
// *     * *     *
// *   *     *   *
// * *         * *
// *             *

public class HW1 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}