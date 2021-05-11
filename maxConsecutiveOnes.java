 public int findMaxConsecutiveOnes(int[] nums) {
        int max_ones = 0, temp = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                temp++;
            }else{
                max_ones = Math.max(max_ones, temp);
                temp = 0;
            }
        }
        if(temp > max_ones)
            max_ones = temp;
        return max_ones;
    }