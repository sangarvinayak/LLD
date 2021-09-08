package lld.design.usecases.librarymanagement.dao;

import lld.design.usecases.librarymanagement.dto.Room;
import lld.design.usecases.librarymanagement.dto.enums.RoomStatus;
import lld.design.usecases.librarymanagement.dto.enums.RoomType;

import java.util.Date;
import java.util.List;

public interface RoomManager {

    void addRoom(Room room);

    List<Room> searchAvailableRoomsForAType(
            RoomType type, Date fromDate, Date toDate);

    Boolean isRoomAvailableOnDate(long roomId, Date fromDate, Date toDate);

    Boolean isRoomCurrentlyAvailable(long roomId);

    List<Room> fetchAllRoomsForAType(
            RoomType type, Date fromDate, Date toDate);

    Double fetchRoomPrice(String roomId);
    Double fetchRoomServices(String roomId);
    RoomType fetchRoomType(String roomId);
    RoomStatus fetchRoomCurrentStatus(String roomId);

    List<Long> fetchUsersInRoom(String roomId, Date fromDate, Date toDate);

    void checkInRoom(long userId, long roomId);

    void checkOutRoom(long userId, long roomId);

    void updateRoomDetails(Room room);

    void removeRoom(long roomId);

}
