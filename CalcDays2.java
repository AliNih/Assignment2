/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcdays2;

/**
 *
 * @author Nih Ali
 */
import java.util.Scanner;
public class CalcDays2 {

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
        int numberOfDays = calcDays2(month, year);
        System.out.printf("\n%-15s \n", "The amount of days in this month is " + numberOfDays);
    }
    
    public static int calcDays2(int month, int year) {
        int days = 0;
        
        switch (month){
            case 1:
            case 3:    
            case 5: 
            case 7:
            case 8:   
            case 10:    
            case 12:   
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (leapYear(year))
                    days = 29;
                
                else{        
                    days = 28;                    
        }         
        }
        return days;
        }          
    public static boolean leapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    
}
