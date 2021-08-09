import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>(n);
        for (int i = 0; i < n; i++) {
            lists.add(new ArrayList<Integer>());
        }
        int q = sc.nextInt();
        int lastanswer = 0;
        for (int i = 0; i < q; i++) {
            if (sc.nextInt() == 1) {
                lists.get((sc.nextInt() ^ lastanswer) % n).add(sc.nextInt());
            }
            else {
                ArrayList<Integer> list = lists.get((sc.nextInt() ^ lastanswer) % n);
                lastanswer = list.get(sc.nextInt() % list.size());
                System.out.println(lastanswer);
            }
        }
    }
}