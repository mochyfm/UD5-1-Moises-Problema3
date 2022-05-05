package com.problema1.utils;

public class GenericKiwi<T> {
    // He puesto este nombre dado que no había uno previamente especificado
        // Y porque la pronunciación fonética de Queue es Kiwi; eso dijo mi segundo profezor favorito
    private GenericCollection<T> collection = new GenericCollection<T>();

    public void enqueue(T element) {
        collection.add(element);
    }

    public T dequeue() {
        return (T) collection.delete(0);
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < collection.getNumValores(); i++) {
            output += (i + 1) + " " + collection.getElement(i) + "\n";
        }
        return output;
    }

}
