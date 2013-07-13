import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: stephenwang
 * Date: 13-7-12
 * Time: 下午7:18
 * To change this template use File | Settings | File Templates.
 */
public class EightQueens {

    private int [] chess = new int[] {0,1,2,3,4,5,6,7};

    List<Integer[]> solutions = new ArrayList<Integer[]>();

    public void allPossibleSolutions() {
        Integer[] possible = new Integer[8];

        for (int i=0;i<8;i++) {
            for (int j=0;j<8;j++) {
                for (int k=0;k<8;k++) {
                    for (int l=0;l<8;l++) {
                        for (int m=0;m<8;m++) {
                            for (int n=0;n<8;n++) {
                                for (int o=0;o<8;o++) {
                                    for (int p=0;p<8;p++) {
                                        if(!hasSame(i,j,k,l,m,n,o,p) && !hasSameDiff(i,j,k,l,m,n,o,p)) {
                                            possible = new Integer[] {i,j,k,l,m,n,o,p};
                                            solutions.add(possible);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean hasSameDiff(int i, int j, int k, int l, int m, int n, int o, int p)  {
        return Math.abs(i-j) == 1 || Math.abs(i-k) == 2 || Math.abs(i-l) == 3
                || Math.abs(i-m) ==4 || Math.abs(i-n) ==5 || Math.abs(i-o) ==6
                || Math.abs(i-p) ==7 || Math.abs(j-k) ==1 || Math.abs(j-l) ==2
                || Math.abs(j-m) ==3 || Math.abs(j-n) ==4 || Math.abs(j-o) ==5
                || Math.abs(j-p) ==6 || Math.abs(k - l) == 1 ||Math.abs(k-m) ==2
                || Math.abs(k-n) ==3 || Math.abs(k-o) ==4 || Math.abs(k-p) ==5
                || Math.abs(l -m) ==1 || Math.abs(l-n) ==2 || Math.abs(l-o) ==3
                || Math.abs(l-p) ==4 || Math.abs(m-n) ==1 || Math.abs(m-o) ==2
                || Math.abs(m-p) ==3 || Math.abs(n-o)==1 || Math.abs(n-p) ==2
                || Math.abs(o-p) ==1;
    }

    private boolean hasSame(int i, int j, int k, int l, int m, int n, int o, int p) {
        return (i==j) || (i==k) ||(i==l) || (i==n) || (i==m)||(i==o) || (i==p)
                || (j==k) || (j==l)|| (j==m) || (j==n) ||(j==o) || (j==p)
                || (k ==l) || (k==m) ||(k==n) || (k==o) || (k==p)
                || (l ==m) || (l==n) || (l==o) || (l==p)
                || (m ==n) ||(m==o) ||(m==p)
                || (n ==o)  || (n==p)
                ||(o==p);
    }


    public static void main(String[] args) {
        EightQueens eq = new EightQueens();
        eq.allPossibleSolutions();
        for (Integer[] solution : eq.solutions){
            for (Integer s: solution) {
                System.out.print(s + ",");
            }
            System.out.println();
        }
        System.out.println("possible solutions count is "+ eq.solutions.size());
    }
}
