package com.problema1.utils;

public class GenericCollection<T> {
        private static final int DEFAULT_VALUE = 5;
        private Object [] datos = null;
        private int numValores = 0;

        public GenericCollection(int initialCapacity) {
            datos = new Object[initialCapacity];
        }

        public GenericCollection() {
            datos = new Object[DEFAULT_VALUE];
        }


        public void insert(T element, int position) {
            if (numValores == datos.length) {
                Object []aux = datos;
                datos = new Object[datos.length * 2];

                for (int i = 0; i < numValores; i++) {
                    datos[i] = aux[i];
                }
                aux = null;
            }

            for (int i = numValores - 1; i >= position; i--) {
                datos[i + 1] = datos[i];
            }

            datos[position] = element;
            numValores++;
        }

        public void add(T element) {
            insert(element, numValores);
        }

        public T delete(int position) {
            Object aux = datos[position];

            for (int i = position; i < numValores - 1; i++) {
                datos[i] = datos[i + 1];
            }
            datos[numValores - 1] = null;
            numValores--;
            return (T) aux;
        }

        public T getElement(int position) {
            return (T) datos[position];
        }

        public int getNumValores() {
            return numValores;
        }

        @Override
        public String toString() {
            String out = "-> ";
            for (int i = 0; i < numValores; i++) {
                out += datos[i] + " | ";
            }
            return out;
        }
    }
