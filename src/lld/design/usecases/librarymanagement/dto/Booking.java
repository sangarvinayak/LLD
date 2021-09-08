package lld.design.usecases.librarymanagement.dto;

import lld.design.usecases.librarymanagement.dto.enums.BookingStatus;

import java.util.Date;

public class Booking {

    private final long bookingId;
    private final long customerId;
    private long roomId;
    private double price;
    private Date fromDate;
    private Date toDate;
    private BookingStatus bookingStatus;


    public Booking(long bookingId, long customerId, long roomId, double price, Date fromDate, Date toDate) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.roomId = roomId;
        this.price = price;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.bookingStatus = BookingStatus.BOOKED;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public long getBookingId() {
        return bookingId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public long getRoomId() {
        return roomId;
    }

    public double getPrice() {
        return price;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }
}
