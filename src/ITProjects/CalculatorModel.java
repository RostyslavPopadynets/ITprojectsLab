package ITProjects;

import static java.lang.Math.*;

public class CalculatorModel {

    private double result;

    public void sinus(double number){
        result = sin(number);
    }

    public void cosinus(double number){
        result = cos(number);
    }

    public void tangens(double number){
        result = tan(number);
    }

    public void cotangens(double number){
        result = 1.0 / tan(number);
    }

    public void arcsinus(double number){
        result = asin(number);
    }

    public void arccosinus(double number){
        result = acos(number);
    }

    public void arctangens(double number){
        result = atan(number);
    }

    public void arccotangens(double number){
        result = PI / 2 - atan(number);
    }

    public double getResult(){
        return result;
    }
}