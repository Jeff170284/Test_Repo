package com.company;

import java.util.Scanner;

public class Main {

    static int model;
    static int days;
    static int memb;
    static int sc;


    public static void main(String[] args) {

        double finalrate = 0.0;
        AcceptedValues();

        if(model == 1)
        {
            finalrate = Model1(days);

        }
        else if (model == 2)
        {
            finalrate = Model2(days);

        }
        else
        {
            System.out.println("Invalid Input!!");
        }

        if (memb == 1)
        {
            finalrate = finalrate - (0.05 * finalrate);

        }
        if (sc == 1)
        {
            finalrate = finalrate - (0.1 * finalrate);
        }

            System.out.println("The final cost is " + String.format("%.2f", finalrate) + " dollars");

    }

    public static void AcceptedValues()
    {
        Scanner in = new Scanner((System.in));

        System.out.println("Choose the Model you want to rent, Enter 1 for Model1 and Enter 2 for Model2: ");
        model = in.nextInt();

        System.out.println("Enter the number of days: ");
        days = in.nextInt();

        System.out.println("Enter 1 if you're a member or else enter 2: ");
        memb = in.nextInt();

        System.out.println("Enter 1 if you're a senior citizen or else enter 2: ");
        sc = in.nextInt();
    }

    public static double Model1(int noofdays)
    {
        double rate = 10;
        double tr = rate * noofdays;


        if (noofdays >= 5 && noofdays <= 10)
        {

            tr = tr - (0.05 * tr);

        }
        else if (noofdays > 10 && noofdays < 21)
        {
            tr = tr - (0.08 * tr);

        }
        else
        {
            tr = tr - (0.1 * tr);

        }

        return tr;
    }

    public static double Model2(int noofdays)
    {
        double rate = 15;
        double tr = rate * noofdays;


        if (noofdays >= 10 && noofdays < 20)
        {

            tr = tr - (0.05 * tr);

        }
        else
        {
            tr = tr - (0.1 * tr);

        }


        return tr;
    }


}
