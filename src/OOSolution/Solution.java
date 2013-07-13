package OOSolution;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: stephenwang
 * Date: 13-7-13
 * Time: 上午8:45
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public Integer[] chess = new Integer[8];

    public Solution(int i, int j, int k ,int l, int m, int n, int o, int p) {
        chess[0] = i;
        chess[1] = j;
        chess[2] = k;
        chess[3] = l;
        chess[4] = m;
        chess[5] = n;
        chess[6] = o;
        chess[7] = p;
    }

    public boolean validate() {
        return !hasSameNumber() && !hasSameDiff();
    }

    private boolean hasSameDiff() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (Math.abs(chess[i] - chess[j]) == Math.abs(i - j) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasSameNumber() {
        return Arrays.stream(chess).uniqueElements().toArray().length != 8;
    }

    public String toString() {
        String text = "";
        for (Integer c : chess) {
            text += c + ",";
        }
        text += "\n";
        return  text;
    }
}
