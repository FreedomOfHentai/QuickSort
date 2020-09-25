package com.company.second;

public class SecondArrayIns {

    private long[] theArray;
    private int nElems;

    //Constructor the second array
    public SecondArrayIns(int max)
    {
        theArray = new long[max];
        nElems = 0;
    }

    //insert new element in array
    public void insert(long value)
    {
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

    //hm this is not just swap, if i'm using memory in this is array
    private void swap(int dex1, int dex2)
    {
        long temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }

    //main method quick sort
    public void quickSort()
    {
        recQuickSort(0,nElems-1);
    }

    //midpoint of three points
    public long medianOf3(int left, int right)
    {
        int center = (left + right) / 2;

        if (theArray[left] > theArray[center])
            swap(left,center);
        if (theArray[left] > theArray[right])
            swap(left,right);
        if (theArray[center] > theArray[right])
            swap(center,right);

        return theArray[center];
    }

    //split with a passage in two directions.
    private int partition(int left, int right, long pivot)
    {
        int leftIndex = left;
        int rightIndex = right;

        while (leftIndex <= rightIndex)
        {
            while(theArray[leftIndex] < pivot)
                leftIndex++;
            while (theArray[rightIndex] > pivot)
                rightIndex--;
            if (leftIndex <= rightIndex){
                swap(leftIndex,rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    //recursive realization quick sort
    private void recQuickSort(int left, int right)
    {
        if (left < right) {
            long pivot = medianOf3(left,right);
            int pIndex = partition(left,right,pivot);
            recQuickSort(left,pIndex-1);
            recQuickSort(pIndex,right);
        }
    }
}

