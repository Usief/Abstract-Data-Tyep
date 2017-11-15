package comp1110.homework.A01;

public class LinkedList<T> implements List<T> {
    int elements=0;
    Node first, last;

    class Node {
        T value;
        Node next;

        Node(T value, Node next){
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString(){
            return this.value + ((next==null) ? "" : " " + next.toString());
        }
    }

    @Override
    public void add(T value){
        if(last == null){
            first = last = new Node(value, null);
        }else{
            last.next = new Node(value, null);
            last = last.next;
        }
        elements++;
    }

    @Override
    public void remove(int index){
        Node tmp = first;

        if(index == 0) {
            first = first.next;
            if (first==null) last=null;
        }else{
            Node prev = getNode(first,index-1);
            prev.next = prev.next.next;
            if(prev.next == null){
                last = prev;
            }
        }
        elements--;

    }

    private Node getNode (Node start, int index){
        return index==0 ? start : getNode(start.next, index-1);

//        if(index>elements-1){
//            return null;
//        }else{
//            Node n = first;
//
//            for(int i=0; i<index;i++){
//                n = n.next;
//            }
//
//            return n;
//        };
    }

    @Override
    public T get(int index){
        return null;
    }

    private Node recursiveList(Node oldStart){
        if(oldStart.next == null){
            return oldStart;
        }else{
            Node newPrev = oldStart.next;
            Node newStart = recursiveList(oldStart.next);
            newPrev.next = oldStart;
            return newStart;
        }

    }

    @Override
    public void reverse(){
        if(first != null){
            last = first;
            first = recursiveList(first);
            last.next = null;
        }
    }

    @Override
    public String toString() {

        return ("" + (first != null ? first : ""));
    }

    @Override
    public int size(){
        return elements;
    }
}
