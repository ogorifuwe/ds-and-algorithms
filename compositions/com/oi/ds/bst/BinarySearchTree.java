package com.oi.ds.bst;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

  private Node<T> root;


  @Override
  public Node<T> getRoot() {
    return this.root;
  }

  @Override
  public void insert(T element) {
    if (root == null) {
      root = new Node<>(element, null);
    } else {
        insertElement(element, root);
    }
  }

  @Override
  public void remove(T element) {
  
    if (root == null) return;

    removeElement(element, root);
  }

  @Override
  public void traverse() {
  
    if (root == null) return;

    inOrderTraversal(root);
    System.out.println();
  }

  @Override
  public T getMin() {
    
    if (root == null) {
      return null;
    }

    T minElement = getMinElement(root);
    return minElement;
  }

  @Override
  public T getMax() {

    if (root == null) {
      return null;
    }

    T max = getMaxElement(root);
    return max;
    
  }
    

  private void insertElement(T element, Node<T> node) {
    
    if (node.element.compareTo(element) > 0) {
      if (node.leftChild != null) {
        insertElement(element, node.leftChild);
      } else {
          node.leftChild = new Node<T>(element, node);
      }
    } else {
        if (node.rightChild != null) {
          insertElement(element, node.rightChild);
        } else {
            node.rightChild = new Node<T>(element, node);
        }
    }
  }


  private void removeElement(T element, Node<T> node) {
    
    if (node == null) return;

    // search for element to be removed 
    if (node.element.compareTo(element) < 0) {
      removeElement(element, node.leftChild);
    } else if (node.element.compareTo(element) > 0) {
        removeElement(element, node.rightChild);
    } else { // element found (node.element.compareTo(element) == 1)
        // consider if element is in a leaf node
        if (node.leftChild == null && node.rightChild == null) {
          // consider if node is a left child or right child
          Node<T> parent = node.parent;

          // if node is left child
          if (parent != null && parent.leftChild == node) {
            parent.leftChild = null;
          // if node is right child  
          } else if (parent != null && parent.rightChild == node) {
            parent.rightChild = null;
          }

          // consider if node is root
          if (parent == null) root = null;

          // deference node for garbage collection
          node = null;
          // CASE 2: consider if tree has a single child
        } else if (node.leftChild == null && node.rightChild != null) {
          
          Node<T> parent = node.parent;

          if (parent != null && parent.leftChild == node) {
            parent.leftChild = node.rightChild;
          } else if (parent != null && parent.rightChild == node) {
            parent.rightChild = node.rightChild;
          }

          if (parent == null) {
            root = node.rightChild;
          }

          node.rightChild.parent = parent;
          node = null;
          // CASE 2: single left child:
        } else if (node.leftChild != null && node.rightChild == null) {
          
          Node<T> parent = node.parent;

          if (parent != null && parent.leftChild == node) {
            parent.leftChild = node.leftChild;
          } else if (parent != null && parent.rightChild == node) {
            parent.leftChild = node.rightChild;
          }

          if (parent == null) {
            root = node.leftChild;
          }

          node.leftChild.parent = parent;
          node = null;
        } else {
          // find the predecessor (max item in the left substree)
          Node<T> predecessor = getPredecessor(node.leftChild);

          // swap the elements
          T temp = predecessor.element;
          predecessor.element = node.element;
          node.element = temp;

          removeElement(element, predecessor);
        }
    }
  }

  private Node<T> getPredecessor(Node<T> node) {
    
    if (node.rightChild != null) {
      return getPredecessor(node.rightChild);
    }

    return node;
  }

  private void inOrderTraversal(Node<T> node) {

    if (node.leftChild != null) {
      inOrderTraversal(node.leftChild);
    }

    System.out.print(node.element + " ");

    if (node.rightChild != null) {
      inOrderTraversal(node.rightChild);
    }
  }

  private T getMaxElement(Node<T> node) {
    
    T maxElement = null;
    Node<T> maxNode = null;

    if (node.rightChild != null) {
      return getMaxElement(node.rightChild);
    }

    maxElement = node.element;
    return maxElement;
  }

  private T getMinElement(Node<T> node) {
    T minElement = null;

    if (node.leftChild != null) {
      return getMinElement(node.leftChild);
    }

    minElement = node.element;
    return minElement;
  }
}
