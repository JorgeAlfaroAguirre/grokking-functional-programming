package com.grokking.functional_programming.coffee_break.cb1_word_score;

public class CoffeeBreak1 {

    //Imagine we are tasked with creating a function that calculates a score
    //in some word-based game. A player submits a word, and the function
    //returns a score. One point is given for each character in the word.

    //Calculating the score imperatively

    static String word = "apple";

    //calculate => verb
    public static int calculateScore(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            score++;
        }
        return score;
    }

    //Calculating the score declaratively

    //word => noun
    public static int wordScore(String word) {
        return word.length();
    }

    //Coffee Break 1:

    //In this exercise, we need to enhance our imperative calculateScore
    //and declarative wordScore functions. The new requirement says that the
    //score of the word should now be equal to the number of characters that
    //are different from 'a'.

    //Imperative solution

    public static int calculateScoreCoffee(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            if(c != 'a'){
                score++;
            }
        }
        return score;
    }

    //Declarative solution: We can do with or without a helper function

    //Without a helper function:
    public static int wordScoreCoffee1(String word) {
        return word.replace("a", "").length();
    }

    //With a helper function:

    public static String stringWithoutChar(String s, char c){
        return s.replace(Character.toString(c), "");
    }
    public static int wordScoreCoffee2(String word) {
        return stringWithoutChar(word, 'a').length();
    }

    public static void main(String[] args) {

        System.out.println("Imperative: calculateScore = " + calculateScore(word));
        System.out.println("Declarative: wordScore = " + wordScore(word));
        System.out.println("Imperative: calculateScoreCoffee = " + calculateScoreCoffee(word));
        System.out.println("Declarative: wordScoreCoffee = " + wordScoreCoffee1(word));
        System.out.println("Declarative: wordScoreCoffee = " + wordScoreCoffee2(word));
    }

}
