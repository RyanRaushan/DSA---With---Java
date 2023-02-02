package LinearSearch.code;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 18, 12, 7, 3, 14, 28 };
        System.out.println(min(arr));
    }

    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array can't be null");
            return -1;
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

}
