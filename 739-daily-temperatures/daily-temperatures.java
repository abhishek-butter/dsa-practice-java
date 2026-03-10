class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        

        int l=temperatures.length;
        int a[]=new int[l];
        for(int i=0;i<l;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int v=s.pop();
                a[v]=i-v;

            }
            s.push(i);
        }
        return a;
        
    }
}