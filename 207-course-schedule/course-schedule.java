class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] l=new ArrayList[numCourses];


        for(int i=0;i<numCourses;i++){
            l[i]=new ArrayList<>();

        }
        for(int[] p:prerequisites ){
            l[p[1]].add(p[0]);

        }
        int[] states=new int[numCourses];

        for(int i=0;i<numCourses;i++){
            if(dfs(l,states,i))return false;
        }
        return true;


        
    }
    public boolean dfs(List<Integer>[] g,int[] states,int c){
        if(states[c]==1)return true;

        if(states[c]==2)return false;

        states[c]=1;
        for(int n:g[c]){
            if(dfs(g,states,n))return true;
        }
        states[c]=2;
        
        return false;

    }
}