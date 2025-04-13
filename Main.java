public class Main {
    public static void main(String[] args) {
        // MyArrayList test
        System.out.println("=== MyArrayList ===");
        MyList<String> arrayList = new MyArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add(1, "X");
        arrayList.remove("B");
        for (String s : arrayList) {
            System.out.println(s);
        }

        // MyLinkedList test
        System.out.println("\n=== MyLinkedList ===");
        MyList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(1, 15);
        linkedList.remove((Integer) 20);
        for (Integer n : linkedList) {
            System.out.println(n);
        }

        // MyStack test
        System.out.println("\n=== MyStack ===");
        MyStack<String> stack = new MyStack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        System.out.println("Top: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top after pop: " + stack.peek());

        // MyQueue test
        System.out.println("\n=== MyQueue ===");
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek after dequeue: " + queue.peek());

        // MyMinHeap test
        System.out.println("\n=== MyMinHeap ===");
        MyMinHeap<Integer> minHeap = new MyMinHeap<>();
        minHeap.add(50);
        minHeap.add(20);
        minHeap.add(30);
        minHeap.add(10);
        System.out.println("Peek min: " + minHeap.peek());
        System.out.println("Poll min: " + minHeap.poll());
        System.out.println("Peek after poll: " + minHeap.peek());
    }
}
