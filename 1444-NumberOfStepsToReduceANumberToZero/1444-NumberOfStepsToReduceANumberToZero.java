// Last updated: 2/4/2026, 9:06:27 PM
class Solution {
    public int numberOfSteps(int num) {
       int Steps=0;
       while(num!=0){
       if(num%2==0) num=num/2;
       else num=num-1;
       Steps++;
       }
    return Steps;
    }
}