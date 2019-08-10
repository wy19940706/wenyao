package com.wenyao.springanaylize.service;

public class CycleB {

    private CycleA cycleA;

    public CycleA getCycleA() {
        return cycleA;
    }

    public void setCycleA(CycleA cycleA) {
        this.cycleA = cycleA;
    }

    public void methodTwo() {
        System.out.println("B");
        cycleA.methodOne();
    }
}
