// Last updated: 2/4/2026, 9:05:41 PM
class Solution {
    public int minimumOperations(int[] nums) {
          int res=0;
          for(int num :nums){
            if(num %3 !=0) res++;
          }
          return res;
    }
}