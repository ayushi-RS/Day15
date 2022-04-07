class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && mid < end && nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
            else if (mid < end && nums[mid + 1] > nums[mid]) start = mid + 1;
            else if (mid < end && nums[mid] > nums[mid + 1]) end = mid;
            else if (mid > 0 && nums[mid] > nums[mid - 1]) start = mid;
            else if (mid > 0 && nums[mid - 1] > nums[mid]) end = mid - 1;
        }
        return start;
    }
}
