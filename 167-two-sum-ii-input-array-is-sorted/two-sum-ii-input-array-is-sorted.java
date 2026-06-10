class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int  r[]=new int[2];
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int s=numbers[left]+numbers[right];
            if(s>target)right--;
            if(s<target)left++;
            if(s==target)return new int[]{left+1,right+1};
        }
        return new int[]{};
        
    }
}