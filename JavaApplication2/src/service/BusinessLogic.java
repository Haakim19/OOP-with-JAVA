
package service;

public class BusinessLogic {
    public static double performCalculation(int op, double no1, double no2){
        double result = 0;
            result= switch (op){
            case 1 -> no1 + no2;
            case 2 -> no1 - no2;
            case 3 -> no1 * no2;
            default -> no1 / no2;
        };
        
        return result;
    }
}
