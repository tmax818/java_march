package tyler.loginreg.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import tyler.loginreg.models.User;

// .. imports .. //
    

public interface UserRepository extends CrudRepository<User, Long> {
    
    Optional<User> findByEmail(String email);
    
}

