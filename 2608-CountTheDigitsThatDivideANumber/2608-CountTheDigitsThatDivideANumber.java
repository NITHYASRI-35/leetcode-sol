// Last updated: 2/4/2026, 9:06:00 PM
class Solution {
    public int countDigits(int num) {
        int copy=num;
        int counts=0;
        while(num!=0){
            int digit=num%10;
            if(copy%digit==0) counts++; 
            num/=10;
        }
        return counts;
    }
}