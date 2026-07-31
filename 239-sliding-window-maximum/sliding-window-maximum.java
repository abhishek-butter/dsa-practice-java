class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int maxarray[]=new int[nums.length-k+1];
        int c=0;
        int left=0;
        
        Deque<Pair<Integer,Integer>> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            while(!dq.isEmpty() && nums[i]>dq.peekLast().getKey())dq.pollLast();
            dq.offerLast(new Pair<>(nums[i],i));

            if(i-left+1==k){
                while(!dq.isEmpty() && dq.peekFirst().getValue()<left)dq.pollFirst();
                maxarray[c++]=dq.peek().getKey();
                
                left++;

            }
        }
        return maxarray;
        
    }
}