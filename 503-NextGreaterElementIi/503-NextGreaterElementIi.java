// Last updated: 2/4/2026, 9:06:43 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);// Fill with -1
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n * 2; i++) {
            int curr = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < curr) {
                result[stack.pop()] = curr;
            }
            
            // Push index only in first pass
            if (i < n) {
                stack.push(i);
            }
        }
        
        return result;
    }
}