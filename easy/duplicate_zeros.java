//https://leetcode.com/problems/duplicate-zeros/

class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        for (int i : arr) {
            if (i == 0) {
                zeros ++;   //increase additional length based on num of zeros
            }
        }
        int len = arr.length;
        for (int i = len -1; i >= 0; i--) {  //start at end of array
            int t = i + zeros;
            if (t < len) {
                arr[t] = arr[i];
            }
            if (arr[i] == 0) {
                zeros --; //reduce count of zeroes to add
                t = i + zeros;
                if (t < len) {
                    arr[t] = arr[i];
                }
                
            }
        }        
        
    }
}
