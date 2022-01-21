/**
 * binary-search.c
 * This algorithm is optima when finding a search key in a sorted array
 */
#include <stdio.h>
#define SIZE 15

// function prototypes
size_t binarySearch(const int arr[], int key, size_t low, size_t high);
void printHeader(void);
void printRow(const int arr[], size_t low, size_t mid, size_t high);

// program execution
int main(void) {
  int arr[SIZE]; // create a new array of capacity SIZE

  // populate array with data
  for (size_t i = 0; i < SIZE; ++i) {
    arr[i] = i * 2;
  }

  printf("%s", "Enter a number between 0 and 28: ");
  int key;
  scanf("%d", &key);

  printHeader();
  
  size_t result = binarySearch(arr, key, 0, SIZE-1);
  if (result != -1) {
    printf("\n%d found at index %zu\n", key, result);
  } else {
      printf("\n%d not found\n", key);
  }
}

// performs binary search of an array
size_t binarySearch(const int arr[], int key, size_t low, size_t high) {
  size_t result = -1;

  while (low <= high) {
    size_t middle = (low + high) / 2; // get middle index of array/subarray in consideration
    printRow(arr, low, middle, high); // print array/subarray in consideration
    
    if (arr[middle] == key) {
      result = middle;
    } else if (key < arr[middle]) {
        high = middle - 1;
    } else if (key > arr[middle]) {
        low = middle + 1;
    }
  }

  return result;
}

void printHeader(void) {
  for (unsigned int i = 0; i < SIZE; ++i) {
    printf("%3u ", i);
  }

  puts("");

  for (unsigned int i = 1; i <= SIZE * 4; ++i) {
    printf("%s", "-");
  }
  puts("");
}


void printRow(const int arr[], size_t low, size_t mid, size_t high) {
  for (int i = 0; i < SIZE; ++i) {
    
    if (i < low || i > high) {
      printf("%s", "    ");
    } else if (i == mid) {
        printf("%3d*", arr[i]);
    } else {
        printf("%3d ", arr[i]);
    }
  }
    puts("");
}


