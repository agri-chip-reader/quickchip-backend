package business;

import business.customexceptions.UnauthorizedException;
import data.entities.User;
import data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class AdminService {
    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public void authorize(User user){
        if(user==null)
            throw new UnauthorizedException();

        Optional<User> userOptional = userRepository.findUserByEmailAndPassword(user.getEmail(), user.getPassword());

        if(userOptional.isEmpty())
            throw new UnauthorizedException();
    }
}
