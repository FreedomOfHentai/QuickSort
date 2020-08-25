package com.company;

public class Main {

    public static void main(String[] args) {

        int maxSize = 20;
        ArrayIns arrayIns = new ArrayIns(maxSize);

        for (int i = 0; i < maxSize;i++) {

            long n = (int)(java.lang.Math.random()*99);
            arrayIns.insert(n);
        }

        arrayIns.display();
        arrayIns.quickSort();
        arrayIns.display();

    }
}
