package com.kodilla.patterns.prototype.library;

public class CloneLibrary<T> implements Cloneable {

    @Override
    protected T clone() throws CloneNotSupportedException {
        return (T)super.clone();
    }
}
