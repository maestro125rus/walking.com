package com.walking.counterAggregation;

public class Counter {
    private final String name;
    private final String units;
    private int counter;

    public Counter(String name, String units) {
        this.name = name;
        this.units = units;
        this.counter = 0;
    }

    public Counter(String name, String units, int counter) {
        this.name = name;
        this.units = units;
        this.counter = counter;
    }

    public void setCounter(int value) {
        counter = value;
    }

    public int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public String getUnits() {
        return units;
    }
}