package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        System.out.println("Enter a number");


        Scanner keyboard = new Scanner(System.in);

        int num= keyboard.nextInt ();
        int counter=1;

        while(counter<=num)
        {  if(counter!=num)
         {
            System.out.print(counter+";");

         }
         else{
            System.out.print(counter);

        }
            counter++;
        }

      /*  System.out.println ("Enter a number :" );
        Scanner keyboard= new Scanner(System.in);
         int num=keyboard.nextInt ();

        int counter=1;

        while(counter<=num)
        {
             if(counter!=num)
             {
                 System.out.print( counter+";");
                 counter++;
             }

        }*/

	// write your code here

       /* int i=1;
        do{
            System.out.print(i);
            System.out.print(" ");
            i++;
        } while (i<=50);*/

       //get input from the user
      /*  System.out.print("Enter the number:");
        Scanner keyboard= new Scanner (System.in);
        int i=keyboard.nextInt ();
        int sum=0;
        int counter=0;



         while(counter<= i)
         {
             sum+=counter;
              counter++;
         }

        System.out.println("The sum of the numbers is " + sum);*
         /*while (0<=i)
        {
            sum=sum+i;
             i--;

        }*/
    }
}
