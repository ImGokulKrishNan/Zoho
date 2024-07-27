package DSA.ARRAY;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Flood_fill {
    public static void main(String[] args) {

        int[][] screen = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };
        int x = 4, y = 4;
        int t = 3;
             color(screen, x, y, t);
        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[0].length; j++) {
                System.out.print(screen[i][j] + " ");
            }
            System.out.println("");
        }
    }
    static void color(int[][] screen, int x, int y, int t) {
        int k = screen[x][y];
        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[0].length; j++) {
                if (screen[i][j] == k) {
                    screen[i][j] = t;
                }
            }
        }
    }
}
