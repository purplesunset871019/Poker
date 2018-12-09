package com.example.frank.poker;

public class Card {

    static char[] suits = {'\u2663', '\u2666', '\u2665', '\u2660'};
    int value;

    public Card(int value){
        this.value = value;
    }

    public String get(){

        int symbol = value%13+1;
        String result = (symbol==10)? " ": " ";
        switch (value % 13 + 1) {
            case 1:
                return " A"+result+ suits[value / 13];
            case 11:
                return " J"+result + suits[value / 13];
            case 12:
                return " Q"+result + suits[value / 13];
            case 13:
                return " K"+result + suits[value / 13];
            default:
                return symbol+result + suits[value / 13];
        }
    }
}
