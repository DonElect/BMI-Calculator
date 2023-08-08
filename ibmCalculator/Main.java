package com.donatus.ibmCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your weight: ");
        double weight = sc.nextDouble();
        System.out.print("What is your height: ");
        double height = sc.nextDouble();

        bmiCalculator(weight, height);

    }

    public static void bmiCalculator(Double weight, Double height){
        double result = (weight/Math.pow(height, 2)) * 10000.0;

        if(result >= 25){
            System.out.println("--------------------");
            System.out.printf("Your BMI is %.2f",result);
            System.out.println("kg/m2." + "\n"+"You are over WEIGHT!");
        }
        else if ((result >= 18.5)&&(result <= 24.9))
        {
            System.out.println("--------------------");
            System.out.printf("Your BMI is %.2f",result);
            System.out.println("kg/m2." + "\n"+"Your are HEALTHY");
        }
        else {
            System.out.println("--------------------");
            System.out.printf("Your BMI is %.2f", result);
            System.out.println("kg/m2." + "\n" + "You are under weight");
        }
    }
}
