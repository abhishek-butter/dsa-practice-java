class WordDictionary {
    class TrieNode{
        TrieNode children[]=new TrieNode[26];
        boolean flag=false;
        
    }
    TrieNode root;

    public WordDictionary() {
        root=new TrieNode();


        
    }
    
    public void addWord(String word) {
        TrieNode t=root;
        for(char c:word.toCharArray()){
            int index=c-'a';
            if(t.children[index]==null)t.children[index]=new TrieNode();
            t=t.children[index];
        }
        t.flag=true;
        
    }
    
    public boolean search(String word) {
        return dfs(word,0,root);
        
        
        
    }
    private boolean dfs(String word,int index,TrieNode node){
        if(word.length()==index){
            return node.flag;
        }
        char c=word.charAt(index);
        int ci=c-'a';

        if(c=='.'){
            for(TrieNode child:node.children){
                if(child!=null && dfs(word,index+1,child)){
                    return true;
                    
                }

            }
            return false;

        }
        else{
            if(node.children[ci]==null)return false;;
            

        }
        return dfs(word,index+1,node.children[ci]);

    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */