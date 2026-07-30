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
        if(!map.containsKey(key))return "";
        List<Pair<Integer,String>> temp=map.get(key);
        int left=0;
        int right=map.get(key).size()-1;
        int ri=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(temp.get(mid).getKey()<=timestamp){
                ri=mid;
                left=mid+1;

            }
            else right=mid-1;;
        }
        return (ri>-1)?temp.get(ri).getValue():"";

        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */