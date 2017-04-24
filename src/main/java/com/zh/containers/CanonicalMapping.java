package com.zh.containers;

import java.util.WeakHashMap;

/**
 * WeakHashMap
 * Created by zh on 2017-04-25.
 */
public class CanonicalMapping {
    public static void main(String[] args) {
        int size = 1000;
        if(args.length > 0)
            size = new Integer(args[0]);
        Key[] keys = new Key[size];
        WeakHashMap<Key, Value> map = new WeakHashMap<>();
        for (int i = 0; i < size; i++) {
            Key k = new Key(Integer.toString(i));
            Value v = new Value(Integer.toString(i));
            if(i % 3 == 0)
                keys[i] = k; //save as "real" references
            map.put(k, v);
        }
        System.gc();
    }
}
class Element {
    private String ident;
    public Element(String id) {
        ident = id;
    }
    public String toString() {
        return ident;
    }
    public int hashCode() {
        return ident.hashCode();
    }
    public boolean equals(Object r) {
        return r instanceof Element && ident.equals(((Element)r).ident);
    }
    protected void finalize() {
        System.out.println("Finalizing " + getClass().getSimpleName() + " " + ident);
    }
}
class Key extends Element {
    public Key(String id) {
        super(id);
    }
}
class Value extends Element {
    public Value(String id) {
        super(id);
    }
}
