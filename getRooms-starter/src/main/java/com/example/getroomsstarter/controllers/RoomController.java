package com.example.getroomsstarter.controllers;

import com.example.getroomsstarter.dtos.GetRoomsRequestDto;
import com.example.getroomsstarter.dtos.GetRoomsResponseDto;
import com.example.getroomsstarter.dtos.ResponseStatus;
import com.example.getroomsstarter.models.Room;
import com.example.getroomsstarter.services.RoomService;

import java.util.List;

public class RoomController {
    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    public GetRoomsResponseDto getRooms(GetRoomsRequestDto requestDto) {
        return null;
    }
}
