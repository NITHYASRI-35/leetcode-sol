// Last updated: 2/4/2026, 9:06:34 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        int cmax=-1;
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i]>cmax) cmax=arr[i];
                int temp =max;
                arr[i]=max;
                max=cmax;
        }
    return arr;    
    }
}