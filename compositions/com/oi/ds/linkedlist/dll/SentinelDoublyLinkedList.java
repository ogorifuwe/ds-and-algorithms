/**
 * SentinelDoublyLinkedList is an Integer based doubly linked list.
 * @see Node.java for details of Node object.
 */
class SentinelDoublyLinkedList {
  protected int size;
  protected Node head;
  protected Node tail;

  public SentinelDoublyLinkedList() {
    this.size = 0;
    this.head = new Node(0);
    this.tail = new Node(0);
    this.head.next = this.tail;
    this.tail.previous = this.head;
  }

  /**
   * @param index is the index of the node whose value will be returned
   * @pre index >= 0 or index < size 
   * @return -1 if index is invalid otherwise the value of Node at position index 
   */
  public int get(int index) {
    // validate index
    if (index < 0 || index >= size) return -1;

    // determine quickest traveral route to index, head or tail
    Node finder = this.head;
    if (index + 1 < size - index) {
      for (int i = 0; i < index + 1; ++i) finder = finder.next;
    } else {
      finger = this.tail;
      for (int i = 0; i < size - index; ++i) finder = finder.previous;
    }
    return finder.value;
  }

  /**
   * @param value is the element to be add to the head of the list
   * @post the size of the list is incremented by 1, following a successful
   * add operation
   */
  public void addAtHead(int value) {
    Node newNode = new Node(value);
    newNode.previous = this.head;
    newNode.next = this.head.next;
    this.head.next.previous = newNode;
    this.head.next = newNode;
    ++size;
  }

  /**
   * @param value is the element to be added to the tail of the list
   * @post the size of the list is incremented by 1, following a successful
   * add operation
   */
  public void addAtTail(int value) {
    Node newNode = new Node(value); 
    newNode.previous = this.tail.previous;
    newNode.next = this.tail;
    this.tail.previous.next = newNode;
    this.tail.previous = newNode;
    ++size;
  }

  /**
   * @param value is the element to be added to the list
   * @param index is the position where Node with element value will be placed
   * @pre index >= 0 or index < size
   * @post the size of the list is incremented by 1, following a successful
   * add operation
   */
  public void addAtIndex(int value, int index) {
    // validate index 
    if (index < 0) index = 0;
    if (index >= size) return;

    // determine quickest traveral route to index, head or tail
     finder = null;
    if (index < size - index) {
      finder = this.head;
      for (int i = 0; i < index; ++i) finder = finder.next;
    } else {
      finder = this.tail;
      for (int i = 0; i < size - indexi + 1; ++i) finder = finder.previous
    }
    // perform insertion operation
    Node newNode = new Node(value);
    newNode.previous = finder;
    newNode.next = finder.next;
    finder.next.previous = newNode;
    finder.next = newNode;
    ++size
  }

  /**
   * @param index is the position of node to be deleted from the list
   * @pre index >= 0 or index < size
   * @post deletes node specified by index and decrements size of list by 1
   */
  public void deleteAtIndex(int index) {
    // validate index
    if (index < 0 || index >= size) return;
    
    // determine quickest traversal route to index, head or tail and performs
    Node finder = null;
    if (index < size - index) {
      finder = this.head;
      for (int i = 0; i < index; ++i) finder = finder.next;
    } else {
      finder = this.tail;
      for (int i = 0; i < size - index + 1; ++i) finder = finder.previous;
    }
    // perform delete operation
    finder.next.next.previous = finder;
    finder.next = finder.next.next;
    finder = null;
    --size;


  }
}
