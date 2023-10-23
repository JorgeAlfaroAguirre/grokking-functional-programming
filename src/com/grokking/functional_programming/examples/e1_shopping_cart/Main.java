package com.grokking.functional_programming.examples.e1_shopping_cart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    //Requirements: Shopping cart
    //1. Any item (modeled as a String) can be added to the cart.
    //2. If any book has been added to the cart, the discount is 5%.
    //3. If no book has been added, the discount is 0%.
    //4. Items in the cart can be accessed at any time.
    public static void main(String[] args) {

        //ShoppingCartImperative

        ShoppingCartImperative shoppingCartImperative= new ShoppingCartImperative();

        shoppingCartImperative.addItem("Tomato");
        shoppingCartImperative.addItem("Book");

        System.out.println(shoppingCartImperative.getDiscountPercentage());

        shoppingCartImperative.addItem("Tomato");

        //ShoppingCartDeclarative

        ShoppingCartDeclarative shoppingCartDeclarative = new ShoppingCartDeclarative();

        List<String> cartItems = new ArrayList<String>(Arrays.asList("Tomato", "Carrot", "Onion"));

        int discountPercentage = 0;

        discountPercentage = shoppingCartDeclarative.getDiscountPercentage(cartItems);

        System.out.println("Discount Percentage: " + discountPercentage);

        cartItems.add("Book");

        discountPercentage = shoppingCartDeclarative.getDiscountPercentage(cartItems);

        System.out.println("Discount Percentage: " + discountPercentage);

        cartItems.remove("Book");

        discountPercentage = shoppingCartDeclarative.getDiscountPercentage(cartItems);

        System.out.println("Discount Percentage: " + discountPercentage);
    }
}
