package com.company.model.engine;

public class Key {

    private boolean keyInserted;

    public void InsertKey() {
        if(!keyInserted){
            this.keyInserted = true;
        } else {
            throw new IllegalArgumentException("The key is already inserted");
        }
    }

    public void RemoveKey() {
        if(keyInserted){
            this.keyInserted = false;
        } else {
            throw new IllegalArgumentException("The key is not inserted");
        }
    }

    public void TurnKey() {
        if(keyInserted){
            System.out.println("The engine is running");
        } else {
            throw new IllegalArgumentException("The key is not inserted");
        }

    }
}
