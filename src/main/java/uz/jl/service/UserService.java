package uz.jl.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import uz.jl.repository.UserRepository;

@Component
public class UserService {

    private String string;

/*    @Autowired == @Inject
    @Qualifier("fakeUserRepository") == @Named
    private UserRepository userRepository;*/


    private final UserRepository userRepository;


    public UserService(@Qualifier("pRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}
