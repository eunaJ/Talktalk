package com.hj.Talktalk.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatRoomDto {
    private Long roomId;
    private String name;
    private Long crewId;

    public static List<ChatRoomDto> createList(List<ChatRoom> list){
        List<ChatRoomDto> result = new ArrayList<>();
        for(ChatRoom chatRoom : list){
            result.add(ChatRoomDto.builder().roomId(chatRoom.getRoomId())
                    .name(chatRoom.getName())
                    .build());
        }
        return result;
    }

//    public ChatRoom of(Member member){
//        return ChatRoom.builder().name(name).user(member).build();
//    }
}
