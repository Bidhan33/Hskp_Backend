package fi.haaga.Hskp.service.interfac;

import fi.haaga.Hskp.dto.Response;
import fi.haaga.Hskp.entity.Booking;

public interface IBookingService {

    Response saveBooking(String rooId, String userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(String bookingId);
}