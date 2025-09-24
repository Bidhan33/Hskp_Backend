package fi.haaga.Hskp.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import fi.haaga.Hskp.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

    boolean existsByEmail(String email);
    Optional<User> findByEmail(String  email);
}