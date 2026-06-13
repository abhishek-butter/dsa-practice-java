class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack<>();
        int sum=0;
        int r[]=new int[heights.length];
        int l[]=new int[heights.length];
        Arrays.fill(r,heights.length);
        Arrays.fill(l,-1);
        for(int i=0;i<heights.length;i++){     
            while(!s.isEmpty() && heights[i]<heights[s.peek()]){
                int o=s.pop();
                r[o]=i;
            }           
            s.add(i);
            

        }
        s=new Stack<>();
        for(int i=heights.length-1;i>-1;i--){
            while(!s.isEmpty() && heights[i]<heights[s.peek()]){
                l[s.pop()]=i;
            }
            s.add(i);
        }
        for(int i=0;i<heights.length;i++){
            sum=Math.max(sum,(r[i]-l[i]-1)*heights[i]);
        }
        return sum;
        
       


        
    }
}