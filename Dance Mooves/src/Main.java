import java.io.*;
import java.util.*;

/*
    This problem is to keep track of all possible positions that each cow can reach after cycles of swaps and print out
the number of positions that each cow has been to.

Challenges:
    1. Understand the problem
         The cows go into cycles and cycles of swaps, and you need to have a sense of after how long the cows will go
    back to its original position.
         Or you can keep track of each cow individually, which requires a fewer data structures.
    2. Data Structures
         If you are keeping track of all cows at one time, then you will need data structures like ArrayLists and
    HashSet.
         If you choose to keep track of the cows, you will need only arrays (and HashSet, which can make the process a
    lot easier).

 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        int[] cows = new int[n + 1];
        List<Integer>[] viewed = new List[n + 1];
        for (int j = 1; j <= n; j++) {
            cows[j] = j;
            viewed[j] = new ArrayList<>();
            viewed[j].add(j);
        }
        for (long t = 1; t <= k; t++) {
            tokenizer = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            int c = cows[a];
            int d = cows[b];
            cows[a] = d;
            cows[b] = c;
            viewed[cows[a]].add(a);
            viewed[cows[b]].add(b);
        }
        int[] answer = new int[n + 1];
        for (int r = 1; r <= n; r++) {
            if (cows[r] != 0) {
                List<Integer> cycle = new ArrayList<>();
                int j = r;
                while (cows[j] != 0) {
                    cycle.add(j);
                    j = cows[j];
                    cows[cycle.get(cycle.size() - 1)] = 0;
                }
                Set<Integer> viewedHere = new HashSet<>();
                for (int cow : cycle) {
                    viewedHere.addAll(viewed[cow]);
                }
                for (int cow : cycle) {
                    answer[cow] = viewedHere.size();
                }
            }
        }
        StringBuilder out = new StringBuilder();
        for (int j = 1; j <= n; j++) {
            out.append(answer[j]).append('\n');
        }
        System.out.print(out);
    }
}