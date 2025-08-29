package com.example.Full.Stack.Project.dto;

import java.util.List;

public class RequestPayload {

    private List<String> data;

    // Getters and Setters are necessary for JSON deserialization
    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
