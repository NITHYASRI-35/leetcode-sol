// Last updated: 2/4/2026, 9:07:09 PM
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n!=0){
        int res=n/5;
        count+=res;
        n/=5;
        }
        return count;
    }
}