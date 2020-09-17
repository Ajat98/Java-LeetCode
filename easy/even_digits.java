//Find amount of nums with even num of digits

class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        int curr = 1;
        
        for (int i=0; i < nums.length; i++) {
            int number = nums[i];
            
            while (number / 10 >= 1) {
                curr++;
                number = number / 10;
            }
            
            if (curr%2 == 0){
                count++;
            }
            curr = 1;
        }
        return count;
            
        
    }
}
