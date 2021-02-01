package bd.edu.seu.rediscashwithmongodb.Repository;

import bd.edu.seu.rediscashwithmongodb.Model.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends MongoRepository<Teacher,Long> {
    Teacher findById(long id);
}
