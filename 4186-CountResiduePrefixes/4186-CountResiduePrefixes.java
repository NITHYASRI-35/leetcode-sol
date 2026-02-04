// Last updated: 2/4/2026, 9:05:35 PM
class Solution {
    public int residuePrefixes(String s) {
        boolean[] seen=new boolean[26];
        int distinct =0 ,count=0;
        for(int i=0;i<s.length();i++){
            int idx =s.charAt(i) -'a';
            if(!seen[idx]){
                seen[idx]=true;
                distinct++;
            }
            if(distinct ==(i+1)% 3){
                count ++;
            }
        }
        return count;
    }
}