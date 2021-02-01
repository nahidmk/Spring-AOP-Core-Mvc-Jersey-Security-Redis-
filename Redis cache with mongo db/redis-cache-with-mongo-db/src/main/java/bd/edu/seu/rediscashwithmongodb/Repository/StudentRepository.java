package bd.edu.seu.rediscashwithmongodb.Repository;

import bd.edu.seu.rediscashwithmongodb.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, Long> {
    Student findById(long id);
}
