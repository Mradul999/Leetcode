Given an integer array nums and two integers left and right, return the number of contiguous non-empty subarrays such that the value of the maximum array element in that subarray is in the range [left, right].
The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:

Input: nums = [2,1,4,3], left = 2, right = 3
Output: 3
Explanation: There are three subarrays that meet the requirements: [2], [2, 1], [3].
  
Example 2:

Input: nums = [2,9,2,5,6], left = 2, right = 8
Output: 7



  class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int count=0;
        int i=0;
        int j=0;
        int previous=0;

        while(j<nums.length){

            if(nums[j]>=left && nums[j]<=right){
                previous=j-i+1;
                count+=previous;


            }else if(nums[j]<left){
                count+=previous;


            }else{
                i=j+1;
                previous=0;
            }
            j++;
        }
        return count;

        
    }
}
