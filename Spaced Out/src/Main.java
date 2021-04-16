import java.io.*;
import java.util.*;

/*
    This problem is about find the biggest sum such that in each 2x2 box,
there are only two numbers and the sum of all the numbers is the greatest.

Challenges:
    1. Understand the problem
         It is quite tricky to figure out how the grid works, but once you figure it out, it is a pretty simple problem.
    2. Familiar with math related functions and type of the variables based on the size
    3. Brute Force
 */

public class Main {

    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(in.readLine());
        Scanner scan = new Scanner(new File("1.in"));
        int n = scan.nextInt();
        long[][] grid = new long[n][n];
        for (int y = 0; y < n; y++) {
//            StringTokenizer tokenizer = new StringTokenizer(in.readLine());
            for (int x = 0; x < n; x++) {
//                grid[y][x] = Long.parseLong(tokenizer.nextToken());
                grid[y][x] = scan.nextInt();
            }
        }
        long horizontalAnswer = 0;
        for (int y = 0; y < n; y++) {
            long[] sums = new long[2];
            for (int x = 0; x < n; x++) {
                sums[x % 2] += grid[y][x];
            }
            horizontalAnswer += Math.max(sums[0], sums[1]);
        }
        long verticalAnswer = 0;
        for (int x = 0; x < n; x++) {
            long[] sums = new long[2];
            for (int y = 0; y < n; y++) {
                sums[y % 2] += grid[y][x];
            }
            verticalAnswer += Math.max(sums[0], sums[1]);
        }
        System.out.println(Math.max(horizontalAnswer, verticalAnswer));
    }
}