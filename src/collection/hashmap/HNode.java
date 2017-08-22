package collection.hashmap;

public class HNode<T,K> {
    public HNode<T,K> next;
    public T key;
    public K value;

    public HNode(T key, K value, HNode<T, K> next) {
        this.next = next;
        this.key = key;
        this.value = value;
    }
}
