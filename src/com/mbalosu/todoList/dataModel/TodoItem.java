package com.mbalosu.todoList.dataModel;

import java.time.LocalDate;

public class TodoItem {

    private String shortDescription;
    private String detail;
    private LocalDate deadLine;

    public TodoItem(String shortDescription, String detail, LocalDate deadLine) {
        this.shortDescription = shortDescription;
        this.detail = detail;
        this.deadLine = deadLine;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDetail() {
        return detail;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

}
