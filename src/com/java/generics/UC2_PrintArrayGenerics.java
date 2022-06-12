package com.java.generics;

public class UC2_PrintArrayGenerics {

    public static <E> void printArray( E[] inputArray ) {

        for ( E element : inputArray ) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.2, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        UC2_PrintArrayGenerics.printArray(intArray);
        UC2_PrintArrayGenerics.printArray(doubleArray);
        UC2_PrintArrayGenerics.printArray(charArray);
    }
}
