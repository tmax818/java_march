package tyler.loginreg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import tyler.loginreg.models.LoginUser;
import tyler.loginreg.models.User;
import tyler.loginreg.repositories.UserRepository;
    

    
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
    	// TO-DO - Reject values or register if no errors:
        
        //! Reject if email is taken (present in database)
        
        //! Reject if password doesn't match confirmation
        
        //! Return null if result has errors
    
        //! Hash and set password, save user to database
        return null;
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
        // TO-DO: Additional validations!
        return null;
    }
}

