// Last updated: 2/4/2026, 9:07:12 PM
class Solution {
    public int singleNumber(int[] nums) {
      int ans=0;
      for(int i=0; i<nums.length;i++){
        ans ^=nums[i];
      }  
      return ans;
    }
}