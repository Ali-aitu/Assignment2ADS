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

