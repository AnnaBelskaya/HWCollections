package collection.arraylist;

import collection.MyCollection;
import collection.linkedlist.Node;

public class MyArrayList<T> extends MyCollection {

    public MyArrayList() {
        super();
    }

    public MyArrayList(MyArrayList list) {
        first = list.first;
        size = list.size;
    }

    public Object get(int index){
        Node<T> focusNode = first;
        while (--index >= 0){
            focusNode = focusNode.next;
        }
        return focusNode.value;
    }

    public int indexOf(T value){
        Node<T> node = first;
        int i = 0;
        while (node!=null){
            if(node.value.equals(value))
                return i;
            node = node.next;
            i++;
        }
        return -1;
    }

    public int indexOf(T value, int index){
        Node<T> node = first;
        int i = 0;
        while (node!=null){
            if(node.value.equals(value) && i >= index)
                return i;
            node = node.next;
            i++;
        }
        return -1;
    }

    public int size(){
        return size;
    }
}
