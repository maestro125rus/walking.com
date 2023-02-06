package com.walking.Task_14_1.model;

import java.util.Scanner;

public class Square extends CorrectFigure {
    @Override
    public void printFigure(int length) {
        //Печать верхней стороны
        System.out.print(FIGURE_INSIDE_SPACE);
        for (int i = 0; i < length; i++){
            System.out.print(HORIZONTAL_LINE+HORIZONTAL_LINE+HORIZONTAL_LINE);
        }
        //Печать боковых сторон
        System.out.println(FIGURE_INSIDE_SPACE);
        for (int i = 0; i < length; i++){
            System.out.print(VERTICAL_LINE);
            for (int j = 0; j < length*3; j++){
                System.out.print(FIGURE_INSIDE_SPACE);
            }
            System.out.println(VERTICAL_LINE);
        }
        //Печать нижней стороны
        System.out.print(FIGURE_INSIDE_SPACE);
        for (int i = 0; i < length; i++){
            System.out.print(HORIZONTAL_LINE+HORIZONTAL_LINE+HORIZONTAL_LINE);
        }
        System.out.println(FIGURE_INSIDE_SPACE);

    }


}
