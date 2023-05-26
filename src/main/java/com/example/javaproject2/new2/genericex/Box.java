package com.example.javaproject2.new2.genericex;

public class Box<T> {

    private T item;

    public T getItem(){
        return item;
    }

    public void setItem(T item){
        this.item = item;
    }
}
