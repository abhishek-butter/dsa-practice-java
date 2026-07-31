class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int maxarray[]=new int[nums.length-k+1];
        int c=0;
        int left=0;
        
        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>((a,b)->Integer.compare(b.getKey(),a.getKey()));
        for(int i=0;i<nums.length;i++){
            pq.offer(new Pair<>(nums[i],i));

            if(i-left+1==k){
                while(!pq.isEmpty() && pq.peek().getValue()<left)pq.poll();
                maxarray[c++]=pq.peek().getKey();
                
                left++;

            }
        }
        return maxarray;
        
    }
}