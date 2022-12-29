package lecture08.section08.GenericsDataStracture;

// Type Erasure replace all T with actually type this is done automatically by java.
public class TypeErasure {

    public class Node<T> {

        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() { return data; }
    }

//    public class Node {
//
//        private Object data;
//        private Node next;
//
//        public Node(Object data, Node next) {
//            this.data = data;
//            this.next = next;
//        }
//
//        public Object getData() { return data; }
//    }

}
