// Last updated: 2/4/2026, 9:06:40 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
         int x=(n^(n>>1));
         return (x&(x+1))==0?true:false;
    }
}