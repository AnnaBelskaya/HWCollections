import collection.arraylist.MyArrayList;
import collection.hashmap.MyHashMap;
import collection.linkedlist.MyLinkedList;
import collection.queue.MyQueue;
import collection.stack.MyStack;

public class Main {
    public static void main(String[] args) {
        arrayListDemo();
        linkedListDemo();
        queueDemo();
        stackDemo();
        hashDemo();
    }

    public static void arrayListDemo(){
        System.out.println("-----------------ArrayList-----------------");
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(2);
        System.out.println("arrayList\t\t" + arrayList);
        arrayList.add(5);
        System.out.println(".add(5)\t\t\t" + arrayList);
        arrayList.remove(0);
        System.out.println(".remove(0)\t\t" + arrayList);
        System.out.println(".size()\t\t\t" + arrayList.size());
        System.out.println(".get(3)\t\t\t" + arrayList.get(3));
        System.out.println(".indexOf(2)\t\t" + arrayList.indexOf(2));
        System.out.println(".indexOf(2, 3)\t" + arrayList.indexOf(2, 3));
        MyArrayList<Integer> arrayList2 = new MyArrayList<>(arrayList);
        System.out.println("Copy of the first arrayList:\t\t" + arrayList2);

    }

    public static void linkedListDemo(){
        System.out.println("-----------------LinkedList-----------------");
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList\t\t" + linkedList);
        linkedList.add(10);
        System.out.println(".add(10)\t\t" + linkedList);
        linkedList.remove(3);
        System.out.println(".remove(3)\t\t" + linkedList);
        System.out.println(".size()\t\t\t" + linkedList.size());
        System.out.println(".get(1)\t\t\t" + linkedList.get(1));
        System.out.println(".getFirst()\t\t" + linkedList.getFirst());
        System.out.println(".getLast()\t\t" + linkedList.getLast());
        System.out.println(".contains(10)\t" + linkedList.contains(10));
        System.out.println(".contains(93)\t" + linkedList.contains(94));
    }

    public static void queueDemo(){
        System.out.println("-----------------Queue-----------------");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(0);
        queue.add(2);
        queue.add(4);
        queue.add(8);
        queue.add(16);
        System.out.println("queue\t\t\t" + queue);
        queue.add(32);
        System.out.println(".add(32)\t\t" + queue);
        queue.remove(2);
        System.out.println(".remove(2)\t\t" + queue);
        System.out.println(".size()\t\t\t" + queue.size());
        System.out.println(".peek()\t\t\t" + queue.peek());
        System.out.println(".poll()\t\t\t" + queue.poll());
        System.out.println(".poll()\t\t\t" + queue.poll());
        System.out.println("queue\t\t\t" + queue);
        System.out.println(".contains(32)\t" + queue.contains(32));
        System.out.println(".contains(2)\t" + queue.contains(2));
    }

    public static void stackDemo(){
        System.out.println("-----------------Stack-----------------");
        MyStack<Character> stack = new MyStack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');
        System.out.println("stack\t\t\t" + stack);
        stack.push('f');
        System.out.println(".push(f)\t\t" + stack);
        stack.remove(1);
        System.out.println(".remove(1)\t\t" + stack);
        System.out.println(".indexOf('a')\t" + stack.indexOf('a'));
        System.out.println(".size()\t\t\t" + stack.size());
        System.out.println(".peek()\t\t\t" + stack.peek());
        System.out.println(".pop()\t\t\t" + stack.pop());
        System.out.println(".pop()\t\t\t" + stack.pop());
        System.out.println("stack\t\t\t" + stack);
    }

    public static void hashDemo(){
        System.out.println("-----------------HashMap-----------------");
        MyHashMap<String, String> hashMap = new MyHashMap<>();
        hashMap.put("\"1984\"", "J.Orwell");
        hashMap.put("\"The Lord of The Rings\"","J.R.R.Tolkien");
        hashMap.put("\"Crime and Punishment\"", "F.M.Dostoevsky");
        System.out.println("hashMap\t\t\t\t" + hashMap);
        hashMap.put("\"Dark Tower\"", "S.King");
        System.out.println(".put(...)\t\t\t" + hashMap);
        hashMap.remove("\"1984\"");
        System.out.println(".remove(\"1984\")\t\t" + hashMap);
        System.out.println(".containsKey(\"Crime and Punishment\")\t" +
                hashMap.containsKey("\"Crime and Punishment\""));
        System.out.println(".containsValue(\"Jane Austen\")\t\t\t" + hashMap.containsValue("Jane Austen"));
        System.out.println(".keySet()\t\t\t" + hashMap.keySet());

    }
}
