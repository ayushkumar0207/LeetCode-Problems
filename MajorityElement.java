class Solution {
    public int majorityElement(int[] nums) {
        int maj_idx = 0, count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[maj_idx] == nums[i])
                count ++;
            else
                count --;
            if(count == 0){
                maj_idx = i;
                count = 1;
            }
        }
        return nums[maj_idx];
    }
}