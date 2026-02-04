// Last updated: 2/4/2026, 9:07:06 PM
class Solution {
    public int hammingWeight(int n) {     
		int Count = 0;
		while (n != 0) {
           if((n&1)==1) 
            Count++;
           n>>=1; 
        }
        return Count;
    }
}
