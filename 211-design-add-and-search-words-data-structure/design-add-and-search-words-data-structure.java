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
            if(t.children[c-'a']==null)t.children[c-'a']=new TrieNode();
            t=t.children[c-'a'];
        }
        t.flag=true;
    }
    
    public boolean search(String word) {
        return dfs(root,word,0);
        
    }


    public boolean dfs(TrieNode t,String word,int i){
        if(word.length()==i){
            return t.flag;
        }
        if(word.charAt(i)=='.'){
            for(TrieNode child:t.children){
                if(child!=null && dfs(child,word,i+1))return true;
            }
            return false;
        }
        else{
            if(t.children[word.charAt(i)-'a']==null)return false;

        }
        
        

                
    return dfs(t.children[word.charAt(i)-'a'],word,i+1);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */