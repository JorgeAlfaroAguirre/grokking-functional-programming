package com.grokking.functional_programming.coffee_break.cb1_word_score;

//Imagine we are tasked with creating a function that calculates a score
//in some word-based game. A player submits a word, and the function
//returns a score. One point is given for each character in the word.

public class Main {


    public static void main(String[] args) {

        String word = "apple";

        System.out.println("Coffee Break 1:");
        System.out.println();

        CalculateScore calculateScore = new CalculateScore();
        System.out.println("Calculating the score imperatively => naming: Calculating is a verb");
        System.out.println("CalculateScore of: " + word + " = " + calculateScore.getScore(word));
        System.out.println();

        WordScore wordScore = new WordScore();
        System.out.println("Calculating the score declaratively => naming: word is a noun");
        System.out.println("Word Score of: " + word + " = " + wordScore.getWordScore(word));
        System.out.println();

        //Coffee Break 1:

        //In this exercise, we need to enhance our imperative calculateScore
        //and declarative wordScore functions. The new requirement says that the
        //score of the word should now be equal to the number of characters that
        //are different from 'a'.

        //Imperative solution

        CalculateScoreCoffee calculateScoreCoffee = new CalculateScoreCoffee();
        System.out.println("Calculating the score imperatively (with out the a)=> naming: Calculating is a verb");
        System.out.println("calculateScoreCoffee of: " + word + " = " + calculateScoreCoffee.getScoreCoffee(word));
        System.out.println();

        //Declarative solution: We can do with or without a helper function

        WordScoreCoffee wordScoreCoffee = new WordScoreCoffee();
        System.out.println("Calculating the score declaratively => naming: word is a noun");
        System.out.println();
        System.out.println("Word Score Coffee without helper of: " + word + " = " + wordScoreCoffee.WithOutHelper(word));
        System.out.println();
        System.out.println("Word Score Coffee with helper of: " + word + " = " + wordScoreCoffee.WithHelper(word));
        System.out.println();


    }

}
