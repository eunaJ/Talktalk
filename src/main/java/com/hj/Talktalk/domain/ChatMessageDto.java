package com.hj.Talktalk.domain;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChatMessageDto {
    // 채팅방 정보
    private Long roomId;
    private String writer;
    private String message;
    // 작성 일자
    private String createdAt;
    private List<String> userList;
    // 0: 접속, 1:퇴장
    private Integer state;

//    public Chat toChat(ChatRoom chatRoom){
//        return Chat.builder().message(message)
//                .writer(writer)
//                .chatRoom(chatRoom)
//                .isChecked(false)
//                .build();
//    }

    public Long getRoomId() {
        return roomId;
    }
}