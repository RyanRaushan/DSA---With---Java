package BinarySearch.Code;

public class Mountain {
    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    // https://leetcode.com/problems/find-peak-element/

    public int peakIndexInMountainArray2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        return start; // or return end as both are =
    }
}
