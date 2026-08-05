class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int r[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!s.isEmpty() && temperatures[s.peek()]<temperatures[i]){
                int t=s.pop();
                r[t]=i-t;

            }
            s.push(i);
        }
        return r;
        
    }
}