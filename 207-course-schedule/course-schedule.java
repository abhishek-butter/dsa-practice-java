class Solution {
    int[] state;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] l=new ArrayList[numCourses];
        

        for(int i=0;i<numCourses;i++){
            l[i]=new ArrayList<>();

        }
        for(int[] p:prerequisites){
            l[p[1]].add(p[0]);

        }
        state=new int[numCourses];

        for(int i=0;i<numCourses;i++){
            if(dfs(l,i))return false;

        }
        return true;
        
        
    }

    public boolean dfs(List<Integer>[] l,int c){
        if(state[c]==1){
            return true;
        }
        if(state[c]==2){
            return false;
        }

        state[c]=1;


        for(int n:l[c]){
            if(dfs(l,n))return true;;
        }

        state[c]=2;
        return false;
    }   
}