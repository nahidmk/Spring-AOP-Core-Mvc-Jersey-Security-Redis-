package bd.edu.seu.rediscashwithmongodb.Service;

import bd.edu.seu.rediscashwithmongodb.Model.Course;
import bd.edu.seu.rediscashwithmongodb.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course SaveCourse(Course course)
    {
        courseRepository.save(course);
        Course course1 = courseRepository.findByCourseCode(course.getCourseCode());
        return course1;
    }

    public List<Course> FindAllCourse()
    {
        return courseRepository.findAll();
    }

    @CachePut(cacheNames = "Course",key = "#course.courseCode")
    public Optional<Course> UpdateCourse(Course course)
    {
        courseRepository.save(course);
        return courseRepository.findById(course.getCourseCode());
    }

    @Cacheable(cacheNames = "Course",key = "#courseCode")
    public Optional<Course> getCourseByCourseCode(String courseCode)
    {
        return courseRepository.findById(courseCode);
    }

    @CacheEvict(cacheNames = "Course", key = "#courseCode")
    public Optional<Course> DeleteCourse(String courseCode)
    {
        Optional<Course> course1 = courseRepository.findById(courseCode);
        courseRepository.deleteById(courseCode);
        return course1;
    }
}
