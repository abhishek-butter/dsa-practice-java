class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int content=0;
        int j=0;
        Arrays.sort(g);
        Arrays.sort(s);


        for(int i=0;i<s.length;i++){
            if(g[j]<=s[i]){
                content++;
                j++;
                if(j==g.length)break;
            }


        }
        return content;
        
    }
}