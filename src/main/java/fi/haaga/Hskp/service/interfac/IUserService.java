package fi.haaga.Hskp.service.interfac;

import fi.haaga.Hskp.dto.LoginRequest;
import fi.haaga.Hskp.dto.Response;
import fi.haaga.Hskp.entity.User;

public interface IUserService {

    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUSerBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}