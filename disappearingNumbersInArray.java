class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int count =0;
        for(int x : nums){
            int i = Math.abs(x);
            if(nums[i-1] > 0)
                nums[i-1] *= -1;
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] >0)
                result.add(i+1);
        }
        return result;
    }
}