/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcaveragescore;

/**
 *
 * @author Nih Ali
 */
import java.util.Scanner;
import java.util.Random;
public class CalcAverageScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter the number of grades you wish for : ");
        int num = myObj.nextInt();
        double average = calcAverageScore(num);
        System.out.printf("\n%-15s %1.2f\n", "Your average is " , average);
    }
    public static double calcAverageScore(int num) {
        Random ran = new Random();
        int i = 0;
        int t = 0;
        int a = 0;
       
        while (i < num){
            int r = ran.nextInt(101); 
            System.out.printf("\n%-15s \n", "You value is " + r );
        if (r >= 40){
            t += r;      
        }
        if (r < 40){   
            a++;
        }
        i++;
        }
        double average = t / (num - a);
        return average;
        
    }
      
}
