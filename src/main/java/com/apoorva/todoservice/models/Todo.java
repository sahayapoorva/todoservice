package com.apoorva.todoservice.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Todo {
    @Id
    private ObjectId _id;
    private String description;
    private boolean completed;

    public Todo(ObjectId _id, String description, boolean completed) {
        this._id = _id;
        this.description = description;
        this.completed = completed;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
