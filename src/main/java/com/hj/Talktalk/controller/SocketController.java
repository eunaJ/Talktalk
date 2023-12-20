package com.hj.Talktalk.controller;

import com.hj.Talktalk.domain.ChatMessageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class SocketController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chat/room")
    public void sendMessage(ChatMessageDto chatMessageDto, SimpMessageHeaderAccessor accessor) {
        simpMessagingTemplate.convertAndSend("/sub/chat/room" + chatMessageDto.getRoomId(), chatMessageDto);
    }



}
