class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> dq=new ArrayDeque<>();
        int area=0;
        int n=heights.length;
        for(int i=0;i<=n;i++){
            int ch=(i==n)?0:heights[i];
            while(!dq.isEmpty() && heights[dq.peek()]>ch){
                int height=heights[dq.pop()];
                int width = dq.isEmpty() ? i : i - dq.peek() - 1;
                area = Math.max(area, height * width);

            }

            dq.push(i);
        }

        return area;
        
    }
}