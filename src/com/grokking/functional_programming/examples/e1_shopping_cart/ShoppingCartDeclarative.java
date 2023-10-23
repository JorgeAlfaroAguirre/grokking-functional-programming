package com.grokking.functional_programming.examples.e1_shopping_cart;

import java.util.List;

//Function always returns a single value
//Function calculates the return value based only on its arguments
//Function doesn't mutate any existing values
public class ShoppingCartDeclarative {
    public int getDiscountPercentage(List<String> items) {
        if(items.contains("Book")) {
            return 5;
        } else {
            return 0;
        }
    }
}
