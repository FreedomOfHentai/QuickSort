package com.company;

public class ArrayIns {

    private long[] theArray;
    private int nElems;

    // constructor and create array
    public ArrayIns(int max) {
        theArray = new long[max];
        nElems = 0;
    }

    // add element in array
    public void insert(long value) {
        theArray[nElems] = value;
        nElems++;
    }

    //check my array
    public void display() {
        System.out.print("A=");
        for (int j = 0; j < nElems; j++)
            System.out.print(theArray[j]+ " ");
        System.out.println();
    }

    //main method quickSort
    public void quickSort(){
        recQuickSort(0,nElems-1);
    }

    //recursive realization quickSort
    public void recQuickSort(int left, int right) {
        if(left < right) {
            int pIndex = partition(left,right);
            recQuickSort(left,pIndex-1);
            recQuickSort(pIndex+1,right);
        }
    }

    //i hate this is method, i'm learn this is method 6 months, i'm really stupid guy
    public int partition(int left, int right) {
        long pivot = theArray[right];
        int partitionIndex = left;
        for(int cur = left; cur < right; cur++) {
            if(theArray[cur] < pivot) {
                swap(theArray,cur,partitionIndex);
                partitionIndex++;
            }
        }
        swap(theArray,partitionIndex,right);
        return partitionIndex;
    }

    // just swap
    public void swap(long[] array, int dex1, int dex2) {
        long temp = array[dex1];
        array[dex1] = array[dex2];
        array[dex2] = temp;
    }


}
