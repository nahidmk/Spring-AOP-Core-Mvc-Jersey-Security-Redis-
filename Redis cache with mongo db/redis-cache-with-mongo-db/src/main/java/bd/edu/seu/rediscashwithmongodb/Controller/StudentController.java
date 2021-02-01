package bd.edu.seu.rediscashwithmongodb.Controller;

import bd.edu.seu.rediscashwithmongodb.Model.Student;
import bd.edu.seu.rediscashwithmongodb.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/post")
    public Student saveStudent( @RequestBody  Student student)
    {
        return studentService.SaveStudent(student);
    }
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable long id )
    {
        return studentService.getStudent(id);
    }

    @DeleteMapping("/{id}")
    public Student DeleteStudent(@PathVariable long id)
    {
        return studentService.DeleteStudent(id);
    }

    @GetMapping("")
    public List<Student> findAll( )
    {
        return studentService.findAll();
    }


    @PutMapping("/put")
    public Student UpdateStudent(@RequestBody Student student)
    {
        return studentService.UpdateStudent(student);
    }
}
