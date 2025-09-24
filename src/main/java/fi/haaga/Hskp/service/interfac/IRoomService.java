package fi.haaga.Hskp.service.interfac;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import fi.haaga.Hskp.dto.Response;

public interface IRoomService {

    Response addNewRoom( String roomType, BigDecimal roomPrice, String description);

    List<String> getAllRoomTypes();

    Response getAllRooms();

    Response deleteRoom(String roomId);

    Response updateRoom(String roomId, String description, String roomType, BigDecimal roomPrice);

    Response getRoomById(String roomId);

    Response getAvailableRoomsByDateAndType(LocalDate checkInDate, LocalDate checkOutDate, String roomType);

    Response getAllAvailableRooms();
}