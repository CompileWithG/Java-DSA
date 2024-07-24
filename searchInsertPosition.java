class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int j = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if target is present at mid
            if (nums[mid] == target)
                return mid;

            // If target greater, ignore left half
            if (nums[mid] < target)
                low = mid + 1;

            // If target is smaller, ignore right half
            else
                high = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return low;

    }
    /*
     * Given a sorted array of distinct integers and a target value, return the
     * index if the target is found. If not, return the index where it would be if
     * it were inserted in order.
     * 
     * You must write an algorithm with O(log n) runtime complexity.
     * 
     * 
     */
}