package com.walking.Task_14_1;
import javax.swing.*;
import java.awt.*;

import com.walking.Task_14_1.model.CorrectFigure;
import com.walking.Task_14_1.model.Square;
import com.walking.Task_14_1.model.Triangle;
import java.util.Scanner;

    public class Main { public static void main(String[] args) {

        String typeOfFigure;
        String Str;
        int lengthOfSide;
        CorrectFigure figure;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter geometric figure type or number of angles: ");
        Str = sc.nextLine();
        typeOfFigure = Str.toLowerCase();
        System.out.print("Please enter length of side: ");
        lengthOfSide = sc.nextInt();
        sc.close();

        switch (typeOfFigure){
            case "triangle", "3":
                figure = new Triangle();
                figure.printFigure(lengthOfSide);
                break;
            case "square", "4":
                figure = new Square();
                figure.printFigure(lengthOfSide);
                break;
            default:
                figure = new CorrectFigure();
                figure.printFigure(lengthOfSide);
        }
    }
}