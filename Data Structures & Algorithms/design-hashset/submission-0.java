class MyHashSet {
    HashMap<Object, Object> map = new HashMap();

    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(!map.containsKey(key)) {
            map.put(key, "PRESENT");
        }
    }
    
    public void remove(int key) {
        if(map.containsKey(key)) {
            map.remove(key);
        }
    }
    
    public boolean contains(int key) {
        return map.containsKey(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */