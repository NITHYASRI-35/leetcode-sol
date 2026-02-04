// Last updated: 2/4/2026, 9:07:03 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()) {
            return false;
        }
        int[] freq =new int[26];
        for(int i=0;i<s.length();i++) {
            freq[s.charAt(i) -'a']++ ;
            freq[t.charAt(i) -'a']-- ;
        }
        for(int i=0;i< freq.length;i++) {
            if(freq[i] !=0){
                return false;
            }
        }
         return true;
    }
}