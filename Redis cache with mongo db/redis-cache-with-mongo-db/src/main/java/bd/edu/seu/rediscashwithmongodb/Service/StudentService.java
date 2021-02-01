package bd.edu.seu.rediscashwithmongodb.Service;

import bd.edu.seu.rediscashwithmongodb.Model.Student;
import bd.edu.seu.rediscashwithmongodb.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student SaveStudent(Student student)
    {
        studentRepository.save(student);
        return studentRepository.findById(student.getId());
    }

    @Cacheable(cacheNames = "Students",key = "#id")
    public Student getStudent(long id)
    {
        System.out.println("From DB");
        return studentRepository.findById(id);
    }

    @CachePut(cacheNames = "Students", key = "#student.id")
    public Student UpdateStudent(Student student)
    {
        System.out.println("DB");
        studentRepository.save(student);
        return studentRepository.findById(student.getId());
    }

    public List<Student> findAll()
    {
        return studentRepository.findAll();
    }

    @CacheEvict(cacheNames = "Students",key = "#id")
    public Student DeleteStudent(long id)
    {
        System.out.println("from DB");
        Student student = studentRepository.findById(id);
        studentRepository.delete(student);
        return student;
    }
}
