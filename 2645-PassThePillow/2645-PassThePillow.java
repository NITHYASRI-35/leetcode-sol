// Last updated: 2/4/2026, 9:05:56 PM
class Solution {
    public int passThePillow(int n, int time) {
          return n-Math.abs(n-1-time%(n*2-2));
    }
}