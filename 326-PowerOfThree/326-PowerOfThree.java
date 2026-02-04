// Last updated: 2/4/2026, 9:06:54 PM
class Solution {
    public boolean isPowerOfThree(int n) {
    if(n==0) return false;
        while(n%3==0){
            n/=3;
        }
        if(n==1) return true;
        else return false;
    }
}
