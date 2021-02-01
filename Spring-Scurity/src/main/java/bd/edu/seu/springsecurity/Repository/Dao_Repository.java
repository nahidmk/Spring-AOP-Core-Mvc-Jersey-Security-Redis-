package bd.edu.seu.springsecurity.Repository;

import bd.edu.seu.springsecurity.Model.user_pass;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao_Repository extends MongoRepository<user_pass, Long> {

    user_pass findByUserName (String name);
}
