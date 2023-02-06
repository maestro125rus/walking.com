package com.walking.Task_14_1.model;

public class CorrectFigure {
    protected final String VERTICAL_LINE = "|";
    protected final String HORIZONTAL_LINE = "-";
    protected final String TRIANGLE_LEFT = "/";
    protected final String TRIANGLE_RIGHT = "\\";
    protected final String FIGURE_INSIDE_SPACE = " ";




    public void printFigure(int lengthOfSide){
        System.out.println();
    }
        public String getSQUARE_VERTICAL(){
            return VERTICAL_LINE;
        }
        public String getHORIZONTAL() {
            return HORIZONTAL_LINE;
            }
        public String getTRIANGLE_LEFT() {
            return TRIANGLE_LEFT;
            }
        public String getTRIANGLE_RIGHT(){
            return TRIANGLE_RIGHT;
            }
        public String getFIGURE_INSIDE_SPACE(){
            return FIGURE_INSIDE_SPACE;
            }

}
