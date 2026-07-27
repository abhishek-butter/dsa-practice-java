class TimeMap {
    HashMap<String,List<Pair<Integer,String>>> map;

    public TimeMap() {
        map=new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key,k->new ArrayList<>());
        map.get(key).add(new Pair<>(timestamp,value));
        
    }
    
    public String get(String key, int timestamp) {
        if(map.get(key)==null)return "";
        int left=0;
        int right=map.get(key).size()-1;
        int i=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(map.get(key).get(mid).getKey()<=timestamp){
                i=mid;
                left=mid+1;
            }
            else right=mid-1;


        }
        return (i>-1)?map.get(key).get(i).getValue():"";


        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */