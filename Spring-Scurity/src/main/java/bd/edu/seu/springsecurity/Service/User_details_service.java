package bd.edu.seu.springsecurity.Service;

import bd.edu.seu.springsecurity.Model.user_pass;
import bd.edu.seu.springsecurity.Repository.Dao_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class User_details_service implements UserDetailsService {

    @Autowired
    private Dao_Repository repository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println("userName : " +s );
        user_pass userpass = repository.findByUserName(s);
        System.out.println(userpass);
        if(userpass ==null)
        {
            throw new UsernameNotFoundException("User 404");
        }

        return new User_principal(userpass);
    }
}
