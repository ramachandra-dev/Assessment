/**
 * Cat.java
 */
package com.sample.assessment.service;

/**
 * 
 * @author Ramachandra
 *
 */

public class Cat extends Animal {

    @Override
    public boolean fly() {
        logMessage(I_CANNOT_FLY);
        return false;
    }

    @Override
    public boolean sing() {
        logMessage(I_AM_SAYING_MEOW);
        return true;
    }

    @Override
    public boolean swim() {
        logMessage(I_AM_SWIMMING);
        return true;
    }

    @Override
    public boolean walk() {
        logMessage(I_AM_WALKING);
        return true;
    }

    @Override
    public void logMessage(String statement) {
        System.out.println(this.getClass().getSimpleName() + statement);
    }
}
