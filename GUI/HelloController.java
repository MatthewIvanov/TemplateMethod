package com.example.networkgui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Button input;
    @FXML
    private TextField Message;

    @FXML
    private TextField login;

    @FXML
    private TextField password;

    @FXML
    private Button tg;

    @FXML
    void TelegramInput(MouseEvent event) {
        Network  tg = new Telegram(login.getText(),password.getText());
        Text text = new Text("LogIn success on Telegram");
    }
    @FXML
    void DoPost(MouseEvent event) {
        Text text = new Text(Message.getText());
    }
}