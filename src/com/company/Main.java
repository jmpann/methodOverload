package com.company;

public class Main {

    public static void main(String[] args) {
        // uniqueness of methods is determined by name and parameters.
        // overloading a method is using the same name and different parameters (either amount or type).
	    int newScore = calculateScore("tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println("----------");

        //Test cases -> output of -1.0cm means validation did not pass
        calcFeetAndInchesToCentimeters(12, 8);
        calcFeetAndInchesToCentimeters(6, 2);
        calcFeetAndInchesToCentimeters(1, 18);
        calcFeetAndInchesToCentimeters(145);
        calcFeetAndInchesToCentimeters(144);

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Player scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore(){
        System.out.println("Player has not scored any points");
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if ((feet <= 0) || (inches < 0) && (inches > 12)) {
            System.out.println("invalid parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "'" + inches + "'' = " + centimeters + "cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if (inches < 0) {
            return -1;
        }

        int feet = inches/12;
        int remainingInches = inches % 12;
//        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches" );
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
