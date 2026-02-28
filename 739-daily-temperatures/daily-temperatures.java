class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size=temperatures.length;
        Stack<Integer> s=new Stack<>();
        int a[]=new int[size];

        for(int i=0;i<size;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int prevIndexValue=s.pop();
                a[prevIndexValue]=i-prevIndexValue;
                
            }
            s.push(i);
        }
        return a;
        
    }
}