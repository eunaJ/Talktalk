package com.hj.Talktalk.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private String id;
    private String name;
    private String password;
    private LocalDateTime deletedAt;


    private List<ChatRoom> chatRooms = new ArrayList<>();





    public String getId() {
        return id;
    }
    public void setId(String userId) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
