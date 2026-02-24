/*
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int []answer=new int[temperatures.length];
       
        for(int i=0;i<temperatures.length;i++){
            int c=0;
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j]>temperatures[i]){
                    answer[i]=j-i;
                    c=1;
                    break;
                }
            }
            if(c==0)answer[i]=0;
        }
        return answer;
        
    }
}
*/
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int[] a=new int[temperatures.length];
       Stack<Integer> s=new Stack<>();
       for(int i=0;i<temperatures.length;i++){
        while(!s.isEmpty()&&temperatures[i]>temperatures[s.peek()]){
            int previndex=s.pop();
            a[previndex]=i-previndex;
        }
        s.push(i);
       }
       return a;
    }
}