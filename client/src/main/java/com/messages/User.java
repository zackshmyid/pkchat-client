package com.messages;

import java.io.Serializable;

/**
 * Create By : Zack_
 * Last Update : 26/12/2021
 */
public class User implements Serializable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    String name;

    public void getPicture(String picture){
        this.picture = picture;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    Status status;
    String picture;
}
