package com.hj.Talktalk.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ChatRoom {
    private long roomId;
    private String name;
    private LocalDateTime deletedAt;

    private Member member;

    //private List<ChatConfigEntity> chatConfigEntities = new ArrayList<>();

    public Long getRoomId(){return roomId;}
    public String getName(){return name;}
    public LocalDateTime getDeletedAt(){return deletedAt;}
}
