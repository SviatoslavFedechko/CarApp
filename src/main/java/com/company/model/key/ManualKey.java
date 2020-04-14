package com.company.model.key;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Log
public class ManualKey extends Key {

    private boolean inserted;

    public void startEngine() {
        insertKey();
        turnKey();
    }

    public void insertKey() {
        if(!inserted){
            this.inserted = true;
        } else {
            throw new IllegalStateException("The key is already inserted");
        }
    }

    public void removeKey() {
        if(inserted){
            this.inserted = false;
        } else {
            throw new IllegalStateException("The key is not inserted");
        }
    }

    public void turnKey() {
        if(inserted){
            log.info("The engine is running");
//            System.out.println("The engine is running");
        } else {
            throw new IllegalStateException("The key is not inserted");
        }

    }

}
