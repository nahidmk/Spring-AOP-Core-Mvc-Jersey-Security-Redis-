package bd.edu.seu.rediscashwithmongodb.Controller;

import bd.edu.seu.rediscashwithmongodb.Model.Teacher;
import bd.edu.seu.rediscashwithmongodb.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/teacher")
    public Teacher save_teacher( @RequestBody Teacher teacher)
    {
        return teacherService.saveTeacher(teacher);
    }

    @PutMapping("/teacher")
    public Teacher update_teacher(@RequestBody Teacher teacher)
    {
        return teacherService.update_teacher(teacher);
    }

    @GetMapping("/teacher")
    public List<Teacher> Find_all()
    {
        return teacherService.find_all();
    }

    @GetMapping("/teacher/{id}")
    public Teacher get_by_id(@PathVariable long id)
    {
        return teacherService.get_teacher_by_id(id);
    }

    @DeleteMapping("/")
    public Teacher delete_by_id(@PathVariable long id)
    {
        return teacherService.delete_teacher(id);
    }
}
