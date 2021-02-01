package bd.edu.seu.rediscashwithmongodb.Repository;

import bd.edu.seu.rediscashwithmongodb.Model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends MongoRepository<Course,String> {
    Course findByCourseCode(String courseCode);
}
