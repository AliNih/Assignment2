/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcdays;

/**
 *
 * @author Nih Ali
 */
import java.util.Scanner;
public class CalcDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter a month : ");
        int month = myObj.nextInt();
        System.out.print("Please enter a year : ");
        int year = myObj.nextInt();  
        int numberOfDays = calcDays(month, year);
        System.out.printf("\n%-15s \n", "The amount of days in this month is " + numberOfDays);
    }
    
    public static int calcDays(int month, int year) {
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            return 31;
        }
        if (month==4 || month==6 || month==9 || month==11){
            return 30;
        }
        else if (month == 2) return leapYear(year) ? 29 : 28;
         
        return 0;
        }
    
    public static boolean leapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
