// Last updated: 2/4/2026, 9:05:45 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int icount=0;
        for(int i=0; i < hours.length; i++){
            if(hours[i] >= target)
            {icount++;}}
            return icount;
    }
}
