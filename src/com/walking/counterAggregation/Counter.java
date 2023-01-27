package com.walking.counterAggregation;

public class Counter {
    private final String NAME;
    private final String UNITS;
    private int counter;

    public Counter(String name, String units) {
        this(name, units, 0);
    }

    public Counter(String name,  String units, int counter) {
        this.counter = counter;
        this.UNITS = units;
        this.NAME = name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getUnits() {
        return UNITS;
    }

    public String getName() {
        return NAME;
    }
}