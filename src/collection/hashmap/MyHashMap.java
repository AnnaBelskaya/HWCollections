package collection.hashmap;

import collection.arraylist.MyArrayList;

public class MyHashMap<T, K> {
    private HNode<T,K> first;
    private HNode<T,K> last;
    public int size;

    public MyHashMap() {
        first = null;
        last = null;
        size = 0;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void put(T key, K value){
        if (isEmpty()){
            first = new HNode<>(key, value, null);
            last = first;
        } else {
            HNode<T,K> focusNode = first;
            while (focusNode != null) {
                if (focusNode.key.equals(key)) {
                    focusNode.value = value;
                    return;
                }
                focusNode = focusNode.next;
            }
            last.next = new HNode<>(key, value, null);
            last = last.next;
        }
        size++;
    }

    @Override
    public String toString() {
        String output = "[";
        if (isEmpty()) return "";
        HNode<T, K> node = first;
        while (node != null) {
            if (node.next == null)
                output+= (node.key + "=" + node.value + "]");
            else
                output+=(node.key + "=" + node.value + ", ");
            node = node.next;
        }
        return output;
    }

    public void clear(){
        first = null;
        size = 0;
    }

    public K get(T key){
        HNode<T,K> focusNode = first;
        while (focusNode != null) {
            if (focusNode.key.equals(key))
                return focusNode.value;
            focusNode = focusNode.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public void remove(T key){
        if(key == first.key){
            first = first.next;
        } else {
            HNode<T, K> focusNode = first;
            while(focusNode.next.key != key)
                focusNode = focusNode.next;
            focusNode.next = focusNode.next.next;
        }
        size--;
    }

    public boolean containsKey(T key){
        HNode<T, K> focusNode = first;
        while (focusNode != null) {
            if (focusNode.key.equals(key))
                return true;
            focusNode = focusNode .next;
        }
        return false;
    }

    public boolean containsValue(K value){
        HNode<T, K> focusNode = first;
        while (focusNode != null) {
            if (focusNode.value.equals(value))
                return true;
            focusNode = focusNode.next;
        }
        return false;
    }

    public MyArrayList keySet(){
        if (isEmpty()) return null;
        MyArrayList<T> keys = new MyArrayList<>();
        HNode<T, K> node = first;
        while (node != null) {
            keys.add(node.key);
            node = node.next;
        }
        return keys;
    }

    public MyArrayList<K> values(){
        if (isEmpty()) return null;
        HNode<T, K> node = first;
        MyArrayList<K> values = new MyArrayList<>();
        while (node != null) {
            values.add(node.value);
            node = node.next;
        }
        return values;
    }
}
