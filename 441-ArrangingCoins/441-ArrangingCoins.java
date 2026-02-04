// Last updated: 2/4/2026, 9:06:47 PM
class Solution {
    public int arrangeCoins(int n) {
        int row= 0;
        for ( int i=0;i<=n;i++) {
            row= i;
            n=n-row; 
        }
        return row;
    }    
}