package by.htp;

public class Node {

    private Object data;
    private Node next;
    private Node previous;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node node = (Node) o;

        if (getData() != null ? !getData().equals(node.getData()) : node.getData() != null) return false;
        if (getNext() != null ? !getNext().equals(node.getNext()) : node.getNext() != null) return false;
        return getPrevious() != null ? getPrevious().equals(node.getPrevious()) : node.getPrevious() == null;

    }

    @Override
    public int hashCode() {
        int result = getData() != null ? getData().hashCode() : 0;
        result = 31 * result + (getNext() != null ? getNext().hashCode() : 0);
        result = 31 * result + (getPrevious() != null ? getPrevious().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Node: " + data.toString() + ", previous: " + next + ", next: " + next;
    }
}
