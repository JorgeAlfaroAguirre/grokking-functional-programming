package com.grokking.functional_programming.coffee_break.cb2_tip_calculator;

import java.util.ArrayList;
import java.util.List;

//Refactoring to a pure function

//Now it’s your turn to refactor imperative code into a pure function,
//but in a totally different piece of code. You are going to refactor the
//TipCalculator class that can be used by a group of friends to calculate a
//tip based on the amount of people involved. The tip is 10% if the number
//of people splitting the bill is from one to five. If a group is larger than
//five people, the tip is 20%. We also cover the corner case of dining and
//dashing—when there are no people, then the tip is obviously 0%.

// 3 Rules of a pure function

// 1. Function always returns a single value
// 2. Function calculates the return value based only on its arguments
// 3. Function doesn't mutate any existing values

public class Main {

    public static void main(String[] args) {

        System.out.println("Coffee Break 2");

        TipCalculator tipCalculator = new TipCalculator();

        tipCalculator.addPerson("Francisco");
        tipCalculator.addPerson("Gian Franco");
        tipCalculator.addPerson("Gerald");
        tipCalculator.addPerson("Jorge");

        tipCalculator.addPerson("José");

        System.out.println("4 People: "+ tipCalculator.getNames());
        System.out.println(tipCalculator.getTipPercentage());

        tipCalculator.addPerson("Michael");

        System.out.println("5 People" + tipCalculator.getNames());
        System.out.println(tipCalculator.getTipPercentage());

        TipCalculatorRefactor tipCalculatorRefactor = new TipCalculatorRefactor();

        List<String> friends = new ArrayList<>();

        int tipPercent = tipCalculatorRefactor.getTipPercentage(friends);

        System.out.println(tipPercent);

        friends.add("Francisco");
        friends.add("Gian Franco");
        friends.add("Gerald");
        friends.add("Jorge");

        tipPercent = tipCalculatorRefactor.getTipPercentage(friends);

        System.out.println(tipPercent);

        friends.add("José");
        friends.add("Michael");

        tipPercent = tipCalculatorRefactor.getTipPercentage(friends);

        System.out.println(tipPercent);

    }
}
