package com.example.task_manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class MainController {

    @FXML
    private TextField taskInput;

    @FXML
    private ListView<String> quadrant1ListView;

    @FXML
    private ListView<String> quadrant2ListView;

    @FXML
    private ListView<String> quadrant3ListView;

    @FXML
    private ListView<String> quadrant4ListView;

    @FXML
    private CheckBox importance1, importance2, importance3, importance4;

    @FXML
    private CheckBox urgency1, urgency2, urgency3, urgency4;

    @FXML
    void addTask(ActionEvent event) {
        String task = taskInput.getText();

        int importance = -1;
        if (importance1.isSelected()) importance = 1;
        else if (importance2.isSelected()) importance = 2;
        else if (importance3.isSelected()) importance = 3;
        else if (importance4.isSelected()) importance = 4;

        int urgency = -1;
        if (urgency1.isSelected()) urgency = 1;
        else if (urgency2.isSelected()) urgency = 2;
        else if (urgency3.isSelected()) urgency = 3;
        else if (urgency4.isSelected()) urgency = 4;

        if (importance > 2 && urgency > 2) {
            quadrant1ListView.getItems().add(task);
        } else if (importance > 2 && urgency <= 2) {
            quadrant2ListView.getItems().add(task);
        } else if (importance <= 2 && urgency > 2) {
            quadrant3ListView.getItems().add(task);
        } else {
            quadrant4ListView.getItems().add(task);
        }

        taskInput.clear();
        importance1.setSelected(false);
        importance2.setSelected(false);
        importance3.setSelected(false);
        importance4.setSelected(false);
        urgency1.setSelected(false);
        urgency2.setSelected(false);
        urgency3.setSelected(false);
        urgency4.setSelected(false);
    }
}
