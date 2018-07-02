/**
 * Fish.java
 */
package com.sample.assessment.service;

/**
 * 
 * @author Ramachandra
 *
 */

public class Fish extends Animal {

    @Override
    public void fly() {
        logMessage(I_CANNOT_FLY);
    }

    @Override
    public void sing() {
        logMessage(I_CANNOT_SING);
    }

    @Override
    public void swim() {
        logMessage(I_AM_SWIMMING);
    }

    @Override
    public void walk() {
        logMessage(I_CANNOT_WALK);
    }

    @Override
    public void logMessage(String statement) {
        System.out.println(this.getClass().getSimpleName() + statement);
    }
}
