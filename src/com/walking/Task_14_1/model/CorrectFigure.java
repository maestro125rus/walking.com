package com.walking.Task_14_1.model;

public class CorrectFigure {
    protected final String VERTICAL_LINE = "|";
    protected final String HORIZONTAL_LINE = "-";
    protected final String TRIANGLE_LEFT = "/";
    protected final String TRIANGLE_RIGHT = "\\";
    protected final String FIGURE_INSIDE_SPACE = " ";


    public void printFigure(int lengthOfSide) {
        System.out.println("You not entered figure or you entered bullshit!");
    }
}