package com.grokking.functional_programming.coffee_break.cb1_word_score;

public class WordScoreCoffee {

    //Declarative solution: We can do with or without a helper function

    //Without a helper function:
    public int WithOutHelper(String word) {
        return word.replace("a", "").length();
    }

    public String stringWithoutChar(String s, char c){
        return s.replace(Character.toString(c), "");
    }

    public int WithHelper(String word) {
        return stringWithoutChar(word, 'a').length();
    }

}
