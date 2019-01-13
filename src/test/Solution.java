package test;

/**
 * Created by home on 10/15/2018.
 */
public class Solution {
    public int solution(int A, int B) {


        String sB = String.valueOf(B);
        String sA = String.valueOf(A);
        int result = -1;
        if (A < B) {

            int index = sB.indexOf(sA);
            result = index;
            int resultIndexOf = 0;


                resultIndexOf = sB.indexOf(sA, index + 1);
                if (resultIndexOf != -1) {
                    result = Integer.parseInt(result + "" + resultIndexOf);
                    index++;
                }
        }

        return result;
    }

    public static void main(String... args) {

        Solution s = new Solution();
        String result = String.valueOf(s.solution(53, 15454351));

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != -1) {
                System.out.println("Position: " + result.charAt(i));
            } else {
                System.out.println("Don't contain");
            }
        }
    }
}
