
class Solution {
    public int singleNumber(int[] nums) {
        for(int i=1;i<nums.length;i++)
            nums[0]=nums[0]^nums[i];
        return nums[0];
    }
}
/*
   通过异或运算可将相同的两个数抵消
*/