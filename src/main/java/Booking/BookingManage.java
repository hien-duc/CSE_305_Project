package Booking;

import DAO.BookingDAO;
import java.util.ArrayList;

public class BookingManage {

    //Data members
    BookingDAO bookingDao = new BookingDAO();
    ArrayList<Booking> listBooking = bookingDao.restoreDataFromChar();
    private int numOfBooking = listBooking.size();

    public BookingManage() {

    }

    public ArrayList<Booking> getListBooking() {
        return listBooking;
    }

    public void setListBooking(ArrayList<Booking> listBooking) {
        this.listBooking = listBooking;
    }

    public boolean addBooking(Booking booking) {
        if (booking != null) {
            listBooking.add(booking);
            numOfBooking++;
            bookingDao.saveDataByChar(listBooking);
            return true;
        }
        return false;
    }
}
