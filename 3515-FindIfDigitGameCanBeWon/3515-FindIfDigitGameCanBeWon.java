// Last updated: 2/4/2026, 9:05:38 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd=0;
        int dd=0;
        for(int x:nums){
            if(x<10) sd+=x;
            else dd+=x;
        }
        return sd!=dd;
    }
}