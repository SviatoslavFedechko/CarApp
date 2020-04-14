package com.company.model.engine;

public class Key {

    private boolean inserted;

    public void insertKey() {
        if(!inserted){
            this.inserted = true;
        } else {
            throw new IllegalArgumentException("The key is already inserted");
        }
    }

    public void removeKey() {
        if(inserted){
            this.inserted = false;
        } else {
            throw new IllegalArgumentException("The key is not inserted");
        }
    }

    public void turnKey() {
        if(inserted){
            System.out.println("The engine is running");
        } else {
            throw new IllegalArgumentException("The key is not inserted");
        }

    }
}
