/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letterscore;

/**
 *
 * @author Nih Ali
 */
import java.util.Scanner;
public class LetterScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please enter the digit score : ");
        double digitScore = myObj.nextDouble();
        double a = toLetterScore(digitScore);
        System.out.printf("\n%-15s \n", "Your score in letter is " + a);
    }
    public static char toLetterScore (double digitScore) {
        int i = 0;
        char a=0;
        
        while(i<digitScore){       
        if (digitScore >=90){
            a = 'A';  
        }
        if (digitScore >=80){
            a = 'B';  
        }
        else if (digitScore >=70){
            a = 'C';
        }
        else if (digitScore >=60){
            a = 'D';
        }
        else if (digitScore >=0){
            a = 'F'; 
        } 
        i++;
        }         
        return a;
    }
    public static void printMessage (char letterScore) {
        int p = 0;
        
        while (p<letterScore){
         return;
        }
    }
}
