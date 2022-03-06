package com.company;

public class Main {

    static void bubbleSort(int[] arr){
        int count = 0;
        boolean needIteration = true;
        while(needIteration){
            needIteration = false;
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        needIteration = true;
                        count++;
                    }
        }
        System.out.println("The number of permutations is" + count);
    }

    static void insertionSort(int[] arr){
        int count = 0;
        int n = arr.length;
        for (int i = 1; i<n;i++) {
            int keyItem = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > keyItem) {
                arr[j + 1] = arr[j];
                j = j - 1;
                count++;
            }
            arr[j + 1] = keyItem;
        }
        System.out.println("The number of permutation is " + count);
    }


    static void selectionSort(int[] arr){
        int count = 0;
        int n = arr.length;
        for (int i = 0; i<n-1; i++){
            int min = i;
            for (int j = i+1; j<n;j++)
                if (arr[j]< arr[min])
                    min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            count++;
        }
        System.out.println("The number of permutation is " + count);
    }

    public static void heapSort(int[] arr){
        int n = arr.length;
        for (int i = n / 2-1; i >= 0; i--){
            heapify(arr,n,i);
        }
        for (int i = n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }

    }

    static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < n && arr[left] > arr[largest])
            largest = left;
        if(right < n && arr[right] > arr[largest])
            largest = right;
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr,n,largest);
        }
    }


    public static void showArray(int[] arr){
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] libraryNum = {124,235,456,123,756,476,285,998,379,108};
        System.out.println("Initial array");
        showArray(libraryNum);
        heapSort(libraryNum);
        System.out.println("Sorted array");
        showArray(libraryNum);



    }
}
