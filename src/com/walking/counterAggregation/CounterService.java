package com.walking.counterAggregation;


import java.util.Arrays;

public class CounterService {
    public static final Counter[] COUNTER_LIST = new Counter[10];
    private static int index = 0;


    public static String getCounterList() {
        String counterNamesList = "";
        for (int i = 0; i < COUNTER_LIST.length; i++) {
            if (COUNTER_LIST[i] != null) {
                counterNamesList += COUNTER_LIST[i].getName() + "\n";
            } else {
                return counterNamesList;
            }
        }
        return counterNamesList;
    }

    public static void addCounterToList(Counter[] counter) {
        COUNTER_LIST[index] = counter[0];
        index++;
    }

    public static void incrementCounter(String name, int step) {
        for (int i = 0; i < COUNTER_LIST.length; i++) {
            if (COUNTER_LIST[i] != null) {
                if (COUNTER_LIST[i].getName() == name) {
                    COUNTER_LIST[i].setCounter(COUNTER_LIST[i].getCounter() + step);
                }
            }
        }
    }

    public static String accessByName(String name) {
        String result = "Counter not found!";
        for (int i = 0; i < COUNTER_LIST.length; i++) {
            if (COUNTER_LIST[i] != null) {
                if (COUNTER_LIST[i].getName() == name) {
                    result = COUNTER_LIST[i].getName() + ": " + COUNTER_LIST[i].getCounter() + " " + COUNTER_LIST[i].getUnits();
                }
            }
        }
        return result;
    }

    public static void reset(String name){
        for (int i = 0; i < COUNTER_LIST.length; i++) {
            if (COUNTER_LIST[i] != null) {
                if (COUNTER_LIST[i].getName() == name) {
                    COUNTER_LIST[i].setCounter(0);
                }
            }
        }
    }






}
