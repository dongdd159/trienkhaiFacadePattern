package com.codegym;

import java.util.List;

public class RandomListFacade {
    public void printRandomEvenList(int size, int min, int max){
        List<Integer> list = new ListFilter().filterOdd(new RandomList().generateList(size, min, max));
        new ListPrinter().printList(list);
    }
}
