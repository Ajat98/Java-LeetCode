class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //nums1 will always have enough space to hold elements from nums1 + nums2
        m--; n--; //decrement both since starting at 0
        int index = nums1.length -1;
        
        while(index >= 0){
            if(m < 0){ //
                nums1[index] = nums2[n--];
            }else if (n < 0){
                nums1[index] = nums1[m--];
                
            }else{
                if (nums1[m] > nums2[n]){
                    nums1[index] = nums1[m--];
                }else{
                    nums1[index] = nums2[n--];
                }
            }
            
            
            index--;
        }
        
    }
}

/*
3 pointers:
    reference to end of first arr
    reference to end of 2nd array,
    where we are currently
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

*/
