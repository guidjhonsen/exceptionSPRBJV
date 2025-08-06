package com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.models;

import java.util.Date;

public class Error {
    private Date date;
    private String error;
    private String message;
    private int status;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
