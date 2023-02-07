package com.walking.Task_14_1;

import com.walking.Task_14_1.model.CorrectFigure;
import com.walking.Task_14_1.model.Square;
import com.walking.Task_14_1.model.Triangle;
import java.util.Scanner;

    public class Main { public static void main(String[] args) {

        String typeOfFigure;
        int lengthOfSide;
        CorrectFigure figure;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter geometric figure type or number of angles: ");
        typeOfFigure = sc.nextLine();
        System.out.print("Please enter length of side: ");
        lengthOfSide = sc.nextInt();
        sc.close();

        if (lengthOfSide > 0){
            switch (typeOfFigure.toLowerCase()){
                case "triangle", "3":
                    figure = new Triangle();
                    figure.printFigure(lengthOfSide);
                    break;
                case "square", "4":
                    figure = new Square();
                    figure.printFigure(lengthOfSide);
                    break;
                default:
                    System.out.println("You not entered figure or you entered bullshit!");
            }
        }
        else {
            System.out.println("Side of figure can't less than \"1\"!");
        }
    }
}