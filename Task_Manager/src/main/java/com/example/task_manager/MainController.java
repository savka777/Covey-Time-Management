package com.example.task_manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField taskInput;

    @FXML
    private TextField importanceInput;

    @FXML
    private TextField urgencyInput;

    @FXML
    private ListView<String> quadrant1ListView;

    @FXML
    private ListView<String> quadrant2ListView;

    @FXML
    private ListView<String> quadrant3ListView;

    @FXML
    private ListView<String> quadrant4ListView;

    @FXML
    void addTask(ActionEvent event) {
        String task = taskInput.getText();
        int importance = Integer.parseInt(importanceInput.getText());
        int urgency = Integer.parseInt(urgencyInput.getText());

        if (importance >= 3 && urgency >= 3) {
            quadrant1ListView.getItems().add(task);
        } else if (importance >= 3 && urgency < 3) {
            quadrant2ListView.getItems().add(task);
        } else if (importance < 3 && urgency >= 3) {
            quadrant3ListView.getItems().add(task);
        } else {
            quadrant4ListView.getItems().add(task);
        }

        taskInput.clear();
        importanceInput.clear();
        urgencyInput.clear();
    }
}
