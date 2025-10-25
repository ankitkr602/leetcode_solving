class TimeMap {

    HashMap<String, TreeMap<Integer, String>> m;
    public TimeMap() {
        m = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(m.containsKey(key)){
            m.get(key).put(timestamp, value);
        }
        else
        {
            TreeMap<Integer, String> t = new TreeMap<>();
            t.put(timestamp, value);
            m.put(key, t);
        }
    }
    
    public String get(String key, int timestamp) {
        if(m.containsKey(key)){
            TreeMap<Integer, String> temp = m.get(key);
            return temp.containsKey(timestamp) ? temp.get(timestamp) : temp.floorEntry(timestamp)== null ? "": temp.floorEntry(timestamp).getValue() ;
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */