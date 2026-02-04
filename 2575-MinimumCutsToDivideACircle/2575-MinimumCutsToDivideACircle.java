// Last updated: 2/4/2026, 9:06:03 PM
class Solution {
    public int numberOfCuts(int num) {
        if(num==1) return 0;
        if(num%2==0) return num/2;
        else return num;
        
    }
}