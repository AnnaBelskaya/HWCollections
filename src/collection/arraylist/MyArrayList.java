package collection.arraylist;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] elements;
    private int size;
    private int capacity = 10;

    public MyArrayList() {
        elements = new Object[capacity];
        size = 0;
    }

    public MyArrayList(MyArrayList list) {
        elements = list.getElements();
        size = list.getSize();
    }

    public void add(T value){
        if (elements == null) {
            elements = new Object[capacity];
            elements[size++] = value;
        } else {
            ensureCapacity();
            elements[size++] = value;
        }
    }

    private void ensureCapacity(){
        if (size+1 > capacity){
            capacity = (capacity*3)/2 + 1;
            elements = Arrays.copyOf(elements, capacity);
        }
    }

    public void clear(){
        elements = null;
        size = 0;
        capacity = 10;
    }

    public Object get(int index){
        return elements[index];
    }

    public int indexOf(T value){
        for (int i = 0; i < size; i++)
            if (elements[i].equals(value))
                return i;
        return -1;
    }


    public int indexOf(T value, int index){
        for (int i = index; i < size; i++)
            if (elements[i].equals(value))
                return i;
        return -1;
    }

    public void remove(int index){
        for (int i = index; i < size-1; i++)
            elements[i] = elements[i+1];
        elements = Arrays.copyOf(elements, --size);
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        String out = "[";
        for(int i = 0; i < size; i++){
            if (i < size - 1)
                out+=elements[i] + ", ";
            else
                out+=elements[i]+"]";
        }
        return out;
    }

    private Object[] getElements() {
        return elements;
    }

    private int getSize() {
        return size;
    }
}
