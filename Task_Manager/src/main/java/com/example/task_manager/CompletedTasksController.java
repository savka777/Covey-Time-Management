package com.example.task_manager;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class CompletedTasksController {

    @FXML
    private ListView<String> completedTasksListView;

    public void setCompletedTasks(ObservableList<String> completedTasks) {
        completedTasksListView.setItems(completedTasks);
    }

    @FXML
    void closeWindow(ActionEvent event) {
        Stage stage = (Stage) completedTasksListView.getScene().getWindow();
        stage.close();
    }
}
