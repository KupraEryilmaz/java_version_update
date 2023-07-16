package com.cydeo;

public class ArraySorting {

    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
        QuickSort qs =new QuickSort();
        BubbleSorting bs = new BubbleSorting();
        as.sort(qs);
        as.sort(bs);

        System.out.println("************************************************");

        as.sort( () -> System.out.println("Quick Sorting"));
        as.sort( () -> System.out.println("Bubble Sorting"));


    }

    private void sort(Sorting sorting){
        sorting.sort();
    }
}
