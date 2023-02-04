package BinarySearch.Code;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 45, 67 };
        int[] ans = binarySearch(arr, 6);
        System.out.println(Arrays.toString(ans));

        ans = bruteForce(arr, 6);
    }

    private static int[] binarySearch(int[] nums, int target) {
        int[] ans = { -1, -1 };

        ans[0] = searchIndex(nums, target, true);
        ans[1] = searchIndex(nums, target, false);

        return ans;
    }

    private static int searchIndex(int[] nums, int target, boolean findStartIndex) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            }

            else if (target < nums[mid]) {
                end = mid - 1;
            }

            else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                }

                else {
                    start = mid + 1;
                }

            }
        }
        return ans;
    }

    // Brute force Solution....
    private static int[] bruteForce(int[] nums, int target) {
        int[] ans = new int[2];

        ans[0] = firstOccurence(nums, target);
        ans[1] = lastOccurence(nums, target);

        return ans;
    }

    private static int firstOccurence(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int lastOccurence(int[] nums, int target) {

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
