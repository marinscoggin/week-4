/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
        
        int m;
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("");  //prompt the user for a birth month
        m= keys.nextInt();
        keys.close();
        
        //determine the number of days in the user's birth month
        if (m==1 || m==3 || m==5 || m==7 || m==8 | m==10 || m==1) {
            System.out.println("31 days");
        }
        if  (m==2 || m==4 || m==6 || m==6 || m==11) {
           System.out.println("30 days");
        }
        if (m==28 || m==29) {
            System.out.println("28 or 29");
        }
    }
}

                
        
          
       
