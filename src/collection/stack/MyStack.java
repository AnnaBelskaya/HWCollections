package collection.stack;

import collection.linkedlist.Node;

public class MyStack<T> {
    private Node<T> bottom;
    private Node<T> top;
    private int size;

    public MyStack() {
        bottom = null;
        top = null;
        size = 0;
    }

    public void clear(){
        size = 0;
        bottom = null;
    }

    public int indexOf(T element){
        Node<T> node = bottom;
        int i = 0;
        while (node != null) {
            if (node.value.equals(element)){
                return i;
            }
            i++;
            node = node.next;
        }
        return -1;
    }

    public int indexOf(T element, int index){
        Node<T> node = bottom;
        int i = 0;
        while (node != null) {
            if (node.value.equals(element) && i >= index){
                return i;
            }
            i++;
            node = node.next;
        }
        return -1;
    }

    public boolean isEmpty(){
        return (bottom == null);
    }

    public void push(T value){
        if (isEmpty()){
            bottom = new Node<T>(value,null, null);
            top = bottom;
        } else {
            top.next = new Node<T>(value,top, null);
            top = top.next;
        }
        size++;
    }

    public T peek(){
        return top.value;
    }

    public T pop(){
        T temp = top.value;
        size--;
        top = top.prev;
        top.next = null;
        return temp;
    }

    public int size(){
        return size;
    }


    public void remove(int index){
        if(index == 0){
            bottom = bottom.next;
        } else {
            Node<T> focusNode = bottom;
            index--;
            while(--index >= 0)
                focusNode = focusNode.next;
            focusNode.next = focusNode.next.next;
        }
        size--;
    }

    @Override
    public String toString(){
        if (isEmpty()) return "";
        Node<T> node = bottom;
        String output = "[";
        while (node != null) {
            if (node.next == null)
                output += node.value + "]";
            else
                output += node.value + ", ";
            node = node.next;
        }
        return output;
    }
}