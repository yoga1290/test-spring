package com.example.demo.dto;

public class Result {

    private String message;
    private String status;

    public Result(String message) {
        this.message = message;
        this.status = "success";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
