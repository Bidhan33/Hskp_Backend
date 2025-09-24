package fi.haaga.Hskp.repo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import fi.haaga.Hskp.entity.Booking;

public interface BookingRepository extends MongoRepository<Booking, String> {


    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);

   
    @Query("{ 'checkInDate': { $lte: ?1 }, 'checkOutDate': { $gte: ?0 } }")
    List<Booking> findBookingsByDateRange(LocalDate checkInDate,  LocalDate checkOutDate);


}