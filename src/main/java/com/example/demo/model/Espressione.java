package com.example.demo.model;

import java.util.ArrayList;
import java.util.Objects;

public class Espressione {
    private String inputExpr;
    ArrayList tokensList;
    ArrayList stack= new ArrayList<>();

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
                    //int n= 0;
                    //tokensList.add(n);
                    //break;
                    //Per sicurezza

                default:
                    //TODO lanciare exception

            }
        }
    }

    public void ShuntingYard(){
        for (Object token: tokensList){
            //se numero
            if (token instanceof Float){
                stack.add(token);
            }
            //prova
            //se operatore
            if(token== Operatore.ADD || token== Operatore.SUB || token== Operatore.MULT || token== Operatore.DIV || token== Operatore.POW){
                while (!stack.isEmpty()){

                }
            }
            //parentesi
            if(tokensList.get(i)== Parentesi.PARENTESI_APERTA){

            }
            if(tokensList.get(i)== Parentesi.PARENTESI_CHIUSA){
                while (){

                }
            }
        }
        //Finiti token da leggere

        while (){

        }
    }
}

//token== Operatore.ADD || token== Operatore.SUB || token== Operatore.MULT || token== Operatore.DIV || token== Operatore.POW