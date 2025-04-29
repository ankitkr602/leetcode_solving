class LRUCache {

    public class DLL{
        int key;
        int value;
        DLL prev;
        DLL next;

        public DLL()
        {

        }
        public DLL(int key, int value){
            this.key = key;
            this.value = value;  
            this.prev = null;
            this.next =null;     }
    }
    class Pair{
        int value;
        DLL add;
        public Pair(int value, DLL add){
            this.value = value;
            this.add =add;
        }
    }
    int n;
    DLL head, tail;
    HashMap<Integer,Pair> cache = new HashMap<>();
    public LRUCache(int capacity) {
     n = capacity;
     head = new DLL();
     head.prev =null;
     tail = new DLL();
     tail.next =null;
     head.next = tail;
     tail.prev = head;
    }

    public void addNode(DLL node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    public void printList(DLL head)
    {
        DLL head1 = head.next;
        //System.out.println(head1.next.key);
        while(head1 != tail){
            System.out.println(head1.key);
            head1 = head1.next;
        }
    }
    public void removeNode(DLL add){
        add.prev.next = add.next;
        add.next.prev = add.prev;
    }
    
    public int get(int key) {
        
        if(cache.containsKey(key)){
           //System.out.println(key);
            removeNode(cache.get(key).add);
            DLL node =new DLL(key,cache.get(key).value);
            addNode(node);
            cache.put(node.key,new Pair(node.value, node));
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
       //printList(head);
       //System.out.println(cache.size());
       if(cache.containsKey(key)){
            removeNode(cache.get(key).add);
        }
        else if(n == cache.size()){
            cache.remove(tail.prev.key);
            //System.out.println(tail.prev.key);
            removeNode(tail.prev);
            }
         DLL node =new DLL(key,value);
         addNode(node);
         cache.put(key,new Pair(node.value, node));
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */