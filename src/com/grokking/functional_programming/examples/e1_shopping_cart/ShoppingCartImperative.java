package com.grokking.functional_programming.examples.e1_shopping_cart;

import java.util.ArrayList;
import java.util.List;

//Imperative

//Function doesn't return a value
//Function mutates existing values
//Function calculates the return value based on more than just arguments
//Function calculates the return value based on more than just arguments

public class ShoppingCartImperative {

    //Requirements: Shopping cart
    //1. Any item (modeled as a String) can be added to the cart.
    //2. If any book has been added to the cart, the discount is 5%.
    //3. If no book has been added, the discount is 0%.
    //4. Items in the cart can be accessed at any time.

    //items in our internal state that we need to tiptoe around.
    private List<String> items = new ArrayList<>();

    //addItem is just a wrapper around List’s add method
    public void addItem(String item) {
        items.add(item);
    }

    //addItem is just a wrapper around List’s remove method
    public void removeItem(String item) {
        items.remove(item);
    }

    //This function is the only original one. It fulfills our requirements.
    public int getDiscountPercentage() {
        if(items.contains("Book")) {
            return 5;
        } else {
            return 0;
        }
    }

    //getItems is just a wrapper that we need to guard the List by always returning its copy.
    public List<String> getItems() {
        return new ArrayList<>(items);
    }

}


