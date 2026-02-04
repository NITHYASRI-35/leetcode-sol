// Last updated: 2/4/2026, 9:07:04 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        while(n%2==0){
            n/=2;
        }
        if(n==1) return true;
        else return false;
    }
}