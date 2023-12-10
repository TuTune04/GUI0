package com.example.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.time.LocalDateTime;

public class Controller {
    private final String sender;
    private final String content;
    private final LocalDateTime timestamp;

    public Controller(String sender, String content, LocalDateTime timestamp) {
        this.sender = sender;
        this.content = content;
        this.timestamp = timestamp;
    }

    // Getters
    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}