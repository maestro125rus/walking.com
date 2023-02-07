package com.walking.Task_14_1.model;

public class Square extends CorrectFigure {
    @Override
    public void printFigure(int length) {
                                //Печать верхней стороны
        System.out.print(FIGURE_INSIDE_SPACE);
        for (int i = 0; i < length; i++){
            System.out.print(HORIZONTAL_LINE+HORIZONTAL_LINE+HORIZONTAL_LINE);
        }
        System.out.println(FIGURE_INSIDE_SPACE);
                                //Печать боковых сторон
        for (int i = 0; i < length; i++){
            System.out.print(VERTICAL_LINE);
            for (int j = 0; j < length*3; j++){
                System.out.print(FIGURE_INSIDE_SPACE);
            }
            System.out.println(VERTICAL_LINE);
        }
        System.out.print(FIGURE_INSIDE_SPACE);
                                //Печать нижней стороны
        for (int i = 0; i < length; i++){
            System.out.print(HORIZONTAL_LINE+HORIZONTAL_LINE+HORIZONTAL_LINE);
        }
        System.out.println(FIGURE_INSIDE_SPACE);
    }
}
