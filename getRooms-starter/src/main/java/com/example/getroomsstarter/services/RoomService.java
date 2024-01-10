package com.example.getroomsstarter.services;

import com.example.getroomsstarter.models.Room;

import java.util.List;

public interface RoomService {
    List<Room> getRooms(String roomType);
}
