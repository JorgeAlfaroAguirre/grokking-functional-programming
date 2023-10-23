package com.grokking.functional_programming.coffee_break.cb1_word_score;

//Imagine we are tasked with creating a function that calculates a score
//in some word-based game. A player submits a word, and the function
//returns a score. One point is given for each character in the word.

//Calculating the score imperatively

//calculate => verb
public class CalculateScore {

    public int getScore(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            score++;
        }
        return score;
    }

}
