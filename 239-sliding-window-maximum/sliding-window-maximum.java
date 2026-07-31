class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int maxarray[]=new int[nums.length-k+1];
        int c=0;
        int left=0;
        
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()])dq.pollLast();
            dq.offerLast(i);

            if(i-left+1==k){
                while(!dq.isEmpty() && dq.peekFirst()<left)dq.pollFirst();
                maxarray[c++]=nums[dq.peekFirst()];
                
                left++;

            }
        }
        return maxarray;
        
    }
}