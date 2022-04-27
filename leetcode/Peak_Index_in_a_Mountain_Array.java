class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right  = arr.length - 1;
        
        while (left + 1 < right) {
            int middle = (left + right) / 2;
            
            if (arr[middle] > arr[middle - 1]) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return left;
    }
}