package com.company;

import com.company.first.FirstArrayIns;
import com.company.second.SecondArrayIns;

public class Main {

    public static void main(String[] args) {

        int maxSize = 1000;
        SecondArrayIns secondArrayIns = new SecondArrayIns(maxSize);

        for (int i = 0; i < maxSize;i++) {

            long n = (int)(java.lang.Math.random()*999);
            secondArrayIns.insert(n);
        }

        secondArrayIns.display();
        secondArrayIns.quickSort();
        secondArrayIns.display();

    }
}
