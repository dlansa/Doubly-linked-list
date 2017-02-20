package by.htp;

public class Main {

    public static void main(String[] args) {

        DoublyLL doublyLL = new DoublyLL();

        doublyLL.add(1);
        doublyLL.add("data");
        doublyLL.add(1, 'q');
        doublyLL.add(new Object());
        doublyLL.add(3, 123.2f);
        doublyLL.add(5, "String to delete");

        doublyLL.delete(3);
        doublyLL.delete("String to delete");

        doublyLL.print();
    }
}
