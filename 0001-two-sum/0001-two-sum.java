class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i =0;
        int j=0;
        int indexArr[] = new int[2];
        for (i =0 ; i<nums.length-1; i++){
             for ( j =i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                     indexArr[0]=i;

                     indexArr[1]=j;

                }
             }
        }
        return indexArr;
        
    }
}