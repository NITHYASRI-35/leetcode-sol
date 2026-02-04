// Last updated: 2/4/2026, 9:06:51 PM
class Solution {
    public int firstUniqChar(String s) {
      for(int i=0;i< s.length();i++){
        boolean flag=true;
        for(int j=0; j< s.length();j++){
            if(i != j && s.charAt(i) ==s.charAt(j)){
                flag=false;
                break;
            }
        }
        if(flag ==true) return i;
     }
     return -1;
    }
}