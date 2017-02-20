package by.htp;

public class DoublyLL {

    private Node head;
    private Node tail;

    public void add(Object data){
        Node node = new Node();
        node.setData(data);
        if (tail == null && head == null) {
            tail = node;
            head = tail;
        }
        else if (tail.equals(head)){
            tail = node;
            tail.setPrevious(head);
            head.setNext(tail);
        }
        else {
            node.setPrevious(tail);
            tail.setNext(node);
            tail = node;
        }
    }

    public void add(int position, Object data){
        Node node = new Node();
        node.setData(data);
        if (position == 1)
            insertHead(data);
        else if (position > length())
            add(data);
        else if (position > 0 && position <= length()){
            insertMiddle(position, data);
        }
    }

    public void print(){
        Node node = head;
        while (node != null){
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public void delete(Object data){
        Node node = head;
        if (length() == positionAt(data)) {
            tail = node.getPrevious();
            tail.setNext(null);
        }
        else if (positionAt(data) == 1) {
            head = node.getNext();
            head.setPrevious(null);
        }
        else while (node != null){
            if (node.getData().equals(data)){
                Node previous = node.getPrevious();
                Node next = node.getNext();
                previous.setNext(next);
                next.setPrevious(previous);
            }
            node = node.getNext();
        }
    }

    public void delete(int position) {
        Node node = head;
        int counter = 0;
        if (length() >= position) {
            while (counter != position) {
                node = node.getNext();
                counter++;
            }
            Node previous = node.getPrevious();
            Node next = node.getNext();
            previous.setNext(next);
            next.setPrevious(previous);
        }
    }

    public int length(){
        int counter = 0;
        Node node = head;
        while (node != null){
            counter++;
            node = node.getNext();
        }
        return counter;
    }

    public int positionAt(Object data){
        int counter = 0;
        Node node = head;
        while (node != null){
            counter++;
            if (node.getData().equals(data))
                return counter;
            node = node.getNext();
        }
        return 0;
    }

    private void insertHead(Object data){
        Node node = new Node();
        node.setData(data);
        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            node.setNext(head);
            head.setPrevious(node);
            head = node;
        }
    }

    private void insertMiddle(int position, Object data){
        int counter = 1;
        Node node = new Node();
        node.setData(data);
        Node previous = head;

        while (! (position-1 == counter)){
            counter++;
            previous = previous.getNext();
        }

        Node next = previous.getNext();

        node.setNext(next);
        node.setPrevious(previous);

        previous.setNext(node);
        next.setPrevious(node);
    }

    public Node getTail() {
        return tail;
    }
}
