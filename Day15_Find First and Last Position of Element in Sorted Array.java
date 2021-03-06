class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = {-1, -1};
        int s = 0, e = nums.length, m;
        
        while(s < e) {
            m = (s+e)/2;
            
            if(nums[m] == target) {
                getIndex(m, nums, res);
                break;
            } else if(nums[m] < target) {
                s = m+1;
            } else {
                e = m;
            }
        }
        
        return res;
    }
    
    private int[] getIndex(int m, int arr[], int res[]) {
        int l, r, target = arr[m];
        l = r = m;
        
        while(l >= 0) {
            if(arr[l] == target) {
                res[0] = l--;
            } else {
                break;
            }
        }
        while(r < arr.length) {
            if(arr[r] == target) {
                res[1] = r++;
            }else {
                break;
            }
        }
        return res;
    }
}
