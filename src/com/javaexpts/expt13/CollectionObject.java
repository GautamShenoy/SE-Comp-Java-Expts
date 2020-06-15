package com.javaexpts.expt13;

import java.util.Comparator;

public class CollectionObject {
    protected String element1;

    CollectionObject () {
        this.element1 = "null";
    }

    CollectionObject (String  element) {
        this.element1 = element;
    }

    public String getElement1 () {
        return element1;
    }

    public static Comparator<CollectionObject> elementComparator = new Comparator<CollectionObject>() {

        public int compare(CollectionObject element1, CollectionObject element2) {

            String elementName1 = element1.getElement1().toUpperCase();
            String elementName2 = element2.getElement1().toUpperCase();
            return elementName1.compareTo(elementName2);
        }

    };
}
