public class ResizableArray {

  private int[] items = new int[8];
  private int size = 0;;

  public int size() {
    return size;
  }

  public void set(int index, int item) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException(index);
    }
    items[index] = item;
  }

  public void append(int item) {
    ensureExtraCapacity();
    items[size] = item;
    ++size;
  }

  private void ensureExtraCapacity() {
    if (size == items.length) {
      int[] copy = new int[2 * size];
      System.arraycopy(items, 0, copy, 0, size);
      items = copy;
    }
  }

  public int get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException(index);
    }
    return items[index];
  }
}
