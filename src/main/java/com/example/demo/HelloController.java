package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class HelloController {
    private int cursore= 0;

    @FXML
    private TextField display;

    @FXML
    public void onclick(ActionEvent e) {
        Button b= (Button) e.getSource();
        display.appendText(b.getText());
        cursore++;
    }

    @FXML
    public void onKeypress(KeyEvent e){
        cursore++;
        String testo= e.getText();
        if(e.isShiftDown()){
            if(testo.matches("7")) {
                display.appendText("/");
                return;
            } else if(testo.matches("8")){
                display.appendText("(");
                return;
            } else if (testo.matches("9")) {
                display.appendText(")");
                return;
            } else if (testo.matches("ì")) {
                display.appendText("^");
                return;
            } else if (testo.matches("[+]")) {
                display.appendText("*");
                return;
            }
        }


        if(testo.matches("[0-9+[-]*/.]")){
            display.appendText(testo);
        }
        //display.setEditable(false);
        KeyCode altro= e.getCode();
        switch (altro){
            case BACK_SPACE:
                cancUno();
                cursore-= 2;
                break;
            case DELETE:
                clear();
                cursore= 0;
                break;
            case LEFT:
                cursore-= 2;
                break;
            case RIGHT:
                break;
        }
    }

    @FXML
    public void clear(){
        display.clear();
        cursore= 0;
    }

    @FXML
    public void cancUno(){
        String testo= display.getText();
        display.setText(testo.substring(0, testo.length()-1));
        cursore--;
    }


}
