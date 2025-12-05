/**
 * HashMap — manual implementation using array of linked lists (chaining)
 * Demonstrates how Java's HashMap works internally
 */
public class HashMap {
    private static final int DEFAULT_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    private Node[] buckets;
    private int size;

    static class Node {
        String key;
        Object value;
        Node next;

        Node(String key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashMap() {
        buckets = new Node[DEFAULT_CAPACITY];
    }

    private int hash(String key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    public void put(String key, Object value) {
        int idx = hash(key);
        Node cur = buckets[idx];
        while (cur != null) {
            if (cur.key.equals(key)) { cur.value = value; return; } // update
            cur = cur.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = buckets[idx];
        buckets[idx] = newNode;
        size++;
    }

    public Object get(String key) {
        int idx = hash(key);
        Node cur = buckets[idx];
        while (cur != null) {
            if (cur.key.equals(key)) return cur.value;
            cur = cur.next;
        }
        return null;
    }

    public boolean containsKey(String key) { return get(key) != null; }
    public int size() { return size; }

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("name", "Arshita");
        map.put("role", "Software Engineer");
        map.put("city", "Bangalore");
        System.out.println(map.get("name")); // Arshita
        System.out.println(map.get("role")); // Software Engineer
        System.out.println("Size: " + map.size());
    }
}
