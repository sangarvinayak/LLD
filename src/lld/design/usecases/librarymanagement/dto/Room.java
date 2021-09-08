package lld.design.usecases.librarymanagement.dto;

import lld.design.usecases.librarymanagement.dto.enums.RoomStatus;
import lld.design.usecases.librarymanagement.dto.enums.RoomType;

public class Room {

    private final long roomId;
    private RoomType roomType;
    private RoomStatus roomStatus;

    public Room(long roomId, RoomType roomType) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.roomStatus = RoomStatus.AVAILABLE;
    }

    public long getRoomId() {
        return roomId;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }
}
