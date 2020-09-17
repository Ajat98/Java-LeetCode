//Return the squares of an array, sorted in increasing order

import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] A) {
        int[] temp = A;
        
        for (int i=0; i < A.length; i++) {
            temp[i] = A[i] * A[i];
        }
        Arrays.sort(temp);
        return temp;
    }
}
