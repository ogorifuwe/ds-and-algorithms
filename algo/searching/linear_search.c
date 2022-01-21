#include <stdio.h>
#define SIZE 100

size_t linearSearch(const int arr[], int key, size_t size);

int main(void) {
  int a[SIZE];

  for (int x = 0; x < SIZE; ++x) {
    a[x] *= 2;
  }

  printf("Enter integer search key: ");
  int searchKey;
  scanf("$d", &searchKey);

  size_t index = linearSearch(a, searchKey, SIZE);

  if (index != -1) {
    printf("Found value at index %d\n", index);
  } else {
      puts("Value not found");
  }
}

size_t linearSearch(const int[] a, int key, size_t size) {
  int index = -1;

  for (size_t j = 0; j < size; ++j) {
    if (a[j] == key) {
      index = j;
      break;
    }
    printf("Im here...");
  }

  return index;
}
