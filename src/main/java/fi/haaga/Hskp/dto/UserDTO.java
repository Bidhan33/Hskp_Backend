package fi.haaga.Hskp.dto;

import lombok.Data;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private String id;
    private String email;
    private String name;
    private String phoneNumber;
    private String role;
    private List<BookingDTO> bookings = new ArrayList<>();
}