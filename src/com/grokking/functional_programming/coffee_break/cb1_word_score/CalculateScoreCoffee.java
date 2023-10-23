package com.grokking.functional_programming.coffee_break.cb1_word_score;

//Coffee Break 1:

//In this exercise, we need to enhance our imperative calculateScore
//and declarative wordScore functions. The new requirement says that the
//score of the word should now be equal to the number of characters that
//are different from 'a'.

//Imperative solution
public class CalculateScoreCoffee {

    public int getScoreCoffee(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            if(c != 'a'){
                score++;
            }
        }
        return score;
    }

}
