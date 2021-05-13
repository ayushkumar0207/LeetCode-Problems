class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int arr[] = new int[101];
        for(int i=0; i<nums.length; i++)
            arr[nums[i]]++;
        for(int i=0; i<101; i++)
            count += ((arr[i]-1) * (arr[i]))/2;
        return count;
    }
}