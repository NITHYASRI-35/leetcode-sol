// Last updated: 2/4/2026, 9:05:34 PM
class Solution {
    public String largestEven(String s) {
        int lastTwoindex=-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) =='2'){
                lastTwoindex=i;
                break;
            }
        }
        if(lastTwoindex==-1){
            return"";
        }
         return s.substring(0,lastTwoindex+1);
    }
}