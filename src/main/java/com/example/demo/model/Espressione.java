package com.example.demo.model;

import java.util.ArrayList;

public class Espressione {
    private String inputExpr;
    ArrayList tokensList;

    public Espressione(String inputExpr) {
        this.inputExpr = inputExpr;
    }

    public void scanner() {
        long numero = 0;
        boolean inLetturaNumero = false;
        for (char carattere : inputExpr.toCharArray()) {
            switch (carattere) {
                case '(':
                    tokensList.add(Parentesi.PARENTESI_APERTA);
                    break;
                case ')':
                    tokensList.add(Parentesi.PARENTESI_CHIUSA);
                    break;
                case '+':
                    tokensList.add(Operatore.ADD);
                    break;
                case '-':
                    tokensList.add(Operatore.SUB);
                    break;
                case '*':
                    tokensList.add(Operatore.MULT);
                    break;
                case '/':
                    tokensList.add(Operatore.DIV);
                    break;
                case '^':
                    tokensList.add(Operatore.POW);
                    break;
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    //TODO

                    //win-rate per sicurezza

                default:
                    //TODO lanciare exception

            }
        }
    }

    //public void ShuntingYard(){
    //    while(){
    //        if ()
    //    }
    //}
}