package fi.haaga.Hskp.repo;


import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import fi.haaga.Hskp.entity.Room;

public interface RoomRepository extends MongoRepository<Room, String> {

    @Aggregation("{ $group: { _id: '$roomType'} }") //get all rooms types base on their uniqueness
    List<String> findDistinctRoomType();

    @Query("{ 'bookings': {$size: 0 } }") //find room that has no bookings
    List<Room> findAllAvailableRooms();

    List<Room> findByRoomTypeLikeAndIdNotIn(String roomType, List<String> bookedRoomIds);
}