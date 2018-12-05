package com.example.frank.poker;

public class Card {

    static char[] suits = {'c','d','h','s'};
    int value;

    public Card(int value){
        this.value = value;
    }

    public String get(){

        return value%13+1 + "" + suits[value/13];

        /*int symbol = value%13+1;
        String result = (symbol<10)? " ": " ";
        result = result+symbol;
        return result+suits[value/13];*/
    }
}
