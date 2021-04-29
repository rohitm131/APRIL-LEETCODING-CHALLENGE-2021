class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result = new int[2];
        result[0] = findFirst(nums,target);
        result[1] = findLast(nums,target);
        return result;
        
    }
    
    public int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int res = -1;
        
        while(start <= end) {
            int mid = start + ((end - start) / 2);
            
            if(nums[mid] > target) {
                end = mid - 1;
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                res = mid;
                end = mid - 1;
            }
        }
        return res;
    }
    
    public int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int res = -1;
        
        while(start <= end) {
            int mid = start + ((end - start) / 2);
            
            if(nums[mid] > target) {
                end = mid - 1;
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                res = mid;
                start = mid + 1;
            }
        }
        return res;
    }
}
