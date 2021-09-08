package lld.design.usecases.librarymanagement.dao;

import lld.design.usecases.librarymanagement.dto.Booking;

import java.util.Date;
import java.util.List;

public interface BookingManager {

    void createBooking(Booking booking);

    Booking fetchBookingDetails(String bookingId);

    List<Booking> fetchBookedBookingsForUser(long userId, Date from, Date end);

    List<Booking> fetchBookedBookingsForRoom(long roomId, Date from, Date end);

    void updateBooking(Booking booking);

    void cancelBooking(String bookingId);

}
