package com.walking.Task_14_1.model;

public class Triangle extends CorrectFigure {
    @Override
    public void printFigure(int length) {
                        //Печать боковых сторон
        for (int i = 1; i <= length; i++) {
            for (int j = length - i; j >= 1; j--) {
                System.out.print(FIGURE_INSIDE_SPACE);
            }
            System.out.print(TRIANGLE_LEFT);
            for (int k = 1; k <= 2 * (i - 1); k++) {
                System.out.print(FIGURE_INSIDE_SPACE);
            }
            System.out.println(TRIANGLE_RIGHT);
        }
                        //Печать нижней стороны
        for (int i = 1; i <= 2 * length; i++) {
            System.out.print(HORIZONTAL_LINE);
        }
    }
}


