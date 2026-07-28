class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> s=new ArrayDeque<>();
        int r[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!s.isEmpty()&& temperatures[s.peek()]<temperatures[i]){
                int ii=s.pop();
                r[ii]=i-ii;
            }
            s.push(i);
        }
        
        return r;
        
    }
}