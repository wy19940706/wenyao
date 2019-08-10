package com.wenyao.springanaylize.service;

public class CycleA {

    private CycleB cycleB;

    public void setCycleB(CycleB cycleB) {
        this.cycleB = cycleB;
    }

    public CycleB getCycleB() {
        return cycleB;
    }

    public void methodOne() {
        System.out.println("A");
        cycleB.methodTwo();
    }
}
