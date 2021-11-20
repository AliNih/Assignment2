/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuresalary;

/**
 *
 * @author Nih Ali
 */
import java.util.Scanner;
public class FutureSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter your current salary : ");
        double currentSalary = myObj.nextDouble();
        System.out.print("Please enter how many years you expect to work there : ");
        int year  = myObj.nextInt();
        double salary = calcFutureSalary(currentSalary, year);
        System.out.printf("\n%-15s %1.2f$\n", "Your future salary will be " , salary);
    }
    public static double calcFutureSalary (double currentSalary, int year) {
        int i = 1;
        
        while(i<year){
        if (year < 3){
            currentSalary = currentSalary*1.03;             
        }
        if (year < 10){
            currentSalary = currentSalary*1.05;   
        }
        else if (year >=10){
            currentSalary = currentSalary*1.08; 
        }
        i++;
        }
        return currentSalary;      
    }
}
