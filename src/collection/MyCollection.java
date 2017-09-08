package collection;

import collection.linkedlist.Node;

abstract public class MyCollection<T> {
    protected Node<T> first;
    protected Node<T> last;
    protected int size;

    public MyCollection() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void add(T value){
        if (isEmpty()){
            first = new Node<>(value, null,null);
            last = first;
        } else {
            last.next = new Node<>(value, last,null);
            last = last.next;
        }
        size++;
    }

    public void clear(){
        first = null;
        size = 0;
    }

    public boolean contains(T value){
        Node<T> node = first;
        while (node!=null){
            if(node.value.equals(value))
                return true;
            node = node.next;
        }
        return false;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void remove(int index) {
        if (index == 0) {
            first = first.next;
        } else {
            Node<T> focusNode = first;
            index--;
            while (--index >= 0)
                focusNode = focusNode.next;
            focusNode.next = focusNode.next.next;
        }
        size--;
    }

    public int size(){
        return size;
    }

    public String toString() {
        if (isEmpty()) return "";
        String output = "[";
        Node<T> node = first;
        while (node != null) {
            if (node.next == null)
                output+=(node.value + "]");
            else
                output+=(node.value + ", ");
            node = node.next;
        }
        return output;
    }

    public T[] toArray(T[] array){
        int i = -1;
        Node<T> node = first;
        while (node != null) {
            array[++i] = node.value;
            node = node.next;
        }
        return array;
    }
}
