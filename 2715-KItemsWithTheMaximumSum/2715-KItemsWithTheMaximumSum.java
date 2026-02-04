// Last updated: 2/4/2026, 9:05:53 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes){
          return k;
        }
        if(k<=numOnes+numZeros){
            return numOnes;
        } 
        else{
            int Rnp=k-(numOnes+numZeros);
            return numOnes-Rnp;
        }
    }
}   