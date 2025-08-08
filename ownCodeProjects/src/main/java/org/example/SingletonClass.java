package org.example;

import javax.management.InstanceAlreadyExistsException;

public class SingletonClass {
    private static SingletonClass INSTANCE;
    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new SingletonClass();
        }
        return INSTANCE;
    }
}
