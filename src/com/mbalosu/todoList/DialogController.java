package com.mbalosu.todoList;

import com.mbalosu.todoList.dataModel.ToDoData;
import com.mbalosu.todoList.dataModel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;
import java.time.LocalDate;

public class DialogController {

    @FXML
    private DatePicker deadlinePicker;

    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    public TodoItem processResult(){
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadline = deadlinePicker.getValue();

        TodoItem newItem = new TodoItem(shortDescription, details, deadline);
        ToDoData.getInstance().addTodoItem(new TodoItem(shortDescription, details, deadline));
        return newItem;
    }
}
