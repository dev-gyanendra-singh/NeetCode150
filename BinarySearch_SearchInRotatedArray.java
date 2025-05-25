public class BinarySearch_SearchInRotatedArray {
    public static void main(String[] args) {
        BinarySearch_SearchInRotatedArray obj = new BinarySearch_SearchInRotatedArray();
        System.out.println(obj.search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 8));

    }

    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            }
           // yadi left half sorted hai to
            if (nums[l] <= nums[mid]) {
                // left half me ho skta hai
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else { // nahi hai to right half me hoga
                    l = mid + 1;
                }
            } else {
              // right sorted half me ho skta hai
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } else { // nahi hai to left half me hoga 
                    r = mid - 1;
                }

            }
        }
        return -1;
    }
}
