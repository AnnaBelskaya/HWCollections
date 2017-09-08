package collection.linkedlist;

import collection.MyCollection;

public class MyLinkedList<T> extends MyCollection {
    public MyLinkedList() { }

    public T get(int index){
        Node<T> focusNode = first;
        while (--index >= 0){
            focusNode = focusNode.next;
        }
        return focusNode.value;
    }

    public T getFirst(){
        Node<T> focusNode = first;
        return focusNode.value;
    }

    public T getLast(){
        Node<T> focusNode = last;
        return focusNode.value;
    }

}
