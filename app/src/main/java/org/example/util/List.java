package org.example.util;


public interface List {

    void add(Object value);

    Object get(int index);

    Object remove(int index);

    int indexOf(Object value);

    Object[] toArray();

    int size();

}