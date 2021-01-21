/*
И ещё можете попрактиковаться и нарисовать оставшиеся 2 треугольника:

       *
     * * (1)
   * * *
 * * * *

 * * * *
   * * * (2)
     * *
       *

 */

package homeworks.Lesson3;

public class Task8 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1 - i) {
                    System.out.print("  ");
                } else System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else System.out.print("* ");
            }
            System.out.println();
        }
    }
}
