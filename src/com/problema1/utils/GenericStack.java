package com.problema1.utils;

public class GenericStack<T> {
    private static final int CAPACIDAD_INICIAL = 5;

    private GenericCollection<T> collection = new GenericCollection<T>(CAPACIDAD_INICIAL);

    public void push(T element) {
        collection.insert(element, 0);
    }

    public T pop() {
        return collection.delete(0);
    }

    @Override
    public String toString() {
        String output = "\n";
        for (int i = 0; i < collection.getNumValores(); i++) {
            output += (i + 1) + ". " + collection.getElement(i) + "\n";
        }
        return output;
    }
}
