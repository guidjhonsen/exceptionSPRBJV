package com.guidjhonsen.curso.springboot.error.springbooterror.springboot_error.models;

import java.sql.Date;

public class Error {
    private String message;
    private String error;
    private String status;
    private Date date;
    
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    
    
}
