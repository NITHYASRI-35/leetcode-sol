// Last updated: 2/4/2026, 9:06:46 PM
class Solution {
    public int hammingDistance(int x, int y) {
          int cnt=0;
        int c=x^y;
        while(c>0){
            c=c&c-1;
            cnt++;
        }
        return cnt;
    }
}