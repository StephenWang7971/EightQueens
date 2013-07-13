package OOSolution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: stephenwang
 * Date: 13-7-13
 * Time: 上午8:48
 * To change this template use File | Settings | File Templates.
 */
public class Solutions {
    List<Solution> possibleSolutions = new ArrayList<Solution>();

    public void all() {
        for (int i=0;i<8;i++) {
            for (int j=0;j<8;j++) {
                for (int k=0;k<8;k++) {
                    for (int l=0;l<8;l++) {
                        for (int m=0;m<8;m++) {
                            for (int n=0;n<8;n++) {
                                for (int o=0;o<8;o++) {
                                    for (int p=0;p<8;p++) {
                                        Solution possible = new Solution(i,j,k,l,m,n,o,p);
                                        if(possible.validate()) {
                                            possibleSolutions.add(possible);
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
    public String toString() {
        String text = "";
        for (Solution solution : possibleSolutions) {
            text += solution.toString();
        }
        text += "possible solutions count is " + possibleSolutions.size();
        return text;
    }

    public static void main(String[] args) {
        Solutions solutions = new Solutions();
        solutions.all();
        System.out.println(solutions.toString());
    }
}
