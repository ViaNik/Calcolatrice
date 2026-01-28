package com.example.demo.model;

public enum Operatore {
    ADD('+'), SUB('-'), MULT('*'), DIV('/'), POW('^');
    private char simbolo;

    Operatore(char simbolo) {
        this.simbolo = simbolo;
    }
    @Override
    public String toString() {
        return Character.toString(simbolo);
    }
}
