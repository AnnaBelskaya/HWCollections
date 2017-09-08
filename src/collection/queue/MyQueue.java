package collection.queue;

import collection.MyCollection;

public class MyQueue<T> extends MyCollection<T>{
    public MyQueue() { }

    public T peek(){
        return first.value;
    }

    public T poll(){
        T temp = first.value;
        first = first.next;
        return temp;
    }


}
