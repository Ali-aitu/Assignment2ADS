# Assignment2ADS

# Custom Java Data Structures

This project is a custom implementation of basic data structures in Java **without using `java.util.*` (except Iterator)**. It includes physical structures (lists) and logical structures built on top of them.

---

## ✅ Implemented Structures

### 📦 Physical Data Structures

- **`MyArrayList<T>`**  
  Array-based dynamic list. Supports basic list operations.

- **`MyLinkedList<T>`**  
  Doubly linked list with inner `MyNode` class. Handles all standard list operations.

Both classes implement a common interface:  
**`MyList<T>`** with methods: `add`, `get`, `remove`, `clear`, `size`, `isEmpty`, `iterator`.

---

### 🧠 Logical Data Structures

| Structure     | Based on         | Description                         |
|---------------|------------------|-------------------------------------|
| `MyStack<T>`  | `MyArrayList<T>` | LIFO stack                          |
| `MyQueue<T>`  | `MyLinkedList<T>`| FIFO queue                          |
| `MyMinHeap<T extends Comparable<T>>` | `MyArrayList<T>` | Min-heap priority queue     |

---

## 🧪 How to Run

Run `Main.java` to test all structures. It demonstrates:

- Adding and removing elements
- Stack and queue operations
- Heap insertion and removal

---

## 📚 Example Output
=== MyArrayList === A X C

=== MyLinkedList === 10 15 30

=== MyStack === Top: Three Pop: Three Top after pop: Two

=== MyQueue === Peek: First Dequeue: First Peek after dequeue: Second

=== MyMinHeap === Peek min: 10 Poll min: 10 Peek after poll: 20

---

## 👨‍💻 Developer Notes

- No external collections were used  
- Fully generic (`<T>`)  
- Iterators implemented manually  
- `MyMinHeap` uses `Comparable<T>` for ordering  

---

## ✅ Tasks Completed

- [x] Implement `MyList<T>` interface
- [x] Create `MyArrayList<T>` and `MyLinkedList<T>`
- [x] Build `MyStack`, `MyQueue`, `MyMinHeap`
- [x] Create tests in `Main.java`
- [x] Add documentation




