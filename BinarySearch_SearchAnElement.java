
public class BinarySearch_SearchAnElement {
    public static void main(String[] args) {
        BinarySearch_SearchAnElement main = new BinarySearch_SearchAnElement();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(main.search(arr, 9));
    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

