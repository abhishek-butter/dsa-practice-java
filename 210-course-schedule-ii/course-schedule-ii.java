class Solution {
    int[] State;
    List<Integer> r=new ArrayList<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] l=new  ArrayList[numCourses];

        for(int i=0;i<numCourses;i++){
            l[i]=new ArrayList<>();
        }

        for(int[] p:prerequisites){
            l[p[1]].add(p[0]);

        }
        
        int[] d=new int[0];
        State=new int[numCourses];

        for(int i=0;i<numCourses;i++){
            if(dfs(l,i))
            return d;

        }
        

        int[] fr=new int[r.size()];
        int s=r.size()-1;
        for(int i=0;i<r.size();i++){
            fr[s--]=r.get(i);
        }
        return fr;


        
    }


    public boolean dfs(List<Integer>[] l,int c){
        if(State[c]==1)return true;

        if(State[c]==2)return false;

        State[c]=1;

        for(int n:l[c]){
            if(dfs(l,n))return true;;
        }

        State[c]=2;
        r.add(c);

        return false;
    }
}