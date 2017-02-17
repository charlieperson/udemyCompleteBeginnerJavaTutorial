package com.charlieperson;

public abstract class Machine {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void start();
    public abstract void run();
    public abstract void shutDown();

    public void fullUse() {
        start();
        run();
        shutDown();
    }
}
