package com.example.getroomsstarter.repositories;

import com.example.getroomsstarter.models.Room;
import com.example.getroomsstarter.models.RoomType;

import java.util.List;

public interface RoomRepository {
    Room add(Room room);
    List<Room> getRooms();
    List<Room> getRoomsByRoomType(RoomType roomType);
    Room save(Room room);
}
