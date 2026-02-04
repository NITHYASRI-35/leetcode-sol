// Last updated: 2/4/2026, 9:06:57 PM
class Solution {
    public int missingNumber(int[] nums) {
         int n = nums.length;
       int totalSum = n*(n+1)/2;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+nums[i]; 
        }
        return totalSum - sum;
    }
}