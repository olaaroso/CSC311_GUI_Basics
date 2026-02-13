package com.example.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OlamideController {
    @FXML
    private Label olamideText;

    @FXML
    protected void onHelloButtonClick() {
        olamideText.setText("You clicked the button!");
    }
}
