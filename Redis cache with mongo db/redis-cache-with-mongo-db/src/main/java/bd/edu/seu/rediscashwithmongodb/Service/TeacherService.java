package bd.edu.seu.rediscashwithmongodb.Service;

import bd.edu.seu.rediscashwithmongodb.Model.Teacher;
import bd.edu.seu.rediscashwithmongodb.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher saveTeacher(Teacher teacher)
    {
        teacherRepository.save(teacher);
        return teacherRepository.findById(teacher.getId());
    }

    public List<Teacher> find_all()
    {
        return teacherRepository.findAll();
    }

    @Cacheable(cacheNames = "Teacher",key = "#id")
    public Teacher get_teacher_by_id(long id)
    {
        return teacherRepository.findById(id);
    }

    @CachePut(cacheNames = "Teacher", key = "#teacher.id")
    public Teacher update_teacher(Teacher teacher)
    {
        teacherRepository.save(teacher);
        return teacherRepository.findById(teacher.getId());
    }

    @CacheEvict(cacheNames = "Teacher", key = "#id")
    public Teacher delete_teacher(long id)
    {
        Teacher teacher  = teacherRepository.findById(id);
        teacherRepository.deleteById(id);
        return teacher;
    }
}
