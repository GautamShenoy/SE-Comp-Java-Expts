package com.javaexpts.expt13;
import java.util.*;

public class CollectionSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lists = new ArrayList<String>();
        int size;
        System.out.println("Enter the number of elements");
        size = sc.nextInt();
        String element;
        for ( int i = 0 ; i < size ; i ++ ) {
            System.out.println("Enter element " + (i + 1) );
            element = sc.next();
            CollectionObject obj = new CollectionObject(element);
            lists.add(element);
        }
        Collections.sort(lists);
        for ( String s : lists)
            System.out.println(s);
        System.out.println("Enter element to be searched");
        String search = sc.next();
        int index = Collections.binarySearch(lists,search);
        if (index < 0 )
            System.out.println("The element not found");
        else
            System.out.println("Element found at index : " + ( index + 1 ) );
    }
}
