package com.oi.ds.avl;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

  public Node<T> root;

  public BinarySearchTree() {}
  public BinarySearchTree(Node<T> root) {
    this.root = root;
  }

  @Override
  public void insert(T data) {

    Node<T> node = new Node<T>(data, null);
    // if root is null, tree is empty
    if (root == null) {
      root = node;
    } else {
        // utilize insert util for insertion
        insertData(data, root);
    }
  }

  private void insertData(T data, Node<T> node) {
    
    // create new node with data to be inserted into tree
    Node<T> newNode = new Node<>(data, node);

    // left child insert
    if (data.compareTo(node.data) < 0) {
      if (node.left != null) {
        insertData(data, node.left);
      } else {
          node.left = newNode;
      }
    } else { // right child insert
        if (node.right != null) {
          insertData(data, node.right);
        } else {
            node.right = newNode;
        }
    }
  }

  @Override
  public void delete(T data) {

    if (root == null) return;

    deleteData(data, root);
  }

  private void deleteData(T data, Node<T> node) {

    // check if the data is in left half or tree
    if (data.compareTo(node.data) < 0) {
      deleteData(data, node.left);
    } else if (data.compareTo(node.data) > 0) {
        deleteData(data, node.right);
    } else {
        // found data

        // case 1: leaf node
        if (node.left == null && node.right == null) {
          System.out.println("DELETING LEAF NODE...");
          
          Node<T> parent = node.parent;

          if (parent != null && parent.left == node) { // if node is left child
            parent.left = null;
          } else if (parent != null && parent.right == node) { // id node is right child
              parent.right = null;
          }

          if (parent == null) { // if node is root
            root = null;
          }

          node = null;
        } else if (node.left != null && node.right == null) { // case 2: single left node
            System.out.println("DELETING SINGLE LEFT NODE");

            Node<T> parent = node.parent;

            if (parent != null && parent.left == node) {
              parent.left = null;
            } else if (parent != null && parent.right == node) {
                parent.right = null;
            }

            if (parent == null) {
              root = node.left;
            }

            node = null;
        } else if (node.left == null && node.right != null) {// case 3: single right node
            System.out.println("DELETING SINGLE RIGHT NODE");

            Node<T> parent = node.parent;

            if (parent != null && node.right == node) {
              parent.right = null;
            } else if (parent != null && node.left == node) {
                parent.left = null;
            }
            
            if (parent == null) {
              root = node.right;
            }

            node = null;
        } else { // case 4: node with 2 children
            System.out.println("DELETING NODE WITH 2 CHILDREN...");

            // find predecessor: node with largest data in left subtree
            Node<T> predecessor = getPredecessor(node.left);

            T temp = predecessor.data;
            predecessor.data = node.data;
            node.data = temp;

            deleteData(data, predecessor);

        }
    }
  }

  private Node<T> getPredecessor(Node<T> node) {
    
    if (node.right != null) {
      return getPredecessor(node.right);
    }

    Node<T> predecessor = node;
    return predecessor;
  }

  @Override
  public void traverse() {

    if (root == null) return;

    inOrderTraversal(root);
    System.out.println();
  }

  private void inOrderTraversal(Node<T> node) {

    if (node.left != null) { 
       inOrderTraversal(node.left);
    }

    System.out.print(node.data + " ");

    if (node.right != null) {
      inOrderTraversal(node.right);
    }

  }

  @Override
  public T getMin() {
    
    if (root == null) { return null; }

    T minData = getMinData(root);
    return minData;
  }

  private T getMinData(Node<T> node) {
    
    if (node.left != null) {
      return getMinData(node.left);
    }

    T minData = node.data;
    return minData;
  }

  @Override
  public T getMax() {
  
    if (root == null) { return null; }

    T maxData = getMaxData(root);
    return maxData;
  }

  private T getMaxData(Node<T> node) {

    if (node.right != null) {
      return getMaxData(node.right);
    }

    T maxData = node.data;
    return maxData;
  }

  @Override
  public T getKthNode() {

    return null;
  }


}
