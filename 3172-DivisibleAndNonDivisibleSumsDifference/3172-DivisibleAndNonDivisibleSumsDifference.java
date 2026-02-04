// Last updated: 2/4/2026, 9:05:43 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0;
        for(int i=1; i<=n; i++) {
            if(i % m==0 ) {
                sum -= i;
            } else{
                sum+=i;
            }
        }
        return sum;
    }
}