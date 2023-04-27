package org.example;

import java.util.*;

/**
 * Descrie obiecte de tip Token, care sunt numere cuprinse intre 1 si n^3.
 */
public class Token {
    private final int number;


    public Token(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Token " + number;
    }


}